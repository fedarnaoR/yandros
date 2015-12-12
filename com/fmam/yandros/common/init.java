package com.fmam.yandros.common

public class Init {
	private static Init instance;
	private boolean initialized;

	public static Init init(Objects... args) {
		if (instance == null) {
			instance = Init();
			instance.initialize(args);
		}
		if (!instance.isInitialized())
			instance.initialize(args);
		return instance;
	}

	protected void initialize(Objects... args) {
		initialized = true;
	}

	public boolean isInitialized() {
		return initialized;
	}
}