/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/QCOM/QCOM_extended_get2.txt">QCOM_extended_get2</a> extension.
 * 
 * <p>This extension enables instrumenting the driver for debugging of OpenGL ES applications.</p>
 */
public class QCOMExtendedGet2 {

	static { GLES.initialize(); }

	protected QCOMExtendedGet2() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glExtGetShadersQCOM, caps.glExtGetProgramsQCOM, caps.glExtIsProgramBinaryQCOM, caps.glExtGetProgramBinarySourceQCOM
		);
	}

	// --- [ glExtGetShadersQCOM ] ---

	public static native void nglExtGetShadersQCOM(long shaders, int maxShaders, long numShaders);

	public static void glExtGetShadersQCOM(IntBuffer shaders, IntBuffer numShaders) {
		if ( CHECKS )
			checkSafe(numShaders, 1);
		nglExtGetShadersQCOM(memAddressSafe(shaders), remainingSafe(shaders), memAddressSafe(numShaders));
	}

	// --- [ glExtGetProgramsQCOM ] ---

	public static native void nglExtGetProgramsQCOM(long programs, int maxPrograms, long numPrograms);

	public static void glExtGetProgramsQCOM(IntBuffer programs, IntBuffer numPrograms) {
		if ( CHECKS )
			checkSafe(numPrograms, 1);
		nglExtGetProgramsQCOM(memAddressSafe(programs), remainingSafe(programs), memAddressSafe(numPrograms));
	}

	// --- [ glExtIsProgramBinaryQCOM ] ---

	public static native boolean glExtIsProgramBinaryQCOM(int program);

	// --- [ glExtGetProgramBinarySourceQCOM ] ---

	public static native void nglExtGetProgramBinarySourceQCOM(int program, int shadertype, long source, long length);

	public static void glExtGetProgramBinarySourceQCOM(int program, int shadertype, ByteBuffer source, IntBuffer length) {
		if ( CHECKS )
			checkSafe(length, 1);
		nglExtGetProgramBinarySourceQCOM(program, shadertype, memAddress(source), memAddressSafe(length));
	}

	/** Array version of: {@link #glExtGetShadersQCOM ExtGetShadersQCOM} */
	public static void glExtGetShadersQCOM(int[] shaders, int[] numShaders) {
		long __functionAddress = GLES.getICD().glExtGetShadersQCOM;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(numShaders, 1);
		}
		callPPV(__functionAddress, shaders, lengthSafe(shaders), numShaders);
	}

	/** Array version of: {@link #glExtGetProgramsQCOM ExtGetProgramsQCOM} */
	public static void glExtGetProgramsQCOM(int[] programs, int[] numPrograms) {
		long __functionAddress = GLES.getICD().glExtGetProgramsQCOM;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(numPrograms, 1);
		}
		callPPV(__functionAddress, programs, lengthSafe(programs), numPrograms);
	}

	/** Array version of: {@link #glExtGetProgramBinarySourceQCOM ExtGetProgramBinarySourceQCOM} */
	public static void glExtGetProgramBinarySourceQCOM(int program, int shadertype, ByteBuffer source, int[] length) {
		long __functionAddress = GLES.getICD().glExtGetProgramBinarySourceQCOM;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(length, 1);
		}
		callPPV(__functionAddress, program, shadertype, memAddress(source), length);
	}

}