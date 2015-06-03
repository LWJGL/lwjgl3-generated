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

/**
 * The core OpenGL 3.1 functionality. OpenGL 3.1 implementations support revision 1.40 of the OpenGL Shading Language.
 * 
 * <p>Extensions promoted to core in this release:
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/draw_instanced.txt">ARB_draw_instanced</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/copy_buffer.txt">ARB_copy_buffer</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/NV/primitive_restart.txt">NV_primitive_restart</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_buffer_object.txt">ARB_texture_buffer_object</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_rectangle.txt">ARB_texture_rectangle</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/uniform_buffer_object.txt">ARB_uniform_buffer_object</a></li>
 * </ul></p>
 */
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
	public static final int GL_SIGNED_NORMALIZED = 0x8F9C;

	/**
	 * Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange,
	 * FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData.
	 */
	public static final int
		GL_COPY_READ_BUFFER  = 0x8F36,
		GL_COPY_WRITE_BUFFER = 0x8F37;

	/** Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled. */
	public static final int GL_PRIMITIVE_RESTART = 0x8F9D;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_PRIMITIVE_RESTART_INDEX = 0x8F9E;

	/**
	 * Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBuffer, MapBufferRange, BindTexture, UnmapBuffer,
	 * GetBufferSubData, GetBufferParameteriv, GetBufferPointerv, and TexBuffer, and the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, and
	 * GetIntegerv.
	 */
	public static final int GL_TEXTURE_BUFFER = 0x8C2A;

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
	public static final int GL_TEXTURE_RECTANGLE = 0x84F5;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev. */
	public static final int GL_TEXTURE_BINDING_RECTANGLE = 0x84F6;

	/** Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv and TexImage2D. */
	public static final int GL_PROXY_TEXTURE_RECTANGLE = 0x84F7;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
	public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 0x84F8;

	/** Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type sampler2DRect. */
	public static final int GL_SAMPLER_2D_RECT = 0x8B63;

	/**
	 * Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type
	 * sampler2DRectShadow.
	 */
	public static final int GL_SAMPLER_2D_RECT_SHADOW = 0x8B64;

	/** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv. */
	public static final int GL_UNIFORM_BUFFER = 0x8A11;

	/** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_UNIFORM_BUFFER_BINDING = 0x8A28;

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
	public static final int GL_INVALID_INDEX = 0xFFFFFFFF;

	/** Function address. */
	@JavadocExclude
	public final long
		DrawArraysInstanced,
		DrawElementsInstanced,
		CopyBufferSubData,
		PrimitiveRestartIndex,
		TexBuffer,
		GetUniformIndices,
		GetActiveUniformsiv,
		GetActiveUniformName,
		GetUniformBlockIndex,
		GetActiveUniformBlockiv,
		GetActiveUniformBlockName,
		UniformBlockBinding;

	@JavadocExclude
	public GL31(FunctionProvider provider) {
		DrawArraysInstanced = provider.getFunctionAddress("glDrawArraysInstanced");
		DrawElementsInstanced = provider.getFunctionAddress("glDrawElementsInstanced");
		CopyBufferSubData = provider.getFunctionAddress("glCopyBufferSubData");
		PrimitiveRestartIndex = provider.getFunctionAddress("glPrimitiveRestartIndex");
		TexBuffer = provider.getFunctionAddress("glTexBuffer");
		GetUniformIndices = provider.getFunctionAddress("glGetUniformIndices");
		GetActiveUniformsiv = provider.getFunctionAddress("glGetActiveUniformsiv");
		GetActiveUniformName = provider.getFunctionAddress("glGetActiveUniformName");
		GetUniformBlockIndex = provider.getFunctionAddress("glGetUniformBlockIndex");
		GetActiveUniformBlockiv = provider.getFunctionAddress("glGetActiveUniformBlockiv");
		GetActiveUniformBlockName = provider.getFunctionAddress("glGetActiveUniformBlockName");
		UniformBlockBinding = provider.getFunctionAddress("glUniformBlockBinding");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL31} instance for the current context. */
	public static GL31 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GL31);
	}

	static GL31 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL31") ) return null;

		GL31 funcs = new GL31(provider);

		boolean supported = checkFunctions(
			funcs.DrawArraysInstanced, funcs.DrawElementsInstanced, funcs.CopyBufferSubData, funcs.PrimitiveRestartIndex, funcs.TexBuffer, 
			funcs.GetUniformIndices, funcs.GetActiveUniformsiv, funcs.GetActiveUniformName, funcs.GetUniformBlockIndex, funcs.GetActiveUniformBlockiv, 
			funcs.GetActiveUniformBlockName, funcs.UniformBlockBinding
		);

		return GL.checkExtension("OpenGL31", funcs, supported);
	}

	// --- [ glDrawArraysInstanced ] ---

	/** JNI method for {@link #glDrawArraysInstanced DrawArraysInstanced} */
	@JavadocExclude
	public static native void nglDrawArraysInstanced(int mode, int first, int count, int primcount, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawArraysInstanced.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Draw multiple instances of a range of elements.
	 *
	 * @param mode      the kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param first     the index of the first vertex to be rendered
	 * @param count     the number of vertices to be rendered
	 * @param primcount the number of instances of the specified range of vertices to be rendered
	 */
	public static void glDrawArraysInstanced(int mode, int first, int count, int primcount) {
		long __functionAddress = getInstance().DrawArraysInstanced;
		nglDrawArraysInstanced(mode, first, count, primcount, __functionAddress);
	}

	// --- [ glDrawElementsInstanced ] ---

	/** JNI method for {@link #glDrawElementsInstanced DrawElementsInstanced} */
	@JavadocExclude
	public static native void nglDrawElementsInstanced(int mode, int count, int type, long indices, int primcount, long __functionAddress);

	/** Unsafe version of {@link #glDrawElementsInstanced DrawElementsInstanced} */
	@JavadocExclude
	public static void nglDrawElementsInstanced(int mode, int count, int type, long indices, int primcount) {
		long __functionAddress = getInstance().DrawElementsInstanced;
		nglDrawElementsInstanced(mode, count, type, indices, primcount, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDrawElementsInstanced.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Draws multiple instances of a set of elements.
	 *
	 * @param mode      the kind of primitives to render. One of:<br>{@link GL11#GL_POINTS POINTS}, {@link GL11#GL_LINE_STRIP LINE_STRIP}, {@link GL11#GL_LINE_LOOP LINE_LOOP}, {@link GL11#GL_LINES LINES}, {@link GL11#GL_POLYGON POLYGON}, {@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}, {@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}, {@link GL11#GL_TRIANGLES TRIANGLES}, {@link GL11#GL_QUAD_STRIP QUAD_STRIP}, {@link GL11#GL_QUADS QUADS}, {@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}, {@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}, {@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}, {@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}, {@link GL40#GL_PATCHES PATCHES}
	 * @param count     the number of elements to be rendered
	 * @param type      the type of the values in {@code indices}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param indices   the ByteBuffer containing the indices to be rendered
	 * @param primcount the number of instances of the specified range of indices to be rendered
	 */
	public static void glDrawElementsInstanced(int mode, int count, int type, ByteBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(indices, count / GLChecks.typeToBytes(type));
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		}
		nglDrawElementsInstanced(mode, count, type, memAddress(indices), primcount);
	}

	/** Buffer object offset version of: {@link #glDrawElementsInstanced DrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, int count, int type, long indicesOffset, int primcount) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, true);
		nglDrawElementsInstanced(mode, count, type, indicesOffset, primcount);
	}

	/** Alternative version of: {@link #glDrawElementsInstanced DrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, int type, ByteBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstanced(mode, indices.remaining() * GLChecks.typeToBytes(type), type, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_BYTE version of: {@link #glDrawElementsInstanced DrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, ByteBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstanced(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_SHORT version of: {@link #glDrawElementsInstanced DrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, ShortBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstanced(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
	}

	/** GL_UNSIGNED_INT version of: {@link #glDrawElementsInstanced DrawElementsInstanced} */
	public static void glDrawElementsInstanced(int mode, IntBuffer indices, int primcount) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING, false);
		nglDrawElementsInstanced(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount);
	}

	// --- [ glCopyBufferSubData ] ---

	/** JNI method for {@link #glCopyBufferSubData CopyBufferSubData} */
	@JavadocExclude
	public static native void nglCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCopyBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Copies all or part of one buffer object's data store to the data store of another buffer object.
	 * 
	 * <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if any of readoffset, writeoffset, or size are negative, if readoffset+size exceeds the size of the buffer object
	 * bound to readtarget, or if writeoffset+size exceeds the size of the buffer object bound to writetarget.</p>
	 * 
	 * <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if the same buffer object is bound to both readtarget and writetarget, and the ranges [readoffset, readoffset+size)
	 * and [writeoffset, writeoffset+size) overlap.</p>
	 * 
	 * <p>An {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error is generated if zero is bound to readtarget or writetarget.</p>
	 * 
	 * <p>An {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error is generated if the buffer objects bound to either readtarget or writetarget are mapped.</p>
	 *
	 * @param readTarget  the source buffer object target. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link #GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link #GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link #GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link #GL_UNIFORM_BUFFER UNIFORM_BUFFER}
	 * @param writeTarget the destination buffer object target
	 * @param readOffset  the source buffer object offset, in bytes
	 * @param writeOffset the destination buffer object offset, in bytes
	 * @param size        the number of bytes to copy
	 */
	public static void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
		long __functionAddress = getInstance().CopyBufferSubData;
		nglCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size, __functionAddress);
	}

	// --- [ glPrimitiveRestartIndex ] ---

	/** JNI method for {@link #glPrimitiveRestartIndex PrimitiveRestartIndex} */
	@JavadocExclude
	public static native void nglPrimitiveRestartIndex(int index, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glPrimitiveRestartIndex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Specifies the primitive restart index.
	 *
	 * @param index the value to be interpreted as the primitive restart index
	 */
	public static void glPrimitiveRestartIndex(int index) {
		long __functionAddress = getInstance().PrimitiveRestartIndex;
		nglPrimitiveRestartIndex(index, __functionAddress);
	}

	// --- [ glTexBuffer ] ---

	/** JNI method for {@link #glTexBuffer TexBuffer} */
	@JavadocExclude
	public static native void nglTexBuffer(int target, int internalformat, int buffer, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTexBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Attaches the storage for the buffer object named {@code buffer} to the active buffer texture, and specifies an internal format for the texel array found
	 * in the attached buffer object. If {@code buffer} is zero, any buffer object attached to the buffer texture is detached, and no new buffer object is
	 * attached. If {@code buffer} is non-zero, but is not the name of an existing buffer object, the error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated.
	 * 
	 * <p>When a buffer object is attached to a buffer texture, the buffer object's data store is taken as the texture's texel array. The number of texels in the
	 * buffer texture's texel array is given by</p>
	 * 
	 * <p><code style="font-family: monospace">floor(buffer_size / (components * sizeof(base_type))</code>,</p>
	 * 
	 * <p>where {@code buffer_size} is the size of the buffer object, in basic machine units and {@code components} and {@code base_type} are the element count
	 * and base data type for elements. The number of texels in the texel array is then clamped to the implementation-dependent limit {@link #GL_MAX_TEXTURE_BUFFER_SIZE MAX_TEXTURE_BUFFER_SIZE}.
	 * When a buffer texture is accessed in a shader, the results of a texel fetch are undefined if the specified texel number is greater than or equal to the
	 * clamped number of texels in the texel array.</p>
	 * 
	 * <p>When a buffer texture is accessed in a shader, an integer is provided to indicate the texel number being accessed. If no buffer object is bound to the
	 * buffer texture, the results of the texel access are undefined. Otherwise, the attached buffer object's data store is interpreted as an array of elements
	 * of the GL data type corresponding to {@code internalformat}. Each texel consists of one to four elements that are mapped to texture components
	 * (R, G, B, A, L, and I). Element {@code m} of the texel numbered {@code n} is taken from element {@code n} * {@code components} + {@code m} of the
	 * attached buffer object's data store. Elements and texels are both numbered starting with zero. For texture formats with normalized components, the
	 * extracted values are converted to floating-point values. The components of the texture are then converted to an (R,G,B,A) vector, and returned to the
	 * shader as a four-component result vector with components of the appropriate data type for the texture's internal format.</p>
	 *
	 * @param target         the target of the operation. Must be:<br>{@link #GL_TEXTURE_BUFFER TEXTURE_BUFFER}
	 * @param internalformat the sized internal format of the data in the store belonging to {@code buffer}
	 * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
	 */
	public static void glTexBuffer(int target, int internalformat, int buffer) {
		long __functionAddress = getInstance().TexBuffer;
		nglTexBuffer(target, internalformat, buffer, __functionAddress);
	}

	// --- [ glGetUniformIndices ] ---

	/** JNI method for {@link #glGetUniformIndices GetUniformIndices} */
	@JavadocExclude
	public static native void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices, long __functionAddress);

	/** Unsafe version of {@link #glGetUniformIndices GetUniformIndices} */
	@JavadocExclude
	public static void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices) {
		long __functionAddress = getInstance().GetUniformIndices;
		nglGetUniformIndices(program, uniformCount, uniformNames, uniformIndices, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetUniformIndices.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves the indices of a number of uniforms within a program object
	 *
	 * @param program        the name of a program containing uniforms whose indices to query
	 * @param uniformCount   the number of uniforms whose indices to query
	 * @param uniformNames   an array of pointers to buffers containing the names of the queried uniforms
	 * @param uniformIndices an array that will receive the indices of the uniforms
	 */
	public static void glGetUniformIndices(int program, int uniformCount, ByteBuffer uniformNames, ByteBuffer uniformIndices) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(uniformNames, uniformCount << POINTER_SHIFT);
			checkBuffer(uniformIndices, uniformCount << 2);
		}
		nglGetUniformIndices(program, uniformCount, memAddress(uniformNames), memAddress(uniformIndices));
	}

	/** Alternative version of: {@link #glGetUniformIndices GetUniformIndices} */
	public static void glGetUniformIndices(int program, PointerBuffer uniformNames, IntBuffer uniformIndices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(uniformIndices, uniformNames.remaining());
		nglGetUniformIndices(program, uniformNames.remaining(), memAddress(uniformNames), memAddress(uniformIndices));
	}

	/** Array version of: {@link #glGetUniformIndices GetUniformIndices} */
	public static void glGetUniformIndices(int program, CharSequence[] uniformNames, IntBuffer uniformIndices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(uniformIndices, uniformNames.length);
		APIBuffer __buffer = apiBuffer();
		int uniformNamesAddress = __buffer.bufferParam(uniformNames.length << POINTER_SHIFT);
		ByteBuffer[] uniformNamesBuffers = new ByteBuffer[uniformNames.length];
		for ( int i = 0; i < uniformNames.length; i++ )
			__buffer.pointerParam(uniformNamesAddress, i, memAddress(uniformNamesBuffers[i] = memEncodeASCII(uniformNames[i], true)));
		nglGetUniformIndices(program, uniformNames.length, __buffer.address(uniformNamesAddress), memAddress(uniformIndices));
	}

	/** Single uniformName version of: {@link #glGetUniformIndices GetUniformIndices} */
	public static int glGetUniformIndices(int program, CharSequence uniformName) {
		APIBuffer __buffer = apiBuffer();
		ByteBuffer uniformNameBuffers = memEncodeASCII(uniformName, true);
		int uniformNamesAddress = __buffer.pointerParam(memAddress(uniformNameBuffers));
		int uniformIndices = __buffer.intParam();
		nglGetUniformIndices(program, 1, __buffer.address(uniformNamesAddress), __buffer.address(uniformIndices));
		return __buffer.intValue(uniformIndices);
	}

	// --- [ glGetActiveUniformsiv ] ---

	/** JNI method for {@link #glGetActiveUniformsiv GetActiveUniformsiv} */
	@JavadocExclude
	public static native void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveUniformsiv GetActiveUniformsiv} */
	@JavadocExclude
	public static void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params) {
		long __functionAddress = getInstance().GetActiveUniformsiv;
		nglGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetActiveUniforms.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about several active uniform variables for the specified program object.
	 *
	 * @param program        the program object to be queried
	 * @param uniformCount   the number of elements in the array of indices {@code uniformIndices} and the number of parameters written to {@code params} upon successful return
	 * @param uniformIndices an array of {@code uniformCount} integers containing the indices of uniforms within {@code program}
	 * @param pname          the property of the each uniform in {@code uniformIndices} that should be written into the corresponding element of {@code params}
	 * @param params         an array of {@code uniformCount} integers which are to receive the value of {@code pname} for each uniform in {@code uniformIndices}
	 */
	public static void glGetActiveUniformsiv(int program, int uniformCount, ByteBuffer uniformIndices, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(uniformIndices, uniformCount << 2);
			checkBuffer(params, uniformCount << 2);
		}
		nglGetActiveUniformsiv(program, uniformCount, memAddress(uniformIndices), pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetActiveUniformsiv GetActiveUniformsiv} */
	public static void glGetActiveUniformsiv(int program, IntBuffer uniformIndices, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, uniformIndices.remaining());
		nglGetActiveUniformsiv(program, uniformIndices.remaining(), memAddress(uniformIndices), pname, memAddress(params));
	}

	/** Single value version of: {@link #glGetActiveUniformsiv GetActiveUniformsiv} */
	public static int glGetActiveUniformsi(int program, int uniformIndex, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		int uniformIndices = __buffer.intParam(uniformIndex);
		nglGetActiveUniformsiv(program, 1, __buffer.address(uniformIndices), pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetActiveUniformName ] ---

	/** JNI method for {@link #glGetActiveUniformName GetActiveUniformName} */
	@JavadocExclude
	public static native void nglGetActiveUniformName(int program, int uniformIndex, int bufSize, long length, long uniformName, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveUniformName GetActiveUniformName} */
	@JavadocExclude
	public static void nglGetActiveUniformName(int program, int uniformIndex, int bufSize, long length, long uniformName) {
		long __functionAddress = getInstance().GetActiveUniformName;
		nglGetActiveUniformName(program, uniformIndex, bufSize, length, uniformName, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetActiveUniformName.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the name of an active uniform.
	 *
	 * @param program      the program containing the active uniform index {@code uniformIndex}
	 * @param uniformIndex the index of the active uniform whose name to query
	 * @param bufSize      the size of the buffer, in units of {@code GLchar}, of the buffer whose address is specified in {@code uniformName}
	 * @param length       the address of a variable that will receive the number of characters that were or would have been written to the buffer addressed by {@code uniformName}
	 * @param uniformName  the address of a buffer into which the GL will place the name of the active uniform at {@code uniformIndex} within {@code program}
	 */
	public static void glGetActiveUniformName(int program, int uniformIndex, int bufSize, ByteBuffer length, ByteBuffer uniformName) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(uniformName, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetActiveUniformName(program, uniformIndex, bufSize, memAddressSafe(length), memAddress(uniformName));
	}

	/** Alternative version of: {@link #glGetActiveUniformName GetActiveUniformName} */
	public static void glGetActiveUniformName(int program, int uniformIndex, IntBuffer length, ByteBuffer uniformName) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetActiveUniformName(program, uniformIndex, uniformName.remaining(), memAddressSafe(length), memAddress(uniformName));
	}

	/** String return version of: {@link #glGetActiveUniformName GetActiveUniformName} */
	public static String glGetActiveUniformName(int program, int uniformIndex, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int uniformName = __buffer.bufferParam(bufSize);
		nglGetActiveUniformName(program, uniformIndex, bufSize, __buffer.address(length), __buffer.address(uniformName));
		return memDecodeASCII(memByteBuffer(__buffer.address(uniformName), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveUniformName GetActiveUniformName} */
	public static String glGetActiveUniformName(int program, int uniformIndex) {
		int bufSize = glGetActiveUniformsi(program, uniformIndex, GL_UNIFORM_NAME_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int uniformName = __buffer.bufferParam(bufSize);
		nglGetActiveUniformName(program, uniformIndex, bufSize, __buffer.address(length), __buffer.address(uniformName));
		return memDecodeASCII(memByteBuffer(__buffer.address(uniformName), __buffer.intValue(length)));
	}

	// --- [ glGetUniformBlockIndex ] ---

	/** JNI method for {@link #glGetUniformBlockIndex GetUniformBlockIndex} */
	@JavadocExclude
	public static native int nglGetUniformBlockIndex(int program, long uniformBlockName, long __functionAddress);

	/** Unsafe version of {@link #glGetUniformBlockIndex GetUniformBlockIndex} */
	@JavadocExclude
	public static int nglGetUniformBlockIndex(int program, long uniformBlockName) {
		long __functionAddress = getInstance().GetUniformBlockIndex;
		return nglGetUniformBlockIndex(program, uniformBlockName, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetUniformBlockIndex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves the index of a named uniform block.
	 *
	 * @param program          the name of a program containing the uniform block
	 * @param uniformBlockName an array of characters to containing the name of the uniform block whose index to retrieve
	 */
	public static int glGetUniformBlockIndex(int program, ByteBuffer uniformBlockName) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(uniformBlockName);
		return nglGetUniformBlockIndex(program, memAddress(uniformBlockName));
	}

	/** CharSequence version of: {@link #glGetUniformBlockIndex GetUniformBlockIndex} */
	public static int glGetUniformBlockIndex(int program, CharSequence uniformBlockName) {
		APIBuffer __buffer = apiBuffer();
		int uniformBlockNameEncoded = __buffer.stringParamASCII(uniformBlockName, true);
		return nglGetUniformBlockIndex(program, __buffer.address(uniformBlockNameEncoded));
	}

	// --- [ glGetActiveUniformBlockiv ] ---

	/** JNI method for {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv} */
	@JavadocExclude
	public static native void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv} */
	@JavadocExclude
	public static void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params) {
		long __functionAddress = getInstance().GetActiveUniformBlockiv;
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetActiveUniformBlock.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries information about an active uniform block.
	 *
	 * @param program           the name of a program containing the uniform block
	 * @param uniformBlockIndex the index of the uniform block within {@code program}
	 * @param pname             the name of the parameter to query. One of:<br>{@link #GL_UNIFORM_BLOCK_BINDING UNIFORM_BLOCK_BINDING}, {@link #GL_UNIFORM_BLOCK_DATA_SIZE UNIFORM_BLOCK_DATA_SIZE}, {@link #GL_UNIFORM_BLOCK_NAME_LENGTH UNIFORM_BLOCK_NAME_LENGTH}, {@link #GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS UNIFORM_BLOCK_ACTIVE_UNIFORMS}, {@link #GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES}, {@link #GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER}, {@link #GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER}, {@link #GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER}
	 * @param params            the address of a variable to receive the result of the query
	 */
	public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv} */
	public static void glGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv} */
	public static int glGetActiveUniformBlocki(int program, int uniformBlockIndex, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetActiveUniformBlockName ] ---

	/** JNI method for {@link #glGetActiveUniformBlockName GetActiveUniformBlockName} */
	@JavadocExclude
	public static native void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveUniformBlockName GetActiveUniformBlockName} */
	@JavadocExclude
	public static void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName) {
		long __functionAddress = getInstance().GetActiveUniformBlockName;
		nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetActiveUniformBlockName.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Retrieves the name of an active uniform block.
	 *
	 * @param program           the name of a program containing the uniform block
	 * @param uniformBlockIndex the index of the uniform block within {@code program}
	 * @param bufSize           the size of the buffer addressed by {@code uniformBlockName}
	 * @param length            the address of a variable to receive the number of characters that were written to {@code uniformBlockName}
	 * @param uniformBlockName  an array of characters to receive the name of the uniform block at {@code uniformBlockIndex}
	 */
	public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, ByteBuffer length, ByteBuffer uniformBlockName) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(uniformBlockName, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, memAddressSafe(length), memAddress(uniformBlockName));
	}

	/** Alternative version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName} */
	public static void glGetActiveUniformBlockName(int program, int uniformBlockIndex, IntBuffer length, ByteBuffer uniformBlockName) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetActiveUniformBlockName(program, uniformBlockIndex, uniformBlockName.remaining(), memAddressSafe(length), memAddress(uniformBlockName));
	}

	/** String return version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName} */
	public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int uniformBlockName = __buffer.bufferParam(bufSize);
		nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, __buffer.address(length), __buffer.address(uniformBlockName));
		return memDecodeASCII(memByteBuffer(__buffer.address(uniformBlockName), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName} */
	public static String glGetActiveUniformBlockName(int program, int uniformBlockIndex) {
		int bufSize = glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int uniformBlockName = __buffer.bufferParam(bufSize);
		nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, __buffer.address(length), __buffer.address(uniformBlockName));
		return memDecodeASCII(memByteBuffer(__buffer.address(uniformBlockName), __buffer.intValue(length)));
	}

	// --- [ glUniformBlockBinding ] ---

	/** JNI method for {@link #glUniformBlockBinding UniformBlockBinding} */
	@JavadocExclude
	public static native void nglUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUniformBlockBinding.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Assigns a binding point to an active uniform block.
	 *
	 * @param program             the name of a program object containing the active uniform block whose binding to assign
	 * @param uniformBlockIndex   the index of the active uniform block within {@code program} whose binding to assign
	 * @param uniformBlockBinding the binding point to which to bind the uniform block with index {@code uniformBlockIndex} within {@code program}
	 */
	public static void glUniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
		long __functionAddress = getInstance().UniformBlockBinding;
		nglUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding, __functionAddress);
	}

}