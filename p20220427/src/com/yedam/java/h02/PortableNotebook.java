package com.yedam.java.h02;

public class PortableNotebook implements Notebook, Tablet {

	private int mode;
	private String document;
	private String searchInt;
	private String video;
	private String app;

	public PortableNotebook(String document, String searchInt, String video, String app) {
		super();
		this.mode = Notebook.NOTEBOOK_MODE;
		this.document = document;
		this.searchInt = searchInt;
		this.video = video;
		this.app = app;
		System.out.println("현재모드 >> " + mode);
	}

	@Override
	public void watchVideo() {
		System.out.println(video + "를 시청");

	}

	@Override
	public void useApp() {
		mode = NOTEBOOK_MODE;
		if(this.mode == Notebook.NOTEBOOK_MODE) {
			changeMode();
		}
		System.out.println(app + " 실행");

	}

	@Override
	public void writeDocumentation() {
		System.out.println(document + " 통해 문서를 작성");

	}

	@Override
	public void searchInternet() {
		System.out.println(searchInt + " 통해 인터넷을 검색");

	}

	public void changeMode() {
		if (this.mode == Notebook.NOTEBOOK_MODE) {
			this.mode = Tablet.TABLET_MODE;
			System.out.println("현재 타블렛모드");
		} else if (this.mode == Tablet.TABLET_MODE) {
			this.mode = Notebook.NOTEBOOK_MODE;
			System.out.println("현재 노트북모드");
		}
	}

}
