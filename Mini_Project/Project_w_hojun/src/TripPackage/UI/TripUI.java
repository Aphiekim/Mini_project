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
				System.out.println("[����] �߸��Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				break;
			}
		}
	}

	public void mainMenu() {
		System.out.println("[ Welcome, Traveler ]");
		System.out.println("1. �����ϱ�");
		System.out.println("2. ������ ����");
		System.out.println("3. ���� ���� ����");
		System.out.println("4. Ż���ϱ�");
		System.out.println("5. ȸ������ ����");
		System.out.println("6. ���α׷� ����");
		System.out.print("** ��ȣ ���� >");

	}

	public void login() {
		String id = null;
		String passWord = null;
		while (true) {
			scan.nextLine();
			System.out.println(" [ �α��� ȭ�� ] ");
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
				System.out.print("�����ڵ� �Է�> ");
				int code = scan.nextInt();
				if (randomResult == code) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("�ٽ� �õ��� �ּ���");

				}

			} else {
				System.out.println("���̵� �Ǵ� ��й�ȣ��  Ʋ�Ƚ��ϴ�. \n�ٽ� �Է� ���ּ��� .");
				continue;
			}

		}

		while (true) {

			System.out.println("[ ������ ��õ ��� ]");
			System.out.println("1. ������ ������ �����ϱ�");
			System.out.println("2. �������� ������ �����ϱ�");
			System.out.println("3. �α׾ƿ�");
			System.out.print("** ��ȣ ����>");
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
								System.out.println("[ ���� ��õ�ϴ� ���� ������ TOP 3 ]");
								System.out.println("1. ���ǻ�");
								System.out.println("2. �ְ�� �����ͳ�");
								System.out.println("3. ���� ������");
							} else if (springNum == 2) {
								System.out.println("[ ���� ��õ�ϴ� �Ϻ� ������ TOP 3 ]");
								System.out.println("1. ���� (��̿츮 ����)");
								System.out.println("2. ��ġ��");
								System.out.println("3. ����ø�");
							}
							break;

						case 2:
							typeMenu();
							int summerNum = scan.nextInt();
							if (summerNum == 1) {
								System.out.println("[ ������ ��õ�ϴ� ���� ������ TOP 3 ]");
								System.out.println("1. ������");
								System.out.println("2. �ܾ�");
								System.out.println("3. ���ǵ�");
							} else if (summerNum == 2) {
								System.out.println("[ ������ ��õ�ϴ� �Ϻ� ������ TOP 3 ]");
								System.out.println("1. ���߸��� (��κ� ����)");
								System.out.println("2. �ϰ�Ÿ (���������� �عٶ�� ��)");
								System.out.println("3. ġ�� (���׾߸� �Ҳɳ���)");
							}
							break;
						case 3:
							typeMenu();
							int fallNum = scan.nextInt();
							if (fallNum == 1) {
								System.out.println("[ ������ ��õ�ϴ� ���� ������ TOP 3 ]");
								System.out.println("1. ���̵�");
								System.out.println("2. ��ȭ��");
								System.out.println("3. ���ֵ�");
							} else if (fallNum == 2) {
								System.out.println("[ ������ ��õ�ϴ� �Ϻ� ������ TOP 3 ]");
								System.out.println("1. ��������");
								System.out.println("2. ����ī");
								System.out.println("3. ����ġ��");
							}
							break;

						case 4:
							typeMenu();
							int winterNum = scan.nextInt();
							if (winterNum == 1) {
								System.out.println("[ �ܿ￡ ��õ�ϴ� ���� ������ TOP 3 ]");
								System.out.println("1. �ָ���");
								System.out.println("2. ���ѻ�");
								System.out.println("3. �����");
							} else if (winterNum == 2) {
								System.out.println("[ �ܿ￡ ��õ�ϴ� �Ϻ� ������ TOP 3 ]");
								System.out.println("1. ������");
								System.out.println("2. ������");
								System.out.println("3. ��ī�̵�");
							}
							break;

						default:
							System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
							break;
						}
						break;
					}
					break;

				case 2:
					System.out.println("[ �������� �����ϱ� ]");
					seasonMenu();
					int season2Num = scan.nextInt();

					switch (season2Num) {

					case 1:
						System.out.println("[ �� ������ ��õ ������ ]");
						springRd();
						break;

					case 2:
						System.out.println("[ ���� ������ ��õ ������ ]");
						summerRd();
						break;

					case 3:
						System.out.println("[ ���� ������ ��õ ������ ]");
						fallRd();
						break;

					case 4:
						System.out.println("[ �ܿ� ������ ��õ ������ ]");
						winterRd();
						break;

					default:
						System.out.println("[����] �߸��Է��ϼ̽��ϴ�.");
						break;
					}
					break;

				case 3:
					System.out.println("[����] �ʱ� ȭ������ ���ư��ϴ�.");
					///////////////////////////////
					return;

				default:
					System.out.println("[�˸�] �߸��Է��ϼ̽��ϴ�.");
					break;

				}
				break;
			}

		}
	}

	public void seasonMenu() {
		System.out.println("[ ���⿡ �´� ���� ���� ]");
		System.out.println("1. ��");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. �ܿ�");
		System.out.print("** ���� ����>");
	}

	public void typeMenu() {
		System.out.println("[ ������ ���� ���� ]");
		System.out.println("1. ����");
		System.out.println("2. �Ϻ�");
		System.out.print("** ���� ����>");
	}

	public void add() {
		String id, name, phone, age, passWord;
		TripVO vo = null;

		scan.nextLine();
		System.out.println("[ �����ϱ� ]");

		System.out.print("ID >");
		id = scan.nextLine();

		if (manager.searchID(id) != null) {
			System.out.println("[����] �̹� �����ϴ� ȸ���Դϴ�.");
			return;
		}
		while (true) {
			System.out.print("PASSWORD >");
			passWord = scan.nextLine();
			if (passWord.equals(id)) {
				System.out.println("���̵�� ��й�ȣ�� ��ġ�մϴ�. \n�ٽ� �Է����ּ���.");
				continue;
			} else {
				System.out.print("�̸� >");
				name = scan.nextLine();
				System.out.print("��ȭ��ȣ >");
				phone = scan.nextLine();
				if (manager.searchPhone(phone) != null) {
					System.out.println("[����] �̹� ���� �ϴ� ��ȭ��ȣ �Դϴ�.");
					break;
				}

				System.out.print("���̴� (ex. 20��) >");
				age = scan.nextLine();
			}

			vo = new TripVO(id, name, phone, age, passWord);
			boolean res = manager.insertVO(vo);

			if (res) {
				System.out.println("[����] ���� �Ϸ�Ǿ����ϴ�.");
				// manager.showlist(); Ȯ���� ������ ��¹�
				break;
			} else {
				System.out.println("[����] ���忡 �����߽��ϴ�.");

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
			System.out.println(" [ ���� ���� ���� ] ");
			System.out.print("���� �� ���̵� �Է��� �ּ��� > ");

			id = scan.next();
			System.out.print("��й�ȣ�� �Է��� �ּ��� > ");
			passWord = scan.next();
			manager.searchPW(passWord);

			ckid = manager.searchID(id);
			ckpw = manager.searchPW(passWord);
			if (ckid != null && ckpw != null) {
				break;

			} else {

				System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ� \n�ٽ��Է����ּ���");
			}
		}

		System.out.println("������ �׸�");
		System.out.println("1. �̸� ����");
		System.out.println("2. ��ȭ��ȣ");
		System.out.println("3. ����");
		System.out.println("4. ��й�ȣ");
		System.out.print("** ��ȣ �Է�>");
		int info = scan.nextInt();
		scan.nextLine();
		if (info == 1) {
			System.out.print("���� �� �̸��� �Է� > ");
			name = scan.nextLine();
			ckid.setName(name);
		} else if (info == 2) {

			System.out.print("����� ��ȭ��ȣ >");
			phone = scan.nextLine();
			if (manager.searchPhone(phone) == null) {
				System.out.println("[����] �������� �ʴ� ��ȭ��ȣ �Դϴ�.");

			} else {
				System.out.print("������ ��ȭ��ȣ >");
				String phone1 = scan.nextLine();
				if (manager.searchPhone(phone) != null && manager.searchPhone(phone1) == null) {
					manager.updatePhone(passWord, phone1);
					System.out.println("[����] ���� ���� �Ϸ� �Ǿ����ϴ�.");
					return;

				} else {
					System.out.println("[����] �ߺ��� ��ȭ��ȣ�� �����Ƿ� ���� �� �� �����ϴ�");
				}
			}

		} else if (info == 3) {
			System.out.print("���� �� ���� >");
			age = scan.nextLine();
			manager.updateAge(passWord, age);

		} else if (info == 4) {
			while(true) {
			System.out.print("���ο� ��й�ȣ �Է��� �ּ���>");
			passWord2 = scan.nextLine();
				if(passWord2.equals(id)) {
					System.out.println("���̵�� ��й�ȣ�� �����ϴ�. \n �ٽ� �Է����ּ���.");
					continue;
				}
				manager.updatePW(passWord, passWord2);
				System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
				break;
			}
		}
			else {
					System.out.println("�߸��� ��ȣ �Դϴ�.");
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
			System.out.println(" [ ���� �� ���� ] ");
			System.out.print("���̵� �Է��� �ּ���> ");
			id = scan.nextLine();
			System.out.print("��й�ȣ �Է��� �ּ��� >");
			passWord = scan.nextLine();

			res = manager.deleteVO(id, passWord);

			if (res) {
				System.out.println("���� �Ǿ����ϴ�.");
			} else {
				System.out.println("���̵� Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�..");
			}
		}
	}

	public void care() {
		int careNum = 0;
		while (true) {
			System.out.println("*******************");
			System.out.println("[ ȸ������ ���� �ý��� ]");
			System.out.println("1. ȸ�� ��� ���");
			System.out.println("2. �̸����� ȸ�� �˻�");
			System.out.println("3. ���̴뺰 ȸ�� �˻�");
			System.out.println("4. ����ȭ������ ���ư���");
			System.out.println("*******************");
			System.out.print("** ���� ��ȣ ���� >");
			careNum = scan.nextInt();

			if (careNum == 4) {
				System.out.println("����ȭ������ ���ư��ϴ�.");
				break;
			}
			switch (careNum) {
			case 1:
				System.out.println();
				ArrayList<TripVO> blank = manager.showlist();

				if (blank.size() <= 0) {
					System.out.println("[�˸�] ȸ�� ������ �����ϴ�.");
				} else {

					for (int i = 0; i < blank.size(); i++) {
						System.out.println(blank.get(i));
					}
				}

				break;
			case 2:
				scan.nextLine();
				System.out.print("** ã���� �̸� >");
				String name = scan.nextLine();
				boolean res = manager.nameList(name);
				if (res) {

				} else {
					System.out.println("�Է��Ͻ� �̸����� ���Ե� ������ �����ϴ�.");
				}

				break;
			case 3:
				System.out.print("** ã���� ���̴�>");
				String age = scan.next();
				boolean check = manager.ageList(age);
				if (check) {

				} else {
					System.out.println("ã���ô� ���̴��� ������ �����ϴ�.");
				}
				break;

			default:
				System.out.println("[����] ��ȣ�� �ٽ� Ȯ���ϼ���.");
				break;
			}
		}

	}

	public void exit() {
		System.out.println("[����] �ý����� �����մϴ�.");
		System.exit(0);

	}

	public int inputInteger() {
		int output = scan.nextInt();
		scan.nextLine();

		return output;
	}

	public void springRd() {
		String[] spring = { "���ǻ�", "�ְ�� �����ͳ�", "���� ������", "����, �Ϻ�", "��ġ��, �Ϻ�", "����ø�, �Ϻ�" };

		Random rd = new Random();

		int num = rd.nextInt(6);

		System.out.println("��õ �ǽ� �������� [ " + spring[num] + " ] �Դϴ�");

	}

	public void summerRd() {
		String[] summer = { "�������", "����� �����", "����ݵ� ��������", "���߸���, �Ϻ�", "�ϰ�Ÿ, �Ϻ�", "ġ��, �Ϻ�", "������", "���ǵ�" };
		Random rd = new Random();

		int num = rd.nextInt(8);
		System.out.println("��õ �ǽ� �������� [ " + summer[num] + " ] �Դϴ�");
	}

	public void fallRd() {
		String[] fall = { "�ֿջ� ������", "���� �εջ�", "���� ����Ʈ����", "��������, �Ϻ�", "����ī, �Ϻ�", "����ġ��, �Ϻ�", "���̵�", "��ȭ��", "���ֵ�" };
		Random rd = new Random();

		int num = rd.nextInt(7);
		System.out.println("��õ �ǽ� �������� [ " + fall[num] + " ] �Դϴ�");

	}

	public void winterRd() {
		Random rd = new Random();
		String[] winter = { "���� ���ε�", "�뿵 ������", "�����", "������, �Ϻ�", "��ī�̵�, �Ϻ�", "������, �Ϻ�", "�ָ���", "���ѻ�", "�����" };

		int num = rd.nextInt(7);

		System.out.println("��õ �ǽ� �������� [ " + winter[num] + " ] �Դϴ�");
	}
}