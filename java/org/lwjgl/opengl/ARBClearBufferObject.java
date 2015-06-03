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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/clear_buffer_object.txt">ARB_clear_buffer_object</a> extension.
 * 
 * <p>Buffer objects are fundamental to the operation of OpenGL. Buffers are used as a source of data for vertices and indices, read through buffer textures
 * in shaders, used to transfer texture and image data into and out of textures and framebuffers, and may be written to by operations such as transform
 * feedback. OpenGL contains mechanisms to copy sections of buffers from one to another, but it has no mechanism to initialize the content of a buffer to a
 * known value. In effect, it has {@code memcpy}, but not {@code memset}.</p>
 * 
 * <p>This extension adds such a mechanism and has several use cases. Examples include clearing a pixel unpack buffer before transferring data to a texture or
 * resetting buffer data to a known value before sparse updates through shader image stores or transform feedback.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public final class ARBClearBufferObject {

	/** Function address. */
	@JavadocExclude
	public final long
		ClearBufferData,
		ClearBufferSubData,
		ClearNamedBufferDataEXT,
		ClearNamedBufferSubDataEXT;

	@JavadocExclude
	public ARBClearBufferObject(FunctionProvider provider) {
		ClearBufferData = provider.getFunctionAddress("glClearBufferData");
		ClearBufferSubData = provider.getFunctionAddress("glClearBufferSubData");
		ClearNamedBufferDataEXT = provider.getFunctionAddress("glClearNamedBufferDataEXT");
		ClearNamedBufferSubDataEXT = provider.getFunctionAddress("glClearNamedBufferSubDataEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBClearBufferObject} instance for the current context. */
	public static ARBClearBufferObject getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBClearBufferObject);
	}

	static ARBClearBufferObject create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_clear_buffer_object") ) return null;

		ARBClearBufferObject funcs = new ARBClearBufferObject(provider);

		boolean supported = checkFunctions(
			funcs.ClearBufferData, funcs.ClearBufferSubData, ext.contains("GL_EXT_direct_state_access") ? funcs.ClearNamedBufferDataEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.ClearNamedBufferSubDataEXT : -1L
		);

		return GL.checkExtension("GL_ARB_clear_buffer_object", funcs, supported);
	}

	// --- [ glClearBufferData ] ---

	/** Unsafe version of {@link #glClearBufferData ClearBufferData} */
	@JavadocExclude
	public static void nglClearBufferData(int target, int internalformat, int format, int type, long data) {
		long __functionAddress = getInstance().ClearBufferData;
		GL43.nglClearBufferData(target, internalformat, format, type, data, __functionAddress);
	}

	/**
	 * Fills a buffer object's data store with a fixed value.
	 *
	 * @param target         the target of the operation. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param data           buffer containing the data to be used as the source of the constant fill value.
	 *                       The elements of data are converted by the GL into the format specified by internalformat,
	 *                       and then used to fill the specified range of the destination buffer.
	 *                       If data is {@code NULL}, then it is ignored and the sub-range of the buffer is filled with zeros.
	 */
	public static void glClearBufferData(int target, int internalformat, int format, int type, ByteBuffer data) {
		nglClearBufferData(target, internalformat, format, type, memAddressSafe(data));
	}

	/** ShortBuffer version of: {@link #glClearBufferData ClearBufferData} */
	public static void glClearBufferData(int target, int internalformat, int format, int type, ShortBuffer data) {
		nglClearBufferData(target, internalformat, format, type, memAddressSafe(data));
	}

	/** IntBuffer version of: {@link #glClearBufferData ClearBufferData} */
	public static void glClearBufferData(int target, int internalformat, int format, int type, IntBuffer data) {
		nglClearBufferData(target, internalformat, format, type, memAddressSafe(data));
	}

	/** FloatBuffer version of: {@link #glClearBufferData ClearBufferData} */
	public static void glClearBufferData(int target, int internalformat, int format, int type, FloatBuffer data) {
		nglClearBufferData(target, internalformat, format, type, memAddressSafe(data));
	}

	// --- [ glClearBufferSubData ] ---

	/** Unsafe version of {@link #glClearBufferSubData ClearBufferSubData} */
	@JavadocExclude
	public static void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data) {
		long __functionAddress = getInstance().ClearBufferSubData;
		GL43.nglClearBufferSubData(target, internalformat, offset, size, format, type, data, __functionAddress);
	}

	/**
	 * Fills all or part of buffer object's data store with a fixed value.
	 *
	 * @param target         the target of the operation. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param offset         the offset, in basic machine units into the buffer object's data store at which to start filling
	 * @param size           the size, in basic machine units of the range of the data store to fill
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param data           buffer containing the data to be used as the source of the constant fill value.
	 *                       The elements of data are converted by the GL into the format specified by internalformat,
	 *                       and then used to fill the specified range of the destination buffer.
	 *                       If data is {@code NULL}, then it is ignored and the sub-range of the buffer is filled with zeros.
	 */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, ByteBuffer data) {
		nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/** ShortBuffer version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, ShortBuffer data) {
		nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/** IntBuffer version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, IntBuffer data) {
		nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/** FloatBuffer version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, FloatBuffer data) {
		nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	// --- [ glClearNamedBufferDataEXT ] ---

	/** JNI method for {@link #glClearNamedBufferDataEXT ClearNamedBufferDataEXT} */
	@JavadocExclude
	public static native void nglClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #glClearNamedBufferDataEXT ClearNamedBufferDataEXT} */
	@JavadocExclude
	public static void nglClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, long data) {
		long __functionAddress = getInstance().ClearNamedBufferDataEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClearNamedBufferDataEXT(buffer, internalformat, format, type, data, __functionAddress);
	}

	/**
	 * DSA version of {@link #glClearBufferData ClearBufferData}.
	 *
	 * @param buffer         the buffer object to clear
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param data           buffer containing the data to be used as the source of the constant fill value.
	 *                       The elements of data are converted by the GL into the format specified by internalformat,
	 *                       and then used to fill the specified range of the destination buffer.
	 *                       If data is {@code NULL}, then it is ignored and the sub-range of the buffer is filled with zeros.
	 */
	public static void glClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, ByteBuffer data) {
		nglClearNamedBufferDataEXT(buffer, internalformat, format, type, memAddressSafe(data));
	}

	/** ShortBuffer version of: {@link #glClearNamedBufferDataEXT ClearNamedBufferDataEXT} */
	public static void glClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, ShortBuffer data) {
		nglClearNamedBufferDataEXT(buffer, internalformat, format, type, memAddressSafe(data));
	}

	/** IntBuffer version of: {@link #glClearNamedBufferDataEXT ClearNamedBufferDataEXT} */
	public static void glClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, IntBuffer data) {
		nglClearNamedBufferDataEXT(buffer, internalformat, format, type, memAddressSafe(data));
	}

	/** FloatBuffer version of: {@link #glClearNamedBufferDataEXT ClearNamedBufferDataEXT} */
	public static void glClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, FloatBuffer data) {
		nglClearNamedBufferDataEXT(buffer, internalformat, format, type, memAddressSafe(data));
	}

	// --- [ glClearNamedBufferSubDataEXT ] ---

	/** JNI method for {@link #glClearNamedBufferSubDataEXT ClearNamedBufferSubDataEXT} */
	@JavadocExclude
	public static native void nglClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #glClearNamedBufferSubDataEXT ClearNamedBufferSubDataEXT} */
	@JavadocExclude
	public static void nglClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, long data) {
		long __functionAddress = getInstance().ClearNamedBufferSubDataEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, data, __functionAddress);
	}

	/**
	 * DSA version of {@link #glClearBufferSubData ClearBufferSubData}.
	 *
	 * @param buffer         the buffer object to clear
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param offset         the offset, in basic machine units into the buffer object's data store at which to start filling
	 * @param size           the size, in basic machine units of the range of the data store to fill
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param data           buffer containing the data to be used as the source of the constant fill value.
	 *                       The elements of data are converted by the GL into the format specified by internalformat,
	 *                       and then used to fill the specified range of the destination buffer.
	 *                       If data is {@code NULL}, then it is ignored and the sub-range of the buffer is filled with zeros.
	 */
	public static void glClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, ByteBuffer data) {
		nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/** ShortBuffer version of: {@link #glClearNamedBufferSubDataEXT ClearNamedBufferSubDataEXT} */
	public static void glClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, ShortBuffer data) {
		nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/** IntBuffer version of: {@link #glClearNamedBufferSubDataEXT ClearNamedBufferSubDataEXT} */
	public static void glClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, IntBuffer data) {
		nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/** FloatBuffer version of: {@link #glClearNamedBufferSubDataEXT ClearNamedBufferSubDataEXT} */
	public static void glClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, FloatBuffer data) {
		nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
	}

}