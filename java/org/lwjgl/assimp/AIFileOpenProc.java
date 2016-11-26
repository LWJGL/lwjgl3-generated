/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class AIFileOpenProc extends Callback implements AIFileOpenProcI {

	/** Creates a {@code AIFileOpenProc} instance from the specified function pointer. */
	public static AIFileOpenProc create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		AIFileOpenProcI instance = Callback.get(functionPointer);
		return instance instanceof AIFileOpenProc
			? (AIFileOpenProc)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code AIFileOpenProc} instance that delegates to the specified {@code AIFileOpenProcI} instance. */
	public static AIFileOpenProc create(AIFileOpenProcI instance) {
		return instance instanceof AIFileOpenProc
			? (AIFileOpenProc)instance
			: new Container(instance.address(), instance);
	}

	protected AIFileOpenProc() {
		super(SIGNATURE);
	}

	private AIFileOpenProc(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends AIFileOpenProc {

		private final AIFileOpenProcI delegate;

		Container(long functionPointer, AIFileOpenProcI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public long invoke(long pFileIO, long fileName, long openMode) {
			return delegate.invoke(pFileIO, fileName, openMode);
		}

	}

}