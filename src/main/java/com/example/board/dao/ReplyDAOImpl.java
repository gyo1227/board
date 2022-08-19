package com.example.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.board.dto.ReplyDTO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

	private static final Logger log = LoggerFactory.getLogger(ReplyDAOImpl.class);
	
	@Inject
	private SqlSession sqlsession;
	
	public void setSqlsession(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
	private final String NAMESPACE = "com.example.board.mappers.ReplyMapper";
	
	@Override
	public List<ReplyDTO> list(int boardNum) {
		return sqlsession.selectList(NAMESPACE + ".read", boardNum);
	}

	@Override
	public int create(ReplyDTO replyDTO) {
		return sqlsession.insert(NAMESPACE + ".create", replyDTO);
	}

	@Override
	public void update(ReplyDTO replyDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int replyNum) {
		// TODO Auto-generated method stub
		
	}

}
