/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Prints a debug message.
 * 
 * <p>Not thread safe and it can be called from any thread.</p>
 */
public abstract class BGFXTraceVarArgsCallback extends Callback implements BGFXTraceVarArgsCallbackI {

	/** Creates a {@code BGFXTraceVarArgsCallback} instance from the specified function pointer. */
	public static BGFXTraceVarArgsCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		BGFXTraceVarArgsCallbackI instance = Callback.get(functionPointer);
		return instance instanceof BGFXTraceVarArgsCallback
			? (BGFXTraceVarArgsCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code BGFXTraceVarArgsCallback} instance that delegates to the specified {@code BGFXTraceVarArgsCallbackI} instance. */
	public static BGFXTraceVarArgsCallback create(BGFXTraceVarArgsCallbackI instance) {
		return instance instanceof BGFXTraceVarArgsCallback
			? (BGFXTraceVarArgsCallback)instance
			: new Container(instance.address(), instance);
	}

	protected BGFXTraceVarArgsCallback() {
		super(SIGNATURE);
	}

	private BGFXTraceVarArgsCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends BGFXTraceVarArgsCallback {

		private final BGFXTraceVarArgsCallbackI delegate;

		Container(long functionPointer, BGFXTraceVarArgsCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long _this, long _filePath, short _line, long _format, long _argList) {
			delegate.invoke(_this, _filePath, _line, _format, _argList);
		}

	}

}