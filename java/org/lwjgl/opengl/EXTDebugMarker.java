/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/debug_marker.txt">EXT_debug_marker</a> extension.
 * 
 * <p>This extension defines a mechanism for OpenGL and OpenGL ES applications to annotate their command stream with markers for discrete events and groups
 * of commands using descriptive text markers.</p>
 * 
 * <p>When profiling or debugging such an application within a debugger or profiler it is difficult to relate the commands within the command stream to the
 * elements of the scene or parts of the program code to which they correspond. Markers help obviate this by allowing applications to specify this link.</p>
 * 
 * <p>The intended purpose of this is purely to improve the user experience within OpenGL and OpenGL ES development tools.</p>
 */
public class EXTDebugMarker {

	protected EXTDebugMarker() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glInsertEventMarkerEXT, caps.glPushGroupMarkerEXT, caps.glPopGroupMarkerEXT
		);
	}

	// --- [ glInsertEventMarkerEXT ] ---

	public static void nglInsertEventMarkerEXT(int length, long marker) {
		long __functionAddress = GL.getCapabilities().glInsertEventMarkerEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, length, marker);
	}

	public static void glInsertEventMarkerEXT(ByteBuffer marker) {
		nglInsertEventMarkerEXT(marker.remaining(), memAddress(marker));
	}

	public static void glInsertEventMarkerEXT(CharSequence marker) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer markerEncoded = stack.UTF8(marker, false);
			int markerEncodedLen = markerEncoded.capacity();
			nglInsertEventMarkerEXT(markerEncodedLen, memAddress(markerEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glPushGroupMarkerEXT ] ---

	public static void nglPushGroupMarkerEXT(int length, long marker) {
		long __functionAddress = GL.getCapabilities().glPushGroupMarkerEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, length, marker);
	}

	public static void glPushGroupMarkerEXT(ByteBuffer marker) {
		nglPushGroupMarkerEXT(marker.remaining(), memAddress(marker));
	}

	public static void glPushGroupMarkerEXT(CharSequence marker) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer markerEncoded = stack.UTF8(marker, false);
			int markerEncodedLen = markerEncoded.capacity();
			nglPushGroupMarkerEXT(markerEncodedLen, memAddress(markerEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glPopGroupMarkerEXT ] ---

	public static void glPopGroupMarkerEXT() {
		long __functionAddress = GL.getCapabilities().glPopGroupMarkerEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

}