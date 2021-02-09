package TripPackage.UI;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import TripPackage.Manager.TripManager;
import TripPackage.VO.TripVO;

public class TripUI {
	Scanner scan = new Scanner(System.in);
	TripManager manager = new TripManager();

	public TripUI() {
		int mainNum = 0;

		while (true) {
			mainMenu();
			mainNum = scan.nextInt();

			switch (mainNum) {

			case 1:
				add();
				break;
			case 2:
				login();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				care();
				break;
			case 6:
				exit();
				break;
			default:
				System.out.println("[오류] 잘못입력하셨습니다. 다시 입력하세요.");
				break;
			}
		}
	}

	public void mainMenu() {
		System.out.println("[ Welcome, Traveler ]");
		System.out.println("1. 가입하기");
		System.out.println("2. 여행지 선택");
		System.out.println("3. 개인 정보 수정");
		System.out.println("4. 탈퇴하기");
		System.out.println("5. 회원정보 관리");
		System.out.println("6. 프로그램 종료");
		System.out.print("** 번호 선택 >");

	}

	public void login() {
		String id = null;
		String passWord = null;
		while (true) {
			scan.nextLine();
			System.out.println(" [ 로그인 화면 ] ");
			System.out.print("ID >");
			id = scan.next();
			System.out.print("PASSWORD > ");
			passWord = scan.next();
			TripVO ckid = manager.searchID(id);
			manager.searchPW(passWord);
			TripVO ckpw = manager.searchPW(passWord);

			if (ckid != null && ckpw != null) {
				int randomResult = (int) ((Math.random() * 100000) + 1);
				System.out.println(randomResult);
				System.out.print("보안코드 입력> ");
				int code = scan.nextInt();
				if (randomResult == code) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("다시 시도해 주세요");

				}

			} else {
				System.out.println("아이디 또는 비밀번호가  틀렸습니다. \n다시 입력 해주세요 .");
				continue;
			}

		}

