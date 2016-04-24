/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
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
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/QCOM/QCOM_extended_get2.txt">QCOM_extended_get2</a> extension.
 * 
 * <p>This extension enables instrumenting the driver for debugging of OpenGL ES applications.</p>
 */
public class QCOMExtendedGet2 {

	protected QCOMExtendedGet2() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glExtGetShadersQCOM, caps.glExtGetProgramsQCOM, caps.glExtIsProgramBinaryQCOM, caps.glExtGetProgramBinarySourceQCOM
		);
	}

	// --- [ glExtGetShadersQCOM ] ---

	public static void nglExtGetShadersQCOM(long shaders, int maxShaders, long numShaders) {
		long __functionAddress = GLES.getCapabilities().glExtGetShadersQCOM;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, shaders, maxShaders, numShaders);
	}

	public static void glExtGetShadersQCOM(IntBuffer shaders, IntBuffer numShaders) {
		if ( CHECKS )
			if ( numShaders != null ) checkBuffer(numShaders, 1);
		nglExtGetShadersQCOM(memAddressSafe(shaders), shaders == null ? 0 : shaders.remaining(), memAddressSafe(numShaders));
	}

	// --- [ glExtGetProgramsQCOM ] ---

	public static void nglExtGetProgramsQCOM(long programs, int maxPrograms, long numPrograms) {
		long __functionAddress = GLES.getCapabilities().glExtGetProgramsQCOM;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, programs, maxPrograms, numPrograms);
	}

	public static void glExtGetProgramsQCOM(IntBuffer programs, IntBuffer numPrograms) {
		if ( CHECKS )
			if ( numPrograms != null ) checkBuffer(numPrograms, 1);
		nglExtGetProgramsQCOM(memAddressSafe(programs), programs == null ? 0 : programs.remaining(), memAddressSafe(numPrograms));
	}

	// --- [ glExtIsProgramBinaryQCOM ] ---

	public static boolean glExtIsProgramBinaryQCOM(int program) {
		long __functionAddress = GLES.getCapabilities().glExtIsProgramBinaryQCOM;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, program);
	}

	// --- [ glExtGetProgramBinarySourceQCOM ] ---

	public static void nglExtGetProgramBinarySourceQCOM(int program, int shadertype, long source, long length) {
		long __functionAddress = GLES.getCapabilities().glExtGetProgramBinarySourceQCOM;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, program, shadertype, source, length);
	}

	public static void glExtGetProgramBinarySourceQCOM(int program, int shadertype, ByteBuffer source, IntBuffer length) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglExtGetProgramBinarySourceQCOM(program, shadertype, memAddressSafe(source), memAddressSafe(length));
	}

	/** Array version of: {@link #glExtGetShadersQCOM ExtGetShadersQCOM} */
	public static void glExtGetShadersQCOM(int[] shaders, int[] numShaders) {
		long __functionAddress = GLES.getCapabilities().glExtGetShadersQCOM;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( numShaders != null ) checkBuffer(numShaders, 1);
		}
		callPPV(__functionAddress, shaders, shaders == null ? 0 : shaders.length, numShaders);
	}

	/** Array version of: {@link #glExtGetProgramsQCOM ExtGetProgramsQCOM} */
	public static void glExtGetProgramsQCOM(int[] programs, int[] numPrograms) {
		long __functionAddress = GLES.getCapabilities().glExtGetProgramsQCOM;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( numPrograms != null ) checkBuffer(numPrograms, 1);
		}
		callPPV(__functionAddress, programs, programs == null ? 0 : programs.length, numPrograms);
	}

	/** Array version of: {@link #glExtGetProgramBinarySourceQCOM ExtGetProgramBinarySourceQCOM} */
	public static void glExtGetProgramBinarySourceQCOM(int program, int shadertype, ByteBuffer source, int[] length) {
		long __functionAddress = GLES.getCapabilities().glExtGetProgramBinarySourceQCOM;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		callPPV(__functionAddress, program, shadertype, memAddressSafe(source), length);
	}

}