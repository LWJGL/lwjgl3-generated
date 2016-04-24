/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/secondary_color.txt">EXT_secondary_color</a> extension.
 * 
 * <p>This extension allows specifying the RGB components of the secondary color used in the Color Sum stage, instead of using the default (0,0,0,0) color.
 * It applies only in RGBA mode and when LIGHTING is disabled.</p>
 */
public class EXTSecondaryColor {

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

	protected EXTSecondaryColor() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glSecondaryColor3bEXT, caps.glSecondaryColor3sEXT, caps.glSecondaryColor3iEXT, caps.glSecondaryColor3fEXT, caps.glSecondaryColor3dEXT, 
			caps.glSecondaryColor3ubEXT, caps.glSecondaryColor3usEXT, caps.glSecondaryColor3uiEXT, caps.glSecondaryColor3bvEXT, caps.glSecondaryColor3svEXT, 
			caps.glSecondaryColor3ivEXT, caps.glSecondaryColor3fvEXT, caps.glSecondaryColor3dvEXT, caps.glSecondaryColor3ubvEXT, caps.glSecondaryColor3usvEXT, 
			caps.glSecondaryColor3uivEXT, caps.glSecondaryColorPointerEXT
		);
	}

	// --- [ glSecondaryColor3bEXT ] ---

	/**
	 * Sets the R, G, and B components of the current secondary color.
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3bEXT(byte red, byte green, byte blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3bEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3sEXT ] ---

	/**
	 * Short version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3sEXT(short red, short green, short blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3sEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3iEXT ] ---

	/**
	 * Integer version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3iEXT(int red, int green, int blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3iEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3fEXT ] ---

	/**
	 * Float version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3fEXT(float red, float green, float blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3fEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3dEXT ] ---

	/**
	 * Double version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3dEXT(double red, double green, double blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3dEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3ubEXT ] ---

	/**
	 * Unsigned version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3ubEXT(byte red, byte green, byte blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3ubEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3usEXT ] ---

	/**
	 * Unsigned short version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3usEXT(short red, short green, short blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3usEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3uiEXT ] ---

	/**
	 * Unsigned int version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}
	 *
	 * @param red   the red component of the current secondary color
	 * @param green the green component of the current secondary color
	 * @param blue  the blue component of the current secondary color
	 */
	public static void glSecondaryColor3uiEXT(int red, int green, int blue) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3uiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, red, green, blue);
	}

	// --- [ glSecondaryColor3bvEXT ] ---

	/**
	 * Pointer version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3bvEXT(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3bvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3bEXT SecondaryColor3bEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3bvEXT(ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3bvEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3svEXT ] ---

	/**
	 * Pointer version of {@link #glSecondaryColor3sEXT SecondaryColor3sEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3svEXT(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3svEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3sEXT SecondaryColor3sEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3svEXT(ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3svEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3ivEXT ] ---

	/**
	 * Pointer version of {@link #glSecondaryColor3iEXT SecondaryColor3iEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3ivEXT(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3ivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3iEXT SecondaryColor3iEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3ivEXT(IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3ivEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3fvEXT ] ---

	/**
	 * Pointer version of {@link #glSecondaryColor3fEXT SecondaryColor3fEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3fvEXT(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3fvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3fEXT SecondaryColor3fEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3fvEXT(FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3fvEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3dvEXT ] ---

	/**
	 * Pointer version of {@link #glSecondaryColor3dEXT SecondaryColor3dEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3dvEXT(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3dvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3dEXT SecondaryColor3dEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3dvEXT(DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3dvEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3ubvEXT ] ---

	/**
	 * Pointer version of {@link #glSecondaryColor3ubEXT SecondaryColor3ubEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3ubvEXT(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3ubvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3ubEXT SecondaryColor3ubEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3ubvEXT(ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3ubvEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3usvEXT ] ---

	/**
	 * Pointer version of {@link #glSecondaryColor3usEXT SecondaryColor3usEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3usvEXT(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3usvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3usEXT SecondaryColor3usEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3usvEXT(ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3usvEXT(memAddress(v));
	}

	// --- [ glSecondaryColor3uivEXT ] ---

	/**
	 * Pointer version of {@link #glSecondaryColor3uiEXT SecondaryColor3uiEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void nglSecondaryColor3uivEXT(long v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, v);
	}

	/**
	 * Pointer version of {@link #glSecondaryColor3uiEXT SecondaryColor3uiEXT}.
	 *
	 * @param v the secondary color buffer
	 */
	public static void glSecondaryColor3uivEXT(IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglSecondaryColor3uivEXT(memAddress(v));
	}

	// --- [ glSecondaryColorPointerEXT ] ---

	/**
	 * Specifies the location and organization of a secondary color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the secondary color array data
	 */
	public static void nglSecondaryColorPointerEXT(int size, int type, int stride, long pointer) {
		long __functionAddress = GL.getCapabilities().glSecondaryColorPointerEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * Specifies the location and organization of a secondary color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the secondary color array data
	 */
	public static void glSecondaryColorPointerEXT(int size, int type, int stride, ByteBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
	}

	/**
	 * Specifies the location and organization of a secondary color array.
	 *
	 * @param size    the number of values per vertex that are stored in the array, as well as their component ordering. Must be:<br><table><tr><td>3</td></tr></table>
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the secondary color array data
	 */
	public static void glSecondaryColorPointerEXT(int size, int type, int stride, long pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglSecondaryColorPointerEXT(size, type, stride, pointer);
	}

	/** ShortBuffer version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
	public static void glSecondaryColorPointerEXT(int size, int type, int stride, ShortBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
	public static void glSecondaryColorPointerEXT(int size, int type, int stride, IntBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
	}

	/** FloatBuffer version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
	public static void glSecondaryColorPointerEXT(int size, int type, int stride, FloatBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
	}

	/** Array version of: {@link #glSecondaryColor3svEXT SecondaryColor3svEXT} */
	public static void glSecondaryColor3svEXT(short[] v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3svEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/** Array version of: {@link #glSecondaryColor3ivEXT SecondaryColor3ivEXT} */
	public static void glSecondaryColor3ivEXT(int[] v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3ivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/** Array version of: {@link #glSecondaryColor3fvEXT SecondaryColor3fvEXT} */
	public static void glSecondaryColor3fvEXT(float[] v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3fvEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/** Array version of: {@link #glSecondaryColor3dvEXT SecondaryColor3dvEXT} */
	public static void glSecondaryColor3dvEXT(double[] v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3dvEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/** Array version of: {@link #glSecondaryColor3usvEXT SecondaryColor3usvEXT} */
	public static void glSecondaryColor3usvEXT(short[] v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3usvEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/** Array version of: {@link #glSecondaryColor3uivEXT SecondaryColor3uivEXT} */
	public static void glSecondaryColor3uivEXT(int[] v) {
		long __functionAddress = GL.getCapabilities().glSecondaryColor3uivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, v);
	}

	/** short[] version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
	public static void glSecondaryColorPointerEXT(int size, int type, int stride, short[] pointer) {
		long __functionAddress = GL.getCapabilities().glSecondaryColorPointerEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/** int[] version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
	public static void glSecondaryColorPointerEXT(int size, int type, int stride, int[] pointer) {
		long __functionAddress = GL.getCapabilities().glSecondaryColorPointerEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/** float[] version of: {@link #glSecondaryColorPointerEXT SecondaryColorPointerEXT} */
	public static void glSecondaryColorPointerEXT(int size, int type, int stride, float[] pointer) {
		long __functionAddress = GL.getCapabilities().glSecondaryColorPointerEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, size, type, stride, pointer);
	}

}