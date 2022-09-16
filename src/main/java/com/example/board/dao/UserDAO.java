package com.example.board.dao;

import java.util.List;

import com.example.board.dto.BoardDTO;
import com.example.board.dto.PageDTO;
import com.example.board.dto.UserDTO;

public interface UserDAO {
	
	// 회원가입
	public boolean join(UserDTO userDTO) throws Exception;

	// 아이디 중복 체크
	public int idCheck(String userId) throws Exception;

	// 닉네임 중복 체크
	public int nickNameCheck(String nickName) throws Exception;

	// 로그인
	public boolean login(UserDTO userDTO) throws Exception;
	
	// 로그인한 회원 정보
	public UserDTO loginUserInfo(String userId) throws Exception;
	
	// 비밀번호 변경
	public void changePw(UserDTO userDTO) throws Exception; 
	
	// 닉네임 변경
	public void changeNickName(UserDTO userDTO)throws Exception;
	
	// 회원 탈퇴
	public void deleteUser(String userId) throws Exception;
	
	// 작성한 게시글 수
	public int boardTotal(String userId) throws Exception;
	
	// 작성한 게시글 조회
	public List<BoardDTO> boardList(PageDTO pageDTO) throws Exception;

	// 작성한 댓글 수
	public int replyTotal(String userId) throws Exception;
	
	// 작성한 댓글 조회
	public List<BoardDTO> replyList(PageDTO pageDTO) throws Exception;
}
