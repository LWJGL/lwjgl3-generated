/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system;

import org.lwjgl.openal.*;
import org.lwjgl.opengl.*;
import org.lwjgl.opengles.*;

/** Thread-local state used internally by LWJGL. */
public final class ThreadLocalState implements Runnable {

	Runnable target;

	public final MemoryStack stack;

	public ALCapabilities capsAL;
	public GLCapabilities capsGL;
	public GLESCapabilities capsGLES;

	ThreadLocalState() {
		stack = MemoryStack.create();
	}

	@Override
	public void run() {
		if ( target != null )
			target.run();
	}

}
