package edu.scheduler.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SampleScheduler {

	@Scheduled(cron = "0/10 * * * * ?")
	public void logScheduler() {
		System.out.println("�ź� ���� �����...");
	}
}
