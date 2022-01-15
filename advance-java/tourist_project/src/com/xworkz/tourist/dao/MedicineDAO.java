package com.xworkz.tourist.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tourist.entity.MedicineEntity;

public interface MedicineDAO {
public void put(MedicineEntity entity);
public void putAll(List<MedicineEntity> medicineEntity);
}