		while (true) {

			System.out.println("[ 여행지 추천 방식 ]");
			System.out.println("1. 순위별 여행지 선택하기");
			System.out.println("2. 랜덤으로 여행지 선택하기");
			System.out.println("3. 로그아웃");
			System.out.print("** 번호 선택>");
			int voteNum = scan.nextInt();

			while (true) {
				switch (voteNum) {

				case 1:
					seasonMenu();
					int seasonNum = scan.nextInt();

					while (true) {
						switch (seasonNum) {
						case 1:
							typeMenu();
							int springNum = scan.nextInt();
							if (springNum == 1) {
								System.out.println("[ 봄에 추천하는 국내 여행지 TOP 3 ]");
								System.out.println("1. 관악산");
								System.out.println("2. 쌍계사 벚꽃터널");
								System.out.println("3. 보성 녹차밭");
							} else if (springNum == 2) {
								System.out.println("[ 봄에 추천하는 일본 여행지 TOP 3 ]");
								System.out.println("1. 도쿄 (요미우리 랜드)");
								System.out.println("2. 도치기");
								System.out.println("3. 에노시마");
							}
							break;

						case 2:
							typeMenu();
							int summerNum = scan.nextInt();
							if (summerNum == 1) {
								System.out.println("[ 여름에 추천하는 국내 여행지 TOP 3 ]");
								System.out.println("1. 양평계곡");
								System.out.println("2. 단양");
								System.out.println("3. 무의도");
							} else if (summerNum == 2) {
								System.out.println("[ 여름에 추천하는 일본 여행지 TOP 3 ]");
								System.out.println("1. 도야마현 (쿠로베 협곡)");
								System.out.println("2. 니가타 (조에츠묘코 해바라기 밭)");
								System.out.println("3. 치바 (다테야마 불꽃놀이)");
							}
							break;
						case 3:
							typeMenu();
							int fallNum = scan.nextInt();
							if (fallNum == 1) {
								System.out.println("[ 가을에 추천하는 국내 여행지 TOP 3 ]");
								System.out.println("1. 오이도");
								System.out.println("2. 강화도");
								System.out.println("3. 제주도");
							} else if (fallNum == 2) {
								System.out.println("[ 가을에 추천하는 일본 여행지 TOP 3 ]");
								System.out.println("1. 후쿠이현");
								System.out.println("2. 오사카");
								System.out.println("3. 아이치현");
							}
							break;

						case 4:
							typeMenu();
							int winterNum = scan.nextInt();
							if (winterNum == 1) {
								System.out.println("[ 겨울에 추천하는 국내 여행지 TOP 3 ]");
								System.out.println("1. 왜목마을");
								System.out.println("2. 북한산");
								System.out.println("3. 대관령");
							} else if (winterNum == 2) {
								System.out.println("[ 겨울에 추천하는 일본 여행지 TOP 3 ]");
								System.out.println("1. 삿포로");
								System.out.println("2. 군마현");
								System.out.println("3. 훗카이도");
							}
							break;

						default:
							System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
							break;
						}
						break;
					}
					break;

				case 2:
					System.out.println("[ 랜덤으로 선택하기 ]");
					seasonMenu();
					int season2Num = scan.nextInt();

					switch (season2Num) {

					case 1:
						System.out.println("[ 봄 여행의 추천 여행지 ]");
						springRd();
						break;

					case 2:
						System.out.println("[ 여름 여행의 추천 여행지 ]");
						summerRd();
						break;

					case 3:
						System.out.println("[ 가을 여행의 추천 여행지 ]");
						fallRd();
						break;

					case 4:
						System.out.println("[ 겨울 여행의 추천 여행지 ]");
						winterRd();
						break;

					default:
						System.out.println("[오류] 잘못입력하셨습니다.");
						break;
					}
					break;

				case 3:
					System.out.println("[정보] 초기 화면으로 돌아갑니다.");
					///////////////////////////////
					return;

				default:
					System.out.println("[알림] 잘못입력하셨습니다.");
					break;

				}
				break;
			}

		}
	}

	public void seasonMenu() {
		System.out.println("[ 취향에 맞는 계절 선택 ]");
		System.out.println("1. 봄");
		System.out.println("2. 여름");
		System.out.println("3. 가을");
		System.out.println("4. 겨울");
		System.out.print("** 계절 선택>");
	}

	public void typeMenu() {
		System.out.println("[ 본인의 여행 취향 ]");
		System.out.println("1. 국내");
		System.out.println("2. 일본");
		System.out.print("** 취향 선택>");
	}

	public void add() {
		String id, name, phone, age, passWord;
		TripVO vo = null;

		scan.nextLine();
		System.out.println("[ 가입하기 ]");

		System.out.print("ID >");
		id = scan.nextLine();

		if (manager.searchID(id) != null) {
			System.out.println("[정보] 이미 존재하는 회원입니다.");
			return;
		}
		while (true) {
			System.out.print("PASSWORD >");
			passWord = scan.nextLine();
			if (passWord.equals(id)) {
				System.out.println("아이디와 비밀번호가 일치합니다. \n다시 입력해주세요.");
				continue;
			} else {
				System.out.print("이름 >");
				name = scan.nextLine();
				System.out.print("전화번호 >");
				phone = scan.nextLine();
				if (manager.searchPhone(phone) != null) {
					System.out.println("[정보] 이미 존재 하는 전화번호 입니다.");
					break;
				}

				System.out.print("나이대 (ex. 20대) >");
				age = scan.nextLine();
			}

			vo = new TripVO(id, name, phone, age, passWord);
			boolean res = manager.insertVO(vo);

			if (res) {
				System.out.println("[정보] 가입 완료되었습니다.");
				// manager.showlist(); 확인차 설정한 출력문
				break;
			} else {
				System.out.println("[정보] 저장에 실패했습니다.");

			}
		}
	}

	public void update() {
		TripVO tripVO = null;
		TripVO ckid = null;
		TripVO ckpw = null;
		String id = null;
		String name = null;
		String phone = null;
		String age = null;
		String passWord = null;
		String passWord2 = null;
		while (true) {
			System.out.println();
			System.out.println(" [ 개인 정보 수정 ] ");
			System.out.print("수정 할 아이디를 입력해 주세요 > ");

			id = scan.next();
			System.out.print("비밀번호를 입력해 주세요 > ");
			passWord = scan.next();
			manager.searchPW(passWord);

			ckid = manager.searchID(id);
			ckpw = manager.searchPW(passWord);
			if (ckid != null && ckpw != null) {
				break;

			} else {

				System.out.println("아이디 또는 비밀번호가 틀렸습니다 \n다시입력해주세요");
			}
		}

		System.out.println("수정할 항목");
		System.out.println("1. 이름 정보");
		System.out.println("2. 전화번호");
		System.out.println("3. 나이");
		System.out.println("4. 비밀번호");
		System.out.print("** 번호 입력>");
		int info = scan.nextInt();
		scan.nextLine();
		if (info == 1) {
			System.out.print("수정 할 이름을 입력 > ");
			name = scan.nextLine();
			ckid.setName(name);
		} else if (info == 2) {

			System.out.print("저장된 전화번호 >");
			phone = scan.nextLine();
			if (manager.searchPhone(phone) == null) {
				System.out.println("[오류] 존재하지 않는 전화번호 입니다.");

			} else {
				System.out.print("수정할 전화번호 >");
				String phone1 = scan.nextLine();
				if (manager.searchPhone(phone) != null && manager.searchPhone(phone1) == null) {
					manager.updatePhone(passWord, phone1);
					System.out.println("[정보] 정보 수정 완료 되었습니다.");
					return;

				} else {
					System.out.println("[오류] 중복된 전화번호가 있으므로 수정 할 수 없습니다");
				}
			}

		} else if (info == 3) {
			System.out.print("수정 할 나이 >");
			age = scan.nextLine();
			manager.updateAge(passWord, age);

		} else if (info == 4) {
			while(true) {
			System.out.print("새로운 비밀번호 입력해 주세요>");
			passWord2 = scan.nextLine();
				if(passWord2.equals(id)) {
					System.out.println("아이디와 비밀번호가 같습니다. \n 다시 입력해주세요.");
					continue;
				}
				manager.updatePW(passWord, passWord2);
				System.out.println("비밀번호 변경이 완료되었습니다.");
				break;
			}
		}
			else {
					System.out.println("잘못된 번호 입니다.");
	}
}
		

	

	public void delete() {
		TripVO tripVO = null;
		String id = null;
		String phone = null;
		TripVO TripVO = null;
		String passWord = null;
		boolean res = false;
		scan.nextLine();
		while (!res) {

			System.out.println();
			System.out.println(" [ 삭제 할 정보 ] ");
			System.out.print("아이디를 입력해 주세요> ");
			id = scan.nextLine();
			System.out.print("비밀번호 입력해 주세요 >");
			passWord = scan.nextLine();

			res = manager.deleteVO(id, passWord);

			if (res) {
				System.out.println("삭제 되었습니다.");
			} else {
				System.out.println("아이디 혹은 비밀번호가 틀렸습니다..");
			}
		}
	}

	public void care() {
		int careNum = 0;
		while (true) {
			System.out.println("*******************");
			System.out.println("[ 회원정보 관리 시스템 ]");
			System.out.println("1. 회원 목록 출력");
			System.out.println("2. 이름으로 회원 검색");
			System.out.println("3. 나이대별 회원 검색");
			System.out.println("4. 메인화면으로 돌아가기");
			System.out.println("*******************");
			System.out.print("** 관리 번호 선택 >");
			careNum = scan.nextInt();

			if (careNum == 4) {
				System.out.println("메인화면으로 돌아갑니다.");
				break;
			}
			switch (careNum) {
			case 1:
				System.out.println();
				ArrayList<TripVO> blank = manager.showlist();

				if (blank.size() <= 0) {
					System.out.println("[알림] 회원 정보가 없습니다.");
				} else {

					for (int i = 0; i < blank.size(); i++) {
						System.out.println(blank.get(i));
					}
				}

				break;
			case 2:
				scan.nextLine();
				System.out.print("** 찾으실 이름 >");
				String name = scan.nextLine();
				boolean res = manager.nameList(name);
				if (res) {

				} else {
					System.out.println("입력하신 이름으로 가입된 정보는 없습니다.");
				}

				break;
			case 3:
				System.out.print("** 찾으실 나이대>");
				String age = scan.next();
				boolean check = manager.ageList(age);
				if (check) {

				} else {
					System.out.println("찾으시는 나이대의 정보는 없습니다.");
				}
				break;

			default:
				System.out.println("[오류] 번호를 다시 확인하세요.");
				break;
			}
		}

	}

	public void exit() {
		System.out.println("[정보] 시스템을 종료합니다.");
		System.exit(0);

	}

	public int inputInteger() {
		int output = scan.nextInt();
		scan.nextLine();

		return output;
	}

	public void springRd() {
		String[] spring = { "관악산", "쌍계사 벚꽃터널", "보성 녹차밭", "도쿄, 일본", "도치기, 일본", "에노시마, 일본" };

		Random rd = new Random();

		int num = rd.nextInt(6);

		System.out.println("추천 되신 여행지는 [ " + spring[num] + " ] 입니다");

	}

	public void summerRd() {
		String[] summer = { "무릉계곡", "오대산 선재길", "변산반도 국립공원", "도야마현, 일본", "니가타, 일본", "치바, 일본", "양평계곡", "무의도" };
		Random rd = new Random();

		int num = rd.nextInt(8);
		System.out.println("추천 되신 여행지는 [ " + summer[num] + " ] 입니다");
	}

	public void fallRd() {
		String[] fall = { "주왕산 절곡계곡", "정선 민둥산", "성산 지질트레이", "후쿠이현, 일본", "오사카, 일본", "아이치현, 일본", "오이도", "강화도", "제주도" };
		Random rd = new Random();

		int num = rd.nextInt(7);
		System.out.println("추천 되신 여행지는 [ " + fall[num] + " ] 입니다");

	}

	public void winterRd() {
		Random rd = new Random();
		String[] winter = { "영덕 블루로드", "통영 비진도", "대관령", "삿포로, 일본", "훗카이도, 일본", "군마현, 일본", "왜목마을", "북한산", "대관령" };

		int num = rd.nextInt(7);

		System.out.println("추천 되신 여행지는 [ " + winter[num] + " ] 입니다");
	}
}