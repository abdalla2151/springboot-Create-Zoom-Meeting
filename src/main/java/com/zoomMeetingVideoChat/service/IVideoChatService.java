package com.zoomMeetingVideoChat.service;

import java.util.Optional;

import com.zoomMeetingVideoChat.component.dto.ZoomMeetingObjectDTO;
import com.zoomMeetingVideoChat.component.dto.ZoomMeetingsListResponseDTO;

public interface IVideoChatService {

	public ZoomMeetingsListResponseDTO listMeetings(Optional<String> userIdOrEmail, Optional<String> meetingType);

	public ZoomMeetingObjectDTO getZoomMeetingById(String meetingId);

	public ZoomMeetingObjectDTO createMeeting(ZoomMeetingObjectDTO zoomMeetingObjectDTO);

	public String generateZoomJWTTOken();
}
