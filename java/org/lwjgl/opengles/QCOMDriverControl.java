/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/QCOM/QCOM_driver_control.txt">QCOM_driver_control</a> extension.
 * 
 * <p>This extension exposes special control features in a driver to a developer. A use of these controls would be to override state or implement special
 * modes of operation. One common example might be an IFH or infinitely fast hardware mode. In this mode none of draw commands would be sent to the GPU so
 * no image would be displayed, but all the driver software overhead would still happen thus enabling developers to analyze driver overhead separate from
 * GPU performance. Some uses of this extension could invalidate future rendering and thus should only be used by developers for debugging and performance
 * profiling purposes.</p>
 * 
 * <p>The extension is general enough to allow the implementation to choose which controls to expose and to provide a textual description of those controls
 * to developers.</p>
 */
public class QCOMDriverControl {

	static { GLES.initialize(); }

	protected QCOMDriverControl() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glGetDriverControlsQCOM, caps.glGetDriverControlStringQCOM, caps.glEnableDriverControlQCOM, caps.glDisableDriverControlQCOM
		);
	}

	// --- [ glGetDriverControlsQCOM ] ---

	public static native void nglGetDriverControlsQCOM(long num, int size, long driverControls);

	public static void glGetDriverControlsQCOM(IntBuffer num, IntBuffer driverControls) {
		if ( CHECKS )
			checkSafe(num, 1);
		nglGetDriverControlsQCOM(memAddressSafe(num), remainingSafe(driverControls), memAddressSafe(driverControls));
	}

	// --- [ glGetDriverControlStringQCOM ] ---

	public static native void nglGetDriverControlStringQCOM(int driverControl, int bufSize, long length, long driverControlString);

	public static void glGetDriverControlStringQCOM(int driverControl, IntBuffer length, ByteBuffer driverControlString) {
		if ( CHECKS )
			checkSafe(length, 1);
		nglGetDriverControlStringQCOM(driverControl, remainingSafe(driverControlString), memAddressSafe(length), memAddressSafe(driverControlString));
	}

	public static String glGetDriverControlStringQCOM(int driverControl, int bufSize) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer driverControlString = stack.malloc(bufSize);
			nglGetDriverControlStringQCOM(driverControl, bufSize, memAddress(length), memAddress(driverControlString));
			return memASCII(driverControlString, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glEnableDriverControlQCOM ] ---

	public static native void glEnableDriverControlQCOM(int driverControl);

	// --- [ glDisableDriverControlQCOM ] ---

	public static native void glDisableDriverControlQCOM(int driverControl);

	/** Array version of: {@link #glGetDriverControlsQCOM GetDriverControlsQCOM} */
	public static void glGetDriverControlsQCOM(int[] num, int[] driverControls) {
		long __functionAddress = GLES.getICD().glGetDriverControlsQCOM;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(num, 1);
		}
		callPPV(__functionAddress, num, lengthSafe(driverControls), driverControls);
	}

	/** Array version of: {@link #glGetDriverControlStringQCOM GetDriverControlStringQCOM} */
	public static void glGetDriverControlStringQCOM(int driverControl, int[] length, ByteBuffer driverControlString) {
		long __functionAddress = GLES.getICD().glGetDriverControlStringQCOM;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(length, 1);
		}
		callPPV(__functionAddress, driverControl, remainingSafe(driverControlString), length, memAddressSafe(driverControlString));
	}

}