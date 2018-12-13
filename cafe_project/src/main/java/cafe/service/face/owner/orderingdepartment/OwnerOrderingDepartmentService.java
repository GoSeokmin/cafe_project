package cafe.service.face.owner.orderingdepartment;

import java.util.List;

import cafe.dto.Cafe_ordering_department;

public interface OwnerOrderingDepartmentService {

	// 1. 발주처 목록 조회
	
	// 1-1. 발주처 목록
	List<Cafe_ordering_department> getOrderingDepartmentList(Cafe_ordering_department coDept);

	// 1-2. 발주처 비고 상세보기 및 수정할 때 하나의 발주처 내용 가져오기 
	Cafe_ordering_department getOneOrderingDepartment(Cafe_ordering_department coDept);

	
}