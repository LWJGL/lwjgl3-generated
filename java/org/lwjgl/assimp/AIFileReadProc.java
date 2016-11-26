/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class AIFileReadProc extends Callback implements AIFileReadProcI {

	/** Creates a {@code AIFileReadProc} instance from the specified function pointer. */
	public static AIFileReadProc create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		AIFileReadProcI instance = Callback.get(functionPointer);
		return instance instanceof AIFileReadProc
			? (AIFileReadProc)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code AIFileReadProc} instance that delegates to the specified {@code AIFileReadProcI} instance. */
	public static AIFileReadProc create(AIFileReadProcI instance) {
		return instance instanceof AIFileReadProc
			? (AIFileReadProc)instance
			: new Container(instance.address(), instance);
	}

	protected AIFileReadProc() {
		super(SIGNATURE);
	}

	private AIFileReadProc(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends AIFileReadProc {

		private final AIFileReadProcI delegate;

		Container(long functionPointer, AIFileReadProcI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public long invoke(long pFile, long pBuffer, long size, long count) {
			return delegate.invoke(pFile, pBuffer, size, count);
		}

	}

}