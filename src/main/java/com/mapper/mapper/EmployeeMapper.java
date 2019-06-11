package com.mapper.mapper;

import com.mapper.domain.Employee;
import com.mapper.dto.EmployeeDTO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

/**
 * @author : Tamilmani
 * @version : 1.0
 * @since : 11-06-2019 23:32
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface EmployeeMapper {

    //EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    /*@Mapping(source = "firstName", target = "empName")
    @Mapping(source = "age", target = "empAge")
    @Mapping(source = "sex", target = "empSex")
    EmployeeDTO domainToDTO(Employee employee);*/

    @Mappings({@Mapping(source = "empName", target = "firstName", defaultValue = "Tamilmani"),
            @Mapping( target = "lastName", expression = "java(new java.lang.String(\"Muthusamy\"))"),
            @Mapping(source = "empAge", target = "age"),
            @Mapping(source = "empSex", target = "sex")
    })
    Employee dtoToDomain(EmployeeDTO employeeDTO);

    @InheritInverseConfiguration
    EmployeeDTO domainToDTO(Employee employee);

}
