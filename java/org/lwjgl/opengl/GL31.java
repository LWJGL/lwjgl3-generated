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
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** The core OpenGL 3.1 functionality. */
public final class GL31 {

	/** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
	public static final int
		GL_RED_SNORM    = 0x8F90,
		GL_RG_SNORM     = 0x8F91,
		GL_RGB_SNORM    = 0x8F92,
		GL_RGBA_SNORM   = 0x8F93,
		GL_R8_SNORM     = 0x8F94,
		GL_RG8_SNORM    = 0x8F95,
		GL_RGB8_SNORM   = 0x8F96,
		GL_RGBA8_SNORM  = 0x8F97,
		GL_R16_SNORM    = 0x8F98,
		GL_RG16_SNORM   = 0x8F99,
		GL_RGB16_SNORM  = 0x8F9A,
		GL_RGBA16_SNORM = 0x8F9B;

	/** Returned by GetTexLevelParameter and GetFramebufferAttachmentParameter. */
	public static final int
		GL_SIGNED_NORMALIZED = 0x8F9C;

	/**
	 * Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange,
	 * FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData.
	 */
	public static final int
		GL_COPY_READ_BUFFER  = 0x8F36,
		GL_COPY_WRITE_BUFFER = 0x8F37;

	/** Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled. */
	public static final int
		GL_PRIMITIVE_RESTART = 0x8F9D;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_PRIMITIVE_RESTART_INDEX = 0x8F9E;

	/**
	 * Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBuffer, MapBufferRange, BindTexture, UnmapBuffer,
	 * GetBufferSubData, GetBufferParameteriv, GetBufferPointerv, and TexBuffer, and the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, and
	 * GetIntegerv.
	 */
	public static final int
		GL_TEXTURE_BUFFER = 0x8C2A;

	/** Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv. */
	public static final int
		GL_MAX_TEXTURE_BUFFER_SIZE           = 0x8C2B,
		GL_TEXTURE_BINDING_BUFFER            = 0x8C2C,
		GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D,
		GL_TEXTURE_BUFFER_FORMAT             = 0x8C2E;

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled; by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and
	 * GetDoublev; and by the {@code target} parameter of BindTexture, GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameteri, TexParameterfv and
	 * TexParameteriv.
	 */
	public static final int
		GL_TEXTURE_RECTANGLE = 0x84F5;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev. */
	public static final int
		GL_TEXTURE_BINDING_RECTANGLE = 0x84F6;

	/** Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv and TexImage2D. */
	public static final int
		GL_PROXY_TEXTURE_RECTANGLE = 0x84F7;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
	public static final int
		GL_MAX_RECTANGLE_TEXTURE_SIZE = 0x84F8;

	/** Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type sampler2DRect. */
	public static final int
		GL_SAMPLER_2D_RECT = 0x8B63;

	/**
	 * Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type
	 * sampler2DRectShadow.
	 */
	public static final int
		GL_SAMPLER_2D_RECT_SHADOW = 0x8B64;

	/** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv. */
	public static final int
		GL_UNIFORM_BUFFER = 0x8A11;

	/** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_UNIFORM_BUFFER_BINDING = 0x8A28;

	/** Accepted by the {@code pname} parameter of GetIntegeri_v. */
	public static final int
		GL_UNIFORM_BUFFER_START = 0x8A29,
		GL_UNIFORM_BUFFER_SIZE  = 0x8A2A;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_UNIFORM_BLOCKS                = 0x8A2B,
		GL_MAX_GEOMETRY_UNIFORM_BLOCKS              = 0x8A2C,
		GL_MAX_FRAGMENT_UNIFORM_BLOCKS              = 0x8A2D,
		GL_MAX_COMBINED_UNIFORM_BLOCKS              = 0x8A2E,
		GL_MAX_UNIFORM_BUFFER_BINDINGS              = 0x8A2F,
		GL_MAX_UNIFORM_BLOCK_SIZE                   = 0x8A30,
		GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS   = 0x8A31,
		GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32,
		GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33,
		GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT          = 0x8A34;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int
		GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35,
		GL_ACTIVE_UNIFORM_BLOCKS                = 0x8A36;

