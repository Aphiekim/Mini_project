package TripPackage.Manager;

import java.util.ArrayList;

import TripPackage.VO.TripVO;

public class TripManager implements AbstractTripManager {

	private ArrayList<TripVO> list;

	public TripManager() {
		list = new ArrayList<TripVO>();
	}

	@Override
	public TripVO searchID(String id) {
		TripVO search = null;
		for (int i = 0; i < list.size(); i++) {
			search = list.get(i);
			if (search.getId().equals(id)) {
				return search;
			}
		}
		return null;
	}
	public TripVO searchPW(String passWord) {
		TripVO search = null;
		for (int i = 0; i < list.size(); i++) {
			search = list.get(i);
			if (search.getPassWord().equals(passWord)) {
				return search;
			}
		}
		return null;
	}
	@Override
	public TripVO searchName(String name) {
		TripVO search = null;
		for (int i = 0; i < list.size(); i++) {
			search = list.get(i);
			if (search.getName().equals(name)) {
				return search;
			}
		}

		return null;
	}

	public TripVO searchPhone(String phone) {
		TripVO findPhone = null;
	
		for (int i = 0; i < list.size(); i++) {
			findPhone = list.get(i);
			if (findPhone.getPhone().equals(phone)) {
				return findPhone;
			}
		}
		return null;
	}

	public ArrayList<TripVO> showlist() {
		return list;

	}

	public boolean nameList(String name) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				System.out.println(list.get(i));
				return true;
			}
		}
		return false;
	}

	public boolean ageList(String age) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAge().equals(age)) {
				System.out.println(list.get(i));
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean insertVO(TripVO vo) {
		if (searchID(vo.getId()) != null) {
			return false;
		}
		list.add(vo);
		return true;
	}

	@Override
	public boolean deleteVO(String id, String passWord) {
		// TripVO tripVO = null;
//		String phone = null;

		for (int i = 0; i < list.size(); i++) {
			// tripVO = list.get(i);
			if (list.get(i).getId().equals(id) && list.get(i).getPassWord().equals(passWord)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	public void updatePW(String passWord, String passWord2) {
		searchPW(passWord).setPassWord(passWord2);
	}

	public void updatePhone(String password, String phone) {
		searchPW(password).setPhone(phone);
	}
	
	public void updateAge(String passWord, String age) {
	      searchPW(passWord).setAge(age);
	 }
}
