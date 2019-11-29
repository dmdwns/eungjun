package action;

import java.util.List;

import com.mystudy.jdbc_dao.MemberDAO;

import user.UserDAO;
import user.UserDTO;

public class User_Test {

	public static void main(String[] args) {
			UserDAO dao = new UserDAO();
			List<UserDTO> list = dao.selectAll();
			for (UserDTO mvo : list ) {
				System.out.println(mvo);
			
			}
	}

}