	/** Accepted by the {@code pname} parameter of GetActiveUniformsiv. */
	public static final int
		GL_UNIFORM_TYPE          = 0x8A37,
		GL_UNIFORM_SIZE          = 0x8A38,
		GL_UNIFORM_NAME_LENGTH   = 0x8A39,
		GL_UNIFORM_BLOCK_INDEX   = 0x8A3A,
		GL_UNIFORM_OFFSET        = 0x8A3B,
		GL_UNIFORM_ARRAY_STRIDE  = 0x8A3C,
		GL_UNIFORM_MATRIX_STRIDE = 0x8A3D,
		GL_UNIFORM_IS_ROW_MAJOR  = 0x8A3E;

	/** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv. */
	public static final int
		GL_UNIFORM_BLOCK_BINDING                       = 0x8A3F,
		GL_UNIFORM_BLOCK_DATA_SIZE                     = 0x8A40,
		GL_UNIFORM_BLOCK_NAME_LENGTH                   = 0x8A41,
		GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS               = 0x8A42,
		GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES        = 0x8A43,
		GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER   = 0x8A44,
		GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45,
		GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;

	/** Returned by GetActiveUniformsiv and GetUniformBlockIndex. */
	public static final int
		GL_INVALID_INDEX = 0xFFFFFFFF;

	private GL31() {}

	// --- [ glDrawArraysInstanced ] ---

