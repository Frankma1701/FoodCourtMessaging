package org.pragma.foodcourtmessaging.application.mapper.response;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pragma.foodcourtmessaging.application.dto.response.MessageResponse;
import org.pragma.foodcourtmessaging.domain.model.MessageNotification;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface MessageResponseMapper{
    MessageResponse toResponse(MessageNotification message);

}
