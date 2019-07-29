package com.laptrinhweb.service;

import com.laptrinhweb.dto.BuildingDTO;

public interface IBuildingService {
	BuildingDTO save(BuildingDTO newBuilding);
	BuildingDTO update(BuildingDTO newBuilding);
	
}