	/** JNI method for {@link #glDrawArraysInstanced} */
	public static native void nglDrawArraysInstanced(int mode, int first, int count, int primcount, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawArraysInstanced.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Draw multiple instances of a range of elements.
	 *
	 * @param mode      the kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS}, {@link GL11#GL_LINE_STRIP}, {@link GL11#GL_LINE_LOOP}, {@link GL11#GL_LINES}, {@link GL11#GL_POLYGON}, {@link GL11#GL_TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES}, {@link GL11#GL_QUAD_STRIP}, {@link GL11#GL_QUADS}, {@link GL32#GL_LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES}
	 * @param first     the starting index in the enabled arrays
	 * @param count     the number of indices to be rendered
	 * @param primcount the number of instances of the specified range of indices to be rendered
	 */
	public static void glDrawArraysInstanced(int mode, int first, int count, int primcount) {
		long __functionAddress = getInstance().glDrawArraysInstanced;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDrawArraysInstanced(mode, first, count, primcount, __functionAddress);
	}

	// --- [ glDrawElementsInstanced ] ---

	/** JNI method for {@link #glDrawElementsInstanced} */
	public static native void nglDrawElementsInstanced(int mode, int count, int type, long indices, int primcount, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDrawElementsInstanced.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Draws multiple instances of a set of elements.
	 *
	 * @param mode      the kind of primitives to render. One of:<p/>{@link GL11#GL_POINTS}, {@link GL11#GL_LINE_STRIP}, {@link GL11#GL_LINE_LOOP}, {@link GL11#GL_LINES}, {@link GL11#GL_POLYGON}, {@link GL11#GL_TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES}, {@link GL11#GL_QUAD_STRIP}, {@link GL11#GL_QUADS}, {@link GL32#GL_LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES}
	 * @param count     the number of elements to be rendered
	 * @param type      the type of the values in {@code indices}. One of:<p/>{@link GL11#GL_UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT}
	 * @param indices   a pointer to the location where the indices are stored
	 * @param primcount the number of instances of the specified range of indices to be rendered
	 */
	public static void glDrawElementsInstanced(int mode, int count, int type, ByteBuffer indices, int primcount) {
		long __functionAddress = getInstance().glDrawElementsInstanced;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(indices, count * GLChecks.translateTypeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstanced(mode, count, type, memAddress(indices), primcount, __functionAddress);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, int count, int type, long indicesOffset, int primcount) {
		long __functionAddress = getInstance().glDrawElementsInstanced;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		}
		nglDrawElementsInstanced(mode, count, type, indicesOffset, primcount, __functionAddress);
	}

	/** Alternative version of: {@link #glDrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int primcount) {
		long __functionAddress = getInstance().glDrawElementsInstanced;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		}
		nglDrawElementsInstanced(mode, indices.remaining(), type, memAddress(indices), primcount, __functionAddress);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, ByteBuffer indices, int primcount) {
		long __functionAddress = getInstance().glDrawElementsInstanced;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstanced(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount, __functionAddress);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, ShortBuffer indices, int primcount) {
		long __functionAddress = getInstance().glDrawElementsInstanced;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstanced(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount, __functionAddress);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, IntBuffer indices, int primcount) {
		long __functionAddress = getInstance().glDrawElementsInstanced;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstanced(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount, __functionAddress);
	}

	// --- [ glCopyBufferSubData ] ---

	/** JNI method for {@link #glCopyBufferSubData} */
	public static native void nglCopyBufferSubData(int readtarget, int writetarget, long readoffset, long writeoffset, long size, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glCopyBufferSubData.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Copies part of the data store of a buffer object to the data store of another buffer object.
	 *
	 * @param readtarget  the target from whose data store data should be read
	 * @param writetarget the target to whose data store data should be written
	 * @param readoffset  the offset, in basic machine units, within the data store of {@code readtarget} from which data should be read
	 * @param writeoffset the offset, in basic machine units, within the data store of {@code writetarget} to which data should be written
	 * @param size        the size, in basic machine units, of the data to be copied from {@code readtarget} to {@code writetarget}
	 */
	public static void glCopyBufferSubData(int readtarget, int writetarget, long readoffset, long writeoffset, long size) {
		long __functionAddress = getInstance().glCopyBufferSubData;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglCopyBufferSubData(readtarget, writetarget, readoffset, writeoffset, size, __functionAddress);
	}

	// --- [ glPrimitiveRestartIndex ] ---

	/** JNI method for {@link #glPrimitiveRestartIndex} */
	public static native void nglPrimitiveRestartIndex(int index, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glPrimitiveRestartIndex.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Specifies the primitive restart index.
	 *
	 * @param index the value to be interpreted as the primitive restart index
	 */
	public static void glPrimitiveRestartIndex(int index) {
		long __functionAddress = getInstance().glPrimitiveRestartIndex;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglPrimitiveRestartIndex(index, __functionAddress);
	}

	// --- [ glTexBuffer ] ---

	/** JNI method for {@link #glTexBuffer} */
	public static native void nglTexBuffer(int target, int internalformat, int buffer, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexBuffer.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Attaches the storage for a buffer object to the active buffer texture.
	 *
	 * @param target         the target of the operation. Must be:<p/>{@link #GL_TEXTURE_BUFFER}
	 * @param internalformat the internal format of the data in the store belonging to {@code buffer}
	 * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
	 */
	public static void glTexBuffer(int target, int internalformat, int buffer) {
		long __functionAddress = getInstance().glTexBuffer;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexBuffer(target, internalformat, buffer, __functionAddress);
	}

	// --- [ glGetUniformIndices ] ---

	/** JNI method for {@link #glGetUniformIndices} */
	public static native void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetUniformIndices.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves the indices of a number of uniforms within a program object
	 *
	 * @param program        the name of a program containing uniforms whose indices to query
	 * @param uniformCount   the number of uniforms whose indices to query
	 * @param uniformNames   an array of pointers to buffers containing the names of the queried uniforms
	 * @param uniformIndices an array that will receive the indices of the uniforms
	 */
	public static void glGetUniformIndices(int program, int uniformCount, ByteBuffer uniformNames, ByteBuffer uniformIndices) {
		long __functionAddress = getInstance().glGetUniformIndices;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(uniformNames, uniformCount << POINTER_SHIFT);
			checkBuffer(uniformIndices, uniformCount << 2);
		}
		nglGetUniformIndices(program, uniformCount, memAddress(uniformNames), memAddress(uniformIndices), __functionAddress);
	}

	/** Alternative version of: {@link #glGetUniformIndices} */
	public static void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices) {
		long __functionAddress = getInstance().glGetUniformIndices;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(uniformIndices, uniformNames.remaining());
		}
		nglGetUniformIndices(program, uniformNames.remaining(), memAddress(uniformNames), memAddress(uniformIndices), __functionAddress);
	}

	/** Array version of: {@link #glGetUniformIndices} */
	public static void glGetUniformIndices(int program, CharSequence[] uniformNames, IntBuffer uniformIndices) {
		long __functionAddress = getInstance().glGetUniformIndices;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(uniformIndices, uniformNames.length);
		}
		APIBuffer __buffer = apiBuffer();
		int uniformNamesAddress = __buffer.bufferParam(uniformNames.length << POINTER_SHIFT);
		ByteBuffer[] uniformNamesBuffers = new ByteBuffer[uniformNames.length];
		for ( int i = 0; i < uniformNames.length; i++ )
			__buffer.pointerValue(uniformNamesAddress + (i << POINTER_SHIFT), memAddress(uniformNamesBuffers[i] = memEncodeASCII(uniformNames[i], true)));
		nglGetUniformIndices(program, uniformNames.length, __buffer.address() + uniformNamesAddress, memAddress(uniformIndices), __functionAddress);
	}

	/** Single uniformName version of: {@link #glGetUniformIndices} */
	public static int glGetUniformIndices(int program, CharSequence uniformName) {
		long __functionAddress = getInstance().glGetUniformIndices;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int uniformNamesAddress = __buffer.pointerParam();
		ByteBuffer uniformNameBuffers = memEncodeASCII(uniformName, true);
		__buffer.pointerValue(uniformNamesAddress, memAddress(uniformNameBuffers));
		int uniformIndices = __buffer.intParam();
		nglGetUniformIndices(program, 1, __buffer.address() + uniformNamesAddress, __buffer.address() + uniformIndices, __functionAddress);
		return __buffer.intValue(uniformIndices);
	}

	// --- [ glGetActiveUniformsiv ] ---

	/** JNI method for {@link #glGetActiveUniformsi(int, int, ByteBuffer, int, ByteBuffer)} */
	public static native void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetActiveUniforms.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns information about several active uniform variables for the specified program object.
	 *
	 * @param program        the program object to be queried
	 * @param uniformCount   the number of elements in the array of indices {@code uniformIndices} and the number of parameters written to {@code params} upon successful return
	 * @param uniformIndices an array of {@code uniformCount} integers containing the indices of uniforms within {@code program}
	 * @param pname          the property of the each uniform in {@code uniformIndices} that should be written into the corresponding element of {@code params}
	 * @param params         an array of {@code uniformCount} integers which are to receive the value of {@code pname} for each uniform in {@code uniformIndices}
	 */
	public static void glGetActiveUniformsi(int program, int uniformCount, ByteBuffer uniformIndices, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetActiveUniformsiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(uniformIndices, uniformCount << 2);
			checkBuffer(params, uniformCount << 2);
		}
		nglGetActiveUniformsiv(program, uniformCount, memAddress(uniformIndices), pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetActiveUniformsi(int, int, ByteBuffer, int, ByteBuffer)} */
	public static void glGetActiveUniforms(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetActiveUniformsiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, uniformIndices.remaining());
		}
		nglGetActiveUniformsiv(program, uniformIndices.remaining(), memAddress(uniformIndices), pname, memAddress(params), __functionAddress);
	}

	/** Single value version of: {@link #glGetActiveUniformsi(int, int, ByteBuffer, int, ByteBuffer)} */
	public static int glGetActiveUniformsi(int program, int uniformIndex, int pname) {
		long __functionAddress = getInstance().glGetActiveUniformsiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int uniformIndices = __buffer.intParam();
		__buffer.intValue(uniformIndices, uniformIndex);
		int params = __buffer.intParam();
		nglGetActiveUniformsiv(program, 1, __buffer.address() + uniformIndices, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetActiveUniformName ] ---

	/** JNI method for {@link #glGetActiveUniformName} */
	public static native void nglGetActiveUniformName(int program, int uniformIndex, int bufSize, long length, long uniformName, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetActiveUniformName.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries the name of an active uniform.
	 *
	 * @param program      the program containing the active uniform index {@code uniformIndex}
	 * @param uniformIndex the index of the active uniform whose name to query
	 * @param bufSize      the size of the buffer, in units of {@code GLchar}, of the buffer whose address is specified in {@code uniformName}
	 * @param length       the address of a variable that will receive the number of characters that were or would have been written to the buffer addressed by {@code uniformName}
	 * @param uniformName  the address of a buffer into which the GL will place the name of the active uniform at {@code uniformIndex} within {@code program}
	 */
	public static void glGetActiveUniformName(int program, int uniformIndex, int bufSize, ByteBuffer length, ByteBuffer uniformName) {
		long __functionAddress = getInstance().glGetActiveUniformName;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(uniformName, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetActiveUniformName(program, uniformIndex, bufSize, memAddressSafe(length), memAddress(uniformName), __functionAddress);
	}

	/** Alternative version of: {@link #glGetActiveUniformName} */
	public static void glGetActiveUniformName(int program, int uniformIndex, IntBuffer length, ByteBuffer uniformName) {
		long __functionAddress = getInstance().glGetActiveUniformName;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		nglGetActiveUniformName(program, uniformIndex, uniformName.remaining(), memAddressSafe(length), memAddress(uniformName), __functionAddress);
	}

	/** String return version of: {@link #glGetActiveUniformName} */
	public static String glGetActiveUniformName(int program, int uniformIndex, int bufSize) {
		long __functionAddress = getInstance().glGetActiveUniformName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int uniformName = __buffer.bufferParam(bufSize);
		int length = __buffer.intParam();
		nglGetActiveUniformName(program, uniformIndex, bufSize, __buffer.address() + length, __buffer.address() + uniformName, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + uniformName, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveUniformName} */
	public static String glGetActiveUniformName(int program, int uniformIndex) {
		long __functionAddress = getInstance().glGetActiveUniformName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		int bufSize = glGetActiveUniformsi(program, uniformIndex, GL_UNIFORM_NAME_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int uniformName = __buffer.bufferParam(bufSize);
		int length = __buffer.intParam();
		nglGetActiveUniformName(program, uniformIndex, bufSize, __buffer.address() + length, __buffer.address() + uniformName, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + uniformName, __buffer.intValue(length)));
	}

	// --- [ glGetUniformBlockIndex ] ---

	/** JNI method for {@link #glGetUniformBlockIndex} */
	public static native int nglGetUniformBlockIndex(int program, long uniformBlockName, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetUniformBlockIndex.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves the index of a named uniform block.
	 *
	 * @param program          the name of a program containing the uniform block
	 * @param uniformBlockName an array of characters to containing the name of the uniform block whose index to retrieve
	 */
	public static int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
		long __functionAddress = getInstance().glGetUniformBlockIndex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(uniformBlockName);
		}
		return nglGetUniformBlockIndex(program, memAddress(uniformBlockName), __functionAddress);
	}

	/** CharSequence version of: {@link #glGetUniformBlockIndex} */
	public static int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
		long __functionAddress = getInstance().glGetUniformBlockIndex;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGetUniformBlockIndex(program, memAddress(memEncodeASCII(uniformBlockName)), __functionAddress);
	}

	// --- [ glGetActiveUniformBlockiv ] ---

	/** JNI method for {@link #glGetActiveUniformBlocki(int, int, int, ByteBuffer)} */
	public static native void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetActiveUniformBlock.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries information about an active uniform block.
	 *
	 * @param program           the name of a program containing the uniform block
	 * @param uniformBlockIndex the index of the uniform block within {@code program}
	 * @param pname             the name of the parameter to query. One of:<p/>{@link #GL_UNIFORM_BLOCK_BINDING}, {@link #GL_UNIFORM_BLOCK_DATA_SIZE}, {@link #GL_UNIFORM_BLOCK_NAME_LENGTH}, {@link #GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS}, {@link #GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES}, {@link #GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER}, {@link #GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER}, {@link #GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER}
	 * @param params            the address of a variable to receive the result of the query
	 */
	public static void glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetActiveUniformBlockiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetActiveUniformBlocki(int, int, int, ByteBuffer)} */
	public static void glGetActiveUniformBlock(int program, int uniformBlockIndex, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetActiveUniformBlockiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetActiveUniformBlocki(int, int, int, ByteBuffer)} */
	public static int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname) {
		long __functionAddress = getInstance().glGetActiveUniformBlockiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetActiveUniformBlockName ] ---

	/** JNI method for {@link #glGetActiveUniformBlockName} */
	public static native void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetActiveUniformBlockName.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Retrieves the name of an active uniform block.
	 *
	 * @param program           the name of a program containing the uniform block
	 * @param uniformBlockIndex the index of the uniform block within {@code program}
	 * @param bufSize           the size of the buffer addressed by {@code uniformBlockName}
	 * @param length            the address of a variable to receive the number of characters that were written to {@code uniformBlockName}
	 * @param uniformBlockName  an array of characters to receive the name of the uniform block at {@code uniformBlockIndex}
	 */
	public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, ByteBuffer length, ByteBuffer uniformBlockName) {
		long __functionAddress = getInstance().glGetActiveUniformBlockName;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(uniformBlockName, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, memAddressSafe(length), memAddress(uniformBlockName), __functionAddress);
	}

	/** Alternative version of: {@link #glGetActiveUniformBlockName} */
	public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName) {
		long __functionAddress = getInstance().glGetActiveUniformBlockName;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
		}
		nglGetActiveUniformBlockName(program, uniformBlockIndex, uniformBlockName.remaining(), memAddressSafe(length), memAddress(uniformBlockName), __functionAddress);
	}

