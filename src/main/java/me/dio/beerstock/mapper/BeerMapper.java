package me.dio.beerstock.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import me.dio.beerstock.dto.BeerDTO;
import me.dio.beerstock.entity.Beer;

@Mapper
public interface BeerMapper {
	
	   BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

	    Beer toModel(BeerDTO beerDTO);

	    BeerDTO toDTO(Beer beer);

}
