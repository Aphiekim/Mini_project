package TripPackage.Manager;

import java.util.ArrayList;

import TripPackage.VO.TripVO;

public interface AbstractTripManager {
	
	public TripVO searchID(String id);
	
	public TripVO searchPW(String passWord);
	
	public TripVO searchName(String name);
	
	public TripVO searchPhone(String phone);
	
	public ArrayList<TripVO> showlist();
	
	public boolean nameList(String name);
	
	public boolean ageList(String age);
	
	public boolean insertVO(TripVO vo);

	public boolean deleteVO(String id, String passWord);

	public void updatePW(String passWord, String passWord2);
	
	


}
