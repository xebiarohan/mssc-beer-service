package com.springtutorials.msscbeerservice.web.mapper;

import com.springtutorials.msscbeerservice.domain.Beer;
import com.springtutorials.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
