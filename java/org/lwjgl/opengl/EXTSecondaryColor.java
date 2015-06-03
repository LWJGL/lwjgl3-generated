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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/secondary_color.txt">EXT_secondary_color</a> extension.
 * 
 * <p>This extension allows specifying the RGB components of the secondary color used in the Color Sum stage, instead of using the default (0,0,0,0) color.
 * It applies only in RGBA mode and when LIGHTING is disabled.</p>
 */
public final class EXTSecondaryColor {

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int GL_COLOR_SUM_EXT = 0x8458;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_CURRENT_SECONDARY_COLOR_EXT      = 0x8459,
		GL_SECONDARY_COLOR_ARRAY_SIZE_EXT   = 0x845A,
		GL_SECONDARY_COLOR_ARRAY_TYPE_EXT   = 0x845B,
		GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT = 0x845C;

	/** Accepted by the {@code pname} parameter of GetPointerv. */
	public static final int GL_SECONDARY_COLOR_ARRAY_POINTER_EXT = 0x845D;

	/** Accepted by the {@code array} parameter of EnableClientState and DisableClientState. */
	public static final int GL_SECONDARY_COLOR_ARRAY_EXT = 0x845E;

	/** Function address. */
	@JavadocExclude
	public final long
		SecondaryColor3bEXT,
		SecondaryColor3sEXT,
		SecondaryColor3iEXT,
		SecondaryColor3fEXT,
		SecondaryColor3dEXT,
		SecondaryColor3ubEXT,
		SecondaryColor3usEXT,
		SecondaryColor3uiEXT,
		SecondaryColor3bvEXT,
		SecondaryColor3svEXT,
		SecondaryColor3ivEXT,
		SecondaryColor3fvEXT,
		SecondaryColor3dvEXT,
		SecondaryColor3ubvEXT,
		SecondaryColor3usvEXT,
		SecondaryColor3uivEXT,
		SecondaryColorPointerEXT;

	@JavadocExclude
	public EXTSecondaryColor(FunctionProvider provider) {
		SecondaryColor3bEXT = provider.getFunctionAddress("glSecondaryColor3bEXT");
		SecondaryColor3sEXT = provider.getFunctionAddress("glSecondaryColor3sEXT");
		SecondaryColor3iEXT = provider.getFunctionAddress("glSecondaryColor3iEXT");
		SecondaryColor3fEXT = provider.getFunctionAddress("glSecondaryColor3fEXT");
		SecondaryColor3dEXT = provider.getFunctionAddress("glSecondaryColor3dEXT");
		SecondaryColor3ubEXT = provider.getFunctionAddress("glSecondaryColor3ubEXT");
		SecondaryColor3usEXT = provider.getFunctionAddress("glSecondaryColor3usEXT");
		SecondaryColor3uiEXT = provider.getFunctionAddress("glSecondaryColor3uiEXT");
		SecondaryColor3bvEXT = provider.getFunctionAddress("glSecondaryColor3bvEXT");
		SecondaryColor3svEXT = provider.getFunctionAddress("glSecondaryColor3svEXT");
		SecondaryColor3ivEXT = provider.getFunctionAddress("glSecondaryColor3ivEXT");
		SecondaryColor3fvEXT = provider.getFunctionAddress("glSecondaryColor3fvEXT");
		SecondaryColor3dvEXT = provider.getFunctionAddress("glSecondaryColor3dvEXT");
		SecondaryColor3ubvEXT = provider.getFunctionAddress("glSecondaryColor3ubvEXT");
		SecondaryColor3usvEXT = provider.getFunctionAddress("glSecondaryColor3usvEXT");
		SecondaryColor3uivEXT = provider.getFunctionAddress("glSecondaryColor3uivEXT");
		SecondaryColorPointerEXT = provider.getFunctionAddress("glSecondaryColorPointerEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTSecondaryColor} instance for the current context. */
	public static EXTSecondaryColor getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTSecondaryColor);
	}

	static EXTSecondaryColor create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_secondary_color") ) return null;

