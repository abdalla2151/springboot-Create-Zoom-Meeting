package com.zoomMeetingVideoChat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoomMeetingVideoChat.component.dto.ZoomMeetingObjectDTO;
import com.zoomMeetingVideoChat.service.IVideoChatService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/videoChat")
//@CrossOrigin(origins = { "${settings.cors_origin.public}", "${settings.cors_origin.business}" })
public class VideoChatController {

	@Autowired
	IVideoChatService videoChatService;

//	public ResponseEntity createRequest(@RequestHeader(value = "Authorization") String accessTokenResponse,
//			@RequestBody RequestDTO requestDto)
	@PostMapping("/meeting")
	public ResponseEntity createRequest() {

		ZoomMeetingObjectDTO zoomMeetingObjectDTO = new ZoomMeetingObjectDTO();
		ZoomMeetingObjectDTO zoomMeetingObjectDTO2 = videoChatService.createMeeting(zoomMeetingObjectDTO);

		if (zoomMeetingObjectDTO2 != null) {

			return ResponseEntity.ok().body(zoomMeetingObjectDTO2);
		} else {
			return ResponseEntity.ok().body("error get zoomMeetingObjectDTO.");
		}
	

//		String accessTokenBody = getAccessTokenBody(accessTokenResponse);
//		if (accessTokenBody != null) {
//
//			JSONObject jsonAccessToken = new JSONObject(accessTokenBody);
//			String username = jsonAccessToken.getString(PREFERRED_USERNAME);
//			if (username != null) {
//
//				SaveRequestDTO saveRequestDto = requestService.saveRequest(username, requestDto, 0);
//
//				if (saveRequestDto != null) {
//
//					return ResponseEntity.ok().body(saveRequestDto);
//				} else {
//					return ResponseEntity.ok().body(ERROR_COMPLETING_THE_REQUEST);
//				}
//
//			} else {
//				return ResponseEntity.ok().body(ERROR_COMPLETING_THE_REQUEST);
//			}
//
//		} else {
//			return ResponseEntity.ok().body(ACCESS_TOKEN_BODY_ERROR_MSG);
//		}

	}

}
