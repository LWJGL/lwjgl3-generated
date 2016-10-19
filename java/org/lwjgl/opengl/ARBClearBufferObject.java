/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
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
public class ARBClearBufferObject {

	protected ARBClearBufferObject() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, java.util.Set<String> ext) {
		return checkFunctions(
			caps.glClearBufferData, caps.glClearBufferSubData, ext.contains("GL_EXT_direct_state_access") ? caps.glClearNamedBufferDataEXT : -1L, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glClearNamedBufferSubDataEXT : -1L
		);
	}

	// --- [ glClearBufferData ] ---

	/** Unsafe version of: {@link #glClearBufferData ClearBufferData} */
	public static void nglClearBufferData(int target, int internalformat, int format, int type, long data) {
		long __functionAddress = GL.getCapabilities().glClearBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, internalformat, format, type, data);
	}

	/**
	 * Fills a buffer object's data store with a fixed value.
	 *
	 * @param target         the target of the operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
	 *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
	 *                       sub-range of the buffer is filled with zeros.
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

	/** Unsafe version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data) {
		long __functionAddress = GL.getCapabilities().glClearBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, target, internalformat, offset, size, format, type, data);
	}

	/**
	 * Fills all or part of buffer object's data store with a fixed value.
	 *
	 * @param target         the target of the operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param offset         the offset, in basic machine units into the buffer object's data store at which to start filling
	 * @param size           the size, in basic machine units of the range of the data store to fill
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
	 *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
	 *                       sub-range of the buffer is filled with zeros.
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

	/** Unsafe version of: {@link #glClearNamedBufferDataEXT ClearNamedBufferDataEXT} */
	public static void nglClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, long data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferDataEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, internalformat, format, type, data);
	}

	/**
	 * DSA version of {@link #glClearBufferData ClearBufferData}.
	 *
	 * @param buffer         the buffer object to clear
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
	 *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
	 *                       sub-range of the buffer is filled with zeros.
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

	/** Unsafe version of: {@link #glClearNamedBufferSubDataEXT ClearNamedBufferSubDataEXT} */
	public static void nglClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, long data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferSubDataEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, internalformat, offset, size, format, type, data);
	}

	/**
	 * DSA version of {@link #glClearBufferSubData ClearBufferSubData}.
	 *
	 * @param buffer         the buffer object to clear
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param offset         the offset, in basic machine units into the buffer object's data store at which to start filling
	 * @param size           the size, in basic machine units of the range of the data store to fill
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
	 *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
	 *                       sub-range of the buffer is filled with zeros.
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

	/** short[] version of: {@link #glClearBufferData ClearBufferData} */
	public static void glClearBufferData(int target, int internalformat, int format, int type, short[] data) {
		long __functionAddress = GL.getCapabilities().glClearBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, internalformat, format, type, data);
	}

	/** int[] version of: {@link #glClearBufferData ClearBufferData} */
	public static void glClearBufferData(int target, int internalformat, int format, int type, int[] data) {
		long __functionAddress = GL.getCapabilities().glClearBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, internalformat, format, type, data);
	}

	/** float[] version of: {@link #glClearBufferData ClearBufferData} */
	public static void glClearBufferData(int target, int internalformat, int format, int type, float[] data) {
		long __functionAddress = GL.getCapabilities().glClearBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, internalformat, format, type, data);
	}

	/** short[] version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, short[] data) {
		long __functionAddress = GL.getCapabilities().glClearBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, target, internalformat, offset, size, format, type, data);
	}

	/** int[] version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, int[] data) {
		long __functionAddress = GL.getCapabilities().glClearBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, target, internalformat, offset, size, format, type, data);
	}

	/** float[] version of: {@link #glClearBufferSubData ClearBufferSubData} */
	public static void glClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, float[] data) {
		long __functionAddress = GL.getCapabilities().glClearBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, target, internalformat, offset, size, format, type, data);
	}

	/** short[] version of: {@link #glClearNamedBufferDataEXT ClearNamedBufferDataEXT} */
	public static void glClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, short[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferDataEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, internalformat, format, type, data);
	}

	/** int[] version of: {@link #glClearNamedBufferDataEXT ClearNamedBufferDataEXT} */
	public static void glClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, int[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferDataEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, internalformat, format, type, data);
	}

	/** float[] version of: {@link #glClearNamedBufferDataEXT ClearNamedBufferDataEXT} */
	public static void glClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, float[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferDataEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, internalformat, format, type, data);
	}

	/** short[] version of: {@link #glClearNamedBufferSubDataEXT ClearNamedBufferSubDataEXT} */
	public static void glClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, short[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferSubDataEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, internalformat, offset, size, format, type, data);
	}

	/** int[] version of: {@link #glClearNamedBufferSubDataEXT ClearNamedBufferSubDataEXT} */
	public static void glClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, int[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferSubDataEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, internalformat, offset, size, format, type, data);
	}

	/** float[] version of: {@link #glClearNamedBufferSubDataEXT ClearNamedBufferSubDataEXT} */
	public static void glClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, float[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferSubDataEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, internalformat, offset, size, format, type, data);
	}

}