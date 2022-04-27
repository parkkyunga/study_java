package com.yedam.java.homework2;

public class PortableNotebook implements Notebook, Tablet {
	int mode = TABLET_MODE;
	String wriDoc;
	String searchInt;
	String video;
	String app;
	
	

	public PortableNotebook(String wriDoc, String searchInt, String video, String app) {
		super();
		this.mode = TABLET_MODE;
		this.wriDoc = wriDoc;
		this.searchInt = searchInt;
		this.video = video;
		this.app = app;
	}
	

	@Override
	public void watchVideo() {
		System.out.println(video+" 시청");
		
	}

	@Override
	public void useApp() {
		mode = NOTEBOOK_MODE;
		System.out.println(app+" 실행");
		
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(wriDoc+" 통해 문서를 작성");
		
	}

	@Override
	public void searchInternet() {
		System.out.println(searchInt+" 통해 인터넷을 검색");
		
	}
	
	public void changeMode() {
		if(mode == 1) {
			mode = 2;
			System.out.println("현재 타블렛모드");
		}else {
			mode =1;
			System.out.println("현재 노트북모드");
		}
	}
	

	
	
}
