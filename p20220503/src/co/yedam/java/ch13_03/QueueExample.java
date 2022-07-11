package co.yedam.java.ch13_03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQ = new LinkedList<Message>();
		messageQ.offer(new Message("sendMail", "hong gil dong"));
		messageQ.offer(new Message("sendSMS", "shin yong kun"));
		messageQ.offer(new Message("sendKakaoTalk", "hong doo kke"));

		while (!messageQ.isEmpty()) {
			Message message = messageQ.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 Mail을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
			case "sendKakaoTalk":
				System.out.println(message.to + "님에게 KakaoTalk을 보냅니다.");
				break;
			}
		}

	}
}
