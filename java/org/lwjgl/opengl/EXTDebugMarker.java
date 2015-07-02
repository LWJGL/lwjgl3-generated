/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

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
public final class EXTDebugMarker {

	/** Function address. */
	@JavadocExclude
	public final long
		InsertEventMarkerEXT,
		PushGroupMarkerEXT,
		PopGroupMarkerEXT;

	@JavadocExclude
	public EXTDebugMarker(FunctionProvider provider) {
		InsertEventMarkerEXT = provider.getFunctionAddress("glInsertEventMarkerEXT");
		PushGroupMarkerEXT = provider.getFunctionAddress("glPushGroupMarkerEXT");
		PopGroupMarkerEXT = provider.getFunctionAddress("glPopGroupMarkerEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTDebugMarker} instance for the current context. */
	public static EXTDebugMarker getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTDebugMarker);
	}

	static EXTDebugMarker create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_debug_marker") ) return null;

		EXTDebugMarker funcs = new EXTDebugMarker(provider);

		boolean supported = checkFunctions(
			funcs.InsertEventMarkerEXT, funcs.PushGroupMarkerEXT, funcs.PopGroupMarkerEXT
		);

		return GL.checkExtension("GL_EXT_debug_marker", funcs, supported);
	}

	// --- [ glInsertEventMarkerEXT ] ---

	/** JNI method for {@link #glInsertEventMarkerEXT InsertEventMarkerEXT} */
	@JavadocExclude
	public static native void nglInsertEventMarkerEXT(int length, long marker, long __functionAddress);

	/** Unsafe version of {@link #glInsertEventMarkerEXT InsertEventMarkerEXT} */
	@JavadocExclude
	public static void nglInsertEventMarkerEXT(int length, long marker) {
		long __functionAddress = getInstance().InsertEventMarkerEXT;
		nglInsertEventMarkerEXT(length, marker, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param length 
	 * @param marker 
	 */
	public static void glInsertEventMarkerEXT(int length, ByteBuffer marker) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(marker, length);
		nglInsertEventMarkerEXT(length, memAddress(marker));
	}

	/** Alternative version of: {@link #glInsertEventMarkerEXT InsertEventMarkerEXT} */
	public static void glInsertEventMarkerEXT(ByteBuffer marker) {
		nglInsertEventMarkerEXT(marker.remaining(), memAddress(marker));
	}

	/** CharSequence version of: {@link #glInsertEventMarkerEXT InsertEventMarkerEXT} */
	public static void glInsertEventMarkerEXT(CharSequence marker) {
		APIBuffer __buffer = apiBuffer();
		int markerEncoded = __buffer.stringParamUTF8(marker, false);
		int markerEncodedLen = __buffer.getOffset() - markerEncoded;
		nglInsertEventMarkerEXT(markerEncodedLen, __buffer.address(markerEncoded));
	}

	// --- [ glPushGroupMarkerEXT ] ---

	/** JNI method for {@link #glPushGroupMarkerEXT PushGroupMarkerEXT} */
	@JavadocExclude
	public static native void nglPushGroupMarkerEXT(int length, long marker, long __functionAddress);

	/** Unsafe version of {@link #glPushGroupMarkerEXT PushGroupMarkerEXT} */
	@JavadocExclude
	public static void nglPushGroupMarkerEXT(int length, long marker) {
		long __functionAddress = getInstance().PushGroupMarkerEXT;
		nglPushGroupMarkerEXT(length, marker, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param length 
	 * @param marker 
	 */
	public static void glPushGroupMarkerEXT(int length, ByteBuffer marker) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(marker, length);
		nglPushGroupMarkerEXT(length, memAddress(marker));
	}

	/** Alternative version of: {@link #glPushGroupMarkerEXT PushGroupMarkerEXT} */
	public static void glPushGroupMarkerEXT(ByteBuffer marker) {
		nglPushGroupMarkerEXT(marker.remaining(), memAddress(marker));
	}

	/** CharSequence version of: {@link #glPushGroupMarkerEXT PushGroupMarkerEXT} */
	public static void glPushGroupMarkerEXT(CharSequence marker) {
		APIBuffer __buffer = apiBuffer();
		int markerEncoded = __buffer.stringParamUTF8(marker, false);
		int markerEncodedLen = __buffer.getOffset() - markerEncoded;
		nglPushGroupMarkerEXT(markerEncodedLen, __buffer.address(markerEncoded));
	}

	// --- [ glPopGroupMarkerEXT ] ---

	/** JNI method for {@link #glPopGroupMarkerEXT PopGroupMarkerEXT} */
	@JavadocExclude
	public static native void nglPopGroupMarkerEXT(long __functionAddress);

	/**  */
	public static void glPopGroupMarkerEXT() {
		long __functionAddress = getInstance().PopGroupMarkerEXT;
		nglPopGroupMarkerEXT(__functionAddress);
	}

}