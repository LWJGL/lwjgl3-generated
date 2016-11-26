/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class AIFileCloseProc extends Callback implements AIFileCloseProcI {

	/** Creates a {@code AIFileCloseProc} instance from the specified function pointer. */
	public static AIFileCloseProc create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		AIFileCloseProcI instance = Callback.get(functionPointer);
		return instance instanceof AIFileCloseProc
			? (AIFileCloseProc)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code AIFileCloseProc} instance that delegates to the specified {@code AIFileCloseProcI} instance. */
	public static AIFileCloseProc create(AIFileCloseProcI instance) {
		return instance instanceof AIFileCloseProc
			? (AIFileCloseProc)instance
			: new Container(instance.address(), instance);
	}

	protected AIFileCloseProc() {
		super(SIGNATURE);
	}

	private AIFileCloseProc(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends AIFileCloseProc {

		private final AIFileCloseProcI delegate;

		Container(long functionPointer, AIFileCloseProcI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long pFileIO, long pFile) {
			delegate.invoke(pFileIO, pFile);
		}

	}

}