package edu.springboard.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import edu.springboard.service.BoardService;

@Component("SampleScheduler2")
public class SampleScheduler {

	@Autowired
	BoardService boardService;
	
	@Scheduled(cron = "0/10 * * * * ? ") //초 분 일 시 일 월 요일 연도
	public void job1() {
		System.out.println("10초 마다 실행");
	}
}
