package com.mv.mvQuiz.Exceptions;

public class MvQuizException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8335679945174965097L;

	public MvQuizException() {
		super();
	}

	public MvQuizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MvQuizException(String message, Throwable cause) {
		super(message, cause);
	}

	public MvQuizException(String message) {
		super(message);
	}

	public MvQuizException(Throwable cause) {
		super(cause);
	}

}
