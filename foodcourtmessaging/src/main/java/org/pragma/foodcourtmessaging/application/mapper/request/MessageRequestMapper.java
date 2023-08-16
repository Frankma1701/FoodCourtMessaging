package org.pragma.foodcourtmessaging.application.mapper.request;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pragma.foodcourtmessaging.application.dto.request.MessageRequest;
import org.pragma.foodcourtmessaging.domain.model.MessageNotification;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface MessageRequestMapper{
    MessageNotification toMessage(MessageRequest messageRequest);
    MessageRequest toMessageRequest(MessageNotification message);
}