	/** String return version of: {@link #glGetActiveUniformBlockName} */
	public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
		long __functionAddress = getInstance().glGetActiveUniformBlockName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int uniformBlockName = __buffer.bufferParam(bufSize);
		nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, __buffer.address() + length, __buffer.address() + uniformBlockName, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + uniformBlockName, __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveUniformBlockName} */
	public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
		long __functionAddress = getInstance().glGetActiveUniformBlockName;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		int bufSize = glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int uniformBlockName = __buffer.bufferParam(bufSize);
		nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, __buffer.address() + length, __buffer.address() + uniformBlockName, __functionAddress);
		return memDecodeASCII(memByteBuffer(__buffer.address() + uniformBlockName, __buffer.intValue(length)));
	}

	// --- [ glUniformBlockBinding ] ---

	/** JNI method for {@link #glUniformBlockBinding} */
	public static native void nglUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glUniformBlockBinding.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Assigns a binding point to an active uniform block.
	 *
	 * @param program             the name of a program object containing the active uniform block whose binding to assign
	 * @param uniformBlockIndex   the index of the active uniform block within {@code program} whose binding to assign
	 * @param uniformBlockBinding the binding point to which to bind the uniform block with index {@code uniformBlockIndex} within {@code program}
	 */
	public static void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
		long __functionAddress = getInstance().glUniformBlockBinding;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding, __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GL31;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL31") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			GL.isFunctionSupported(funcs.glDrawArraysInstanced) &&
			GL.isFunctionSupported(funcs.glDrawElementsInstanced) &&
			GL.isFunctionSupported(funcs.glCopyBufferSubData) &&
			GL.isFunctionSupported(funcs.glPrimitiveRestartIndex) &&
			GL.isFunctionSupported(funcs.glTexBuffer) &&
			GL.isFunctionSupported(funcs.glGetUniformIndices) &&
			GL.isFunctionSupported(funcs.glGetActiveUniformsiv) &&
			GL.isFunctionSupported(funcs.glGetActiveUniformName) &&
			GL.isFunctionSupported(funcs.glGetUniformBlockIndex) &&
			GL.isFunctionSupported(funcs.glGetActiveUniformBlockiv) &&
			GL.isFunctionSupported(funcs.glGetActiveUniformBlockName) &&
			GL.isFunctionSupported(funcs.glUniformBlockBinding);

		return GL.checkExtension("OpenGL31", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GL31}. */
	public static final class Functions implements FunctionMap {

		public final long
			glDrawArraysInstanced,
			glDrawElementsInstanced,
			glCopyBufferSubData,
			glPrimitiveRestartIndex,
			glTexBuffer,
			glGetUniformIndices,
			glGetActiveUniformsiv,
			glGetActiveUniformName,
			glGetUniformBlockIndex,
			glGetActiveUniformBlockiv,
			glGetActiveUniformBlockName,
			glUniformBlockBinding;

		public Functions(FunctionProvider provider) {
			glDrawArraysInstanced = provider.getFunctionAddress("glDrawArraysInstanced");
			glDrawElementsInstanced = provider.getFunctionAddress("glDrawElementsInstanced");
			glCopyBufferSubData = provider.getFunctionAddress("glCopyBufferSubData");
			glPrimitiveRestartIndex = provider.getFunctionAddress("glPrimitiveRestartIndex");
			glTexBuffer = provider.getFunctionAddress("glTexBuffer");
			glGetUniformIndices = provider.getFunctionAddress("glGetUniformIndices");
			glGetActiveUniformsiv = provider.getFunctionAddress("glGetActiveUniformsiv");
			glGetActiveUniformName = provider.getFunctionAddress("glGetActiveUniformName");
			glGetUniformBlockIndex = provider.getFunctionAddress("glGetUniformBlockIndex");
			glGetActiveUniformBlockiv = provider.getFunctionAddress("glGetActiveUniformBlockiv");
			glGetActiveUniformBlockName = provider.getFunctionAddress("glGetActiveUniformBlockName");
			glUniformBlockBinding = provider.getFunctionAddress("glUniformBlockBinding");
		}

	}

}