		EXTSecondaryColor funcs = new EXTSecondaryColor(provider);

		boolean supported = checkFunctions(
			funcs.SecondaryColor3bEXT, funcs.SecondaryColor3sEXT, funcs.SecondaryColor3iEXT, funcs.SecondaryColor3fEXT, funcs.SecondaryColor3dEXT, 
			funcs.SecondaryColor3ubEXT, funcs.SecondaryColor3usEXT, funcs.SecondaryColor3uiEXT, funcs.SecondaryColor3bvEXT, funcs.SecondaryColor3svEXT, 
			funcs.SecondaryColor3ivEXT, funcs.SecondaryColor3fvEXT, funcs.SecondaryColor3dvEXT, funcs.SecondaryColor3ubvEXT, funcs.SecondaryColor3usvEXT, 
			funcs.SecondaryColor3uivEXT, funcs.SecondaryColorPointerEXT
		);

		return GL.checkExtension("GL_EXT_secondary_color", funcs, supported);
	}

	// --- [ glSecondaryColor3bEXT ] ---

	/** JNI method for {@link #glSecondaryColor3bEXT SecondaryColor3bEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3bEXT(byte red, byte green, byte blue, long __functionAddress);

	/**
	 * Sets the R, G, and B components of the current secondary color.
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3bEXT(byte red, byte green, byte blue) {
		long __functionAddress = getInstance().SecondaryColor3bEXT;
		nglSecondaryColor3bEXT(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3sEXT ] ---

	/** JNI method for {@link #glSecondaryColor3sEXT SecondaryColor3sEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3sEXT(short red, short green, short blue, long __functionAddress);

	/**
	 * Short version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3sEXT(short red, short green, short blue) {
		long __functionAddress = getInstance().SecondaryColor3sEXT;
		nglSecondaryColor3sEXT(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3iEXT ] ---

	/** JNI method for {@link #glSecondaryColor3iEXT SecondaryColor3iEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3iEXT(int red, int green, int blue, long __functionAddress);

	/**
	 * Integer version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3iEXT(int red, int green, int blue) {
		long __functionAddress = getInstance().SecondaryColor3iEXT;
		nglSecondaryColor3iEXT(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3fEXT ] ---

	/** JNI method for {@link #glSecondaryColor3fEXT SecondaryColor3fEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3fEXT(float red, float green, float blue, long __functionAddress);

	/**
	 * Float version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3fEXT(float red, float green, float blue) {
		long __functionAddress = getInstance().SecondaryColor3fEXT;
		nglSecondaryColor3fEXT(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3dEXT ] ---

	/** JNI method for {@link #glSecondaryColor3dEXT SecondaryColor3dEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3dEXT(double red, double green, double blue, long __functionAddress);

	/**
	 * Double version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3dEXT(double red, double green, double blue) {
		long __functionAddress = getInstance().SecondaryColor3dEXT;
		nglSecondaryColor3dEXT(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3ubEXT ] ---

	/** JNI method for {@link #glSecondaryColor3ubEXT SecondaryColor3ubEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3ubEXT(byte red, byte green, byte blue, long __functionAddress);

	/**
	 * Unsigned version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3ubEXT(byte red, byte green, byte blue) {
		long __functionAddress = getInstance().SecondaryColor3ubEXT;
		nglSecondaryColor3ubEXT(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3usEXT ] ---

	/** JNI method for {@link #glSecondaryColor3usEXT SecondaryColor3usEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3usEXT(short red, short green, short blue, long __functionAddress);

	/**
	 * Unsigned short version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3usEXT(short red, short green, short blue) {
		long __functionAddress = getInstance().SecondaryColor3usEXT;
		nglSecondaryColor3usEXT(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3uiEXT ] ---

	/** JNI method for {@link #glSecondaryColor3uiEXT SecondaryColor3uiEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3uiEXT(int red, int green, int blue, long __functionAddress);

	/**
	 * Unsigned int version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3uiEXT(int red, int green, int blue) {
		long __functionAddress = getInstance().SecondaryColor3uiEXT;
		nglSecondaryColor3uiEXT(red, green, blue, __functionAddress);
	}

	// --- [ glSecondaryColor3bvEXT ] ---

	/** JNI method for {@link #glSecondaryColor3bvEXT SecondaryColor3bvEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3bvEXT(long v, long __functionAddress);

	/** Unsafe version of {@link #glSecondaryColor3bvEXT SecondaryColor3bvEXT} */
	@JavadocExclude
	public static void nglSecondaryColor3bvEXT(long v) {
		long __functionAddress = getInstance().SecondaryColor3bvEXT;
		nglSecondaryColor3bvEXT(v, __functionAddress);
	}

	/**
	 * Byte pointer version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3bvEXT(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3bvEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3svEXT ] ---

	/** JNI method for {@link #glSecondaryColor3svEXT SecondaryColor3svEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3svEXT(long v, long __functionAddress);

	/** Unsafe version of {@link #glSecondaryColor3svEXT SecondaryColor3svEXT} */
	@JavadocExclude
	public static void nglSecondaryColor3svEXT(long v) {
		long __functionAddress = getInstance().SecondaryColor3svEXT;
		nglSecondaryColor3svEXT(v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3sEXT SecondaryColor3sEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3svEXT(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglSecondaryColor3svEXT(memAddress(v));
	}

	/** Alternative version of: {@link #glSecondaryColor3svEXT SecondaryColor3svEXT} */
	public static void glSecondaryColor3svEXT(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3svEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3ivEXT ] ---

	/** JNI method for {@link #glSecondaryColor3ivEXT SecondaryColor3ivEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3ivEXT(long v, long __functionAddress);

	/** Unsafe version of {@link #glSecondaryColor3ivEXT SecondaryColor3ivEXT} */
	@JavadocExclude
	public static void nglSecondaryColor3ivEXT(long v) {
		long __functionAddress = getInstance().SecondaryColor3ivEXT;
		nglSecondaryColor3ivEXT(v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3iEXT SecondaryColor3iEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3ivEXT(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglSecondaryColor3ivEXT(memAddress(v));
	}

	/** Alternative version of: {@link #glSecondaryColor3ivEXT SecondaryColor3ivEXT} */
	public static void glSecondaryColor3ivEXT(IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3ivEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3fvEXT ] ---

	/** JNI method for {@link #glSecondaryColor3fvEXT SecondaryColor3fvEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3fvEXT(long v, long __functionAddress);

	/** Unsafe version of {@link #glSecondaryColor3fvEXT SecondaryColor3fvEXT} */
	@JavadocExclude
	public static void nglSecondaryColor3fvEXT(long v) {
		long __functionAddress = getInstance().SecondaryColor3fvEXT;
		nglSecondaryColor3fvEXT(v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3fEXT SecondaryColor3fEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3fvEXT(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglSecondaryColor3fvEXT(memAddress(v));
	}

	/** Alternative version of: {@link #glSecondaryColor3fvEXT SecondaryColor3fvEXT} */
	public static void glSecondaryColor3fvEXT(FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3fvEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3dvEXT ] ---

	/** JNI method for {@link #glSecondaryColor3dvEXT SecondaryColor3dvEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3dvEXT(long v, long __functionAddress);

	/** Unsafe version of {@link #glSecondaryColor3dvEXT SecondaryColor3dvEXT} */
	@JavadocExclude
	public static void nglSecondaryColor3dvEXT(long v) {
		long __functionAddress = getInstance().SecondaryColor3dvEXT;
		nglSecondaryColor3dvEXT(v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3dEXT SecondaryColor3dEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3dvEXT(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 3);
		nglSecondaryColor3dvEXT(memAddress(v));
	}

	/** Alternative version of: {@link #glSecondaryColor3dvEXT SecondaryColor3dvEXT} */
	public static void glSecondaryColor3dvEXT(DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3dvEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3ubvEXT ] ---

	/** JNI method for {@link #glSecondaryColor3ubvEXT SecondaryColor3ubvEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3ubvEXT(long v, long __functionAddress);

	/** Unsafe version of {@link #glSecondaryColor3ubvEXT SecondaryColor3ubvEXT} */
	@JavadocExclude
	public static void nglSecondaryColor3ubvEXT(long v) {
		long __functionAddress = getInstance().SecondaryColor3ubvEXT;
		nglSecondaryColor3ubvEXT(v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3ubEXT SecondaryColor3ubEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3ubvEXT(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3ubvEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3usvEXT ] ---

	/** JNI method for {@link #glSecondaryColor3usvEXT SecondaryColor3usvEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3usvEXT(long v, long __functionAddress);

	/** Unsafe version of {@link #glSecondaryColor3usvEXT SecondaryColor3usvEXT} */
	@JavadocExclude
	public static void nglSecondaryColor3usvEXT(long v) {
		long __functionAddress = getInstance().SecondaryColor3usvEXT;
		nglSecondaryColor3usvEXT(v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3usEXT SecondaryColor3usEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3usvEXT(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglSecondaryColor3usvEXT(memAddress(v));
	}

	/** Alternative version of: {@link #glSecondaryColor3usvEXT SecondaryColor3usvEXT} */
	public static void glSecondaryColor3usvEXT(ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3usvEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3uivEXT ] ---

	/** JNI method for {@link #glSecondaryColor3uivEXT SecondaryColor3uivEXT} */
	@JavadocExclude
	public static native void nglSecondaryColor3uivEXT(long v, long __functionAddress);

	/** Unsafe version of {@link #glSecondaryColor3uivEXT SecondaryColor3uivEXT} */
	@JavadocExclude
	public static void nglSecondaryColor3uivEXT(long v) {
		long __functionAddress = getInstance().SecondaryColor3uivEXT;
		nglSecondaryColor3uivEXT(v, __functionAddress);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3uiEXT SecondaryColor3uiEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3uivEXT(ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglSecondaryColor3uivEXT(memAddress(v));
	}

	/** Alternative version of: {@link #glSecondaryColor3uivEXT SecondaryColor3uivEXT} */
	public static void glSecondaryColor3uivEXT(IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3uivEXT(memAddress(v));
	}

	// --- [ glSecondaryColorPointerEXT ] ---

	/** JNI method for {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
	@JavadocExclude
	public static native void nglSecondaryColorPointerEXT(int size, int type, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
	@JavadocExclude
	public static void nglSecondaryColorPointerEXT(int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().SecondaryColorPointerEXT;
		nglSecondaryColorPointerEXT(size, type, stride, pointer, __functionAddress);
	}

	/**
	 * Specifies the location and organization of a secondary color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br>3
	 * @param type    the data type of the values stored in the array. One of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL11#GL_DOUBLE DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the secondary color array data
	 */
	public static void glSecondaryColorPointerEXT(int size, int type, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
	public static void glSecondaryColorPointerEXT(int size, int type, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglSecondaryColorPointerEXT(size, type, stride, pointerOffset);
	}

	/** GL_UNSIGNED_BYTE / GL_BYTE version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
	public static void glSecondaryColorPointerEXT(int size, boolean unsigned, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglSecondaryColorPointerEXT(size, unsigned ? GL11.GL_UNSIGNED_BYTE : GL11.GL_BYTE, stride, memAddress(pointer));
	}

	/** GL_UNSIGNED_SHORT / GL_SHORT version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
	public static void glSecondaryColorPointerEXT(int size, boolean unsigned, int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglSecondaryColorPointerEXT(size, unsigned ? GL11.GL_UNSIGNED_SHORT : GL11.GL_SHORT, stride, memAddress(pointer));
	}

	/** GL_FLOAT version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
	public static void glSecondaryColorPointerEXT(int size, int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglSecondaryColorPointerEXT(size, GL11.GL_FLOAT, stride, memAddress(pointer));
	}

}