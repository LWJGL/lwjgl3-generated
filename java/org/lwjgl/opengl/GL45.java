/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The core OpenGL 4.5 functionality. OpenGL 4.5 implementations support revision 4.50 of the OpenGL Shading Language.
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/clip_control.txt">ARB_clip_control</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/cull_distance.txt">ARB_cull_distance</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/ES3_1_compatibility.txt">ARB_ES3_1_compatibility</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/conditional_render_inverted.txt">ARB_conditional_render_inverted</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/KHR/context_flush_control.txt">KHR_context_flush_control</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/derivative_control.txt">ARB_derivative_control</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/direct_state_access.txt">ARB_direct_state_access</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/get_texture_sub_image.txt">ARB_get_texture_sub_image</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/KHR/robustness.txt">KHR_robustness</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/shader_texture_image_samples.txt">ARB_shader_texture_image_samples</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_barrier.txt">ARB_texture_barrier</a></li>
 * </ul>
 */
public class GL45 {

	/** Accepted by the {@code depth} parameter of {@link #glClipControl ClipControl}. */
	public static final int
		GL_NEGATIVE_ONE_TO_ONE = 0x935E,
		GL_ZERO_TO_ONE         = 0x935F;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_CLIP_ORIGIN     = 0x935C,
		GL_CLIP_DEPTH_MODE = 0x935D;

	/** Accepted by the {@code mode} parameter of {@link GL30#glBeginConditionalRender BeginConditionalRender}. */
	public static final int
		GL_QUERY_WAIT_INVERTED              = 0x8E17,
		GL_QUERY_NO_WAIT_INVERTED           = 0x8E18,
		GL_QUERY_BY_REGION_WAIT_INVERTED    = 0x8E19,
		GL_QUERY_BY_REGION_NO_WAIT_INVERTED = 0x8E1A;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v. */
	public static final int
		GL_MAX_CULL_DISTANCES                   = 0x82F9,
		GL_MAX_COMBINED_CLIP_AND_CULL_DISTANCES = 0x82FA;

	/** Accepted by the {@code pname} parameter of GetTextureParameter{if}v and GetTextureParameterI{i ui}v. */
	public static final int GL_TEXTURE_TARGET = 0x1006;

	/** Accepted by the {@code pname} parameter of GetQueryObjectiv. */
	public static final int GL_QUERY_TARGET = 0x82EA;

	/** Accepted by the {@code pname} parameter of GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v. */
	public static final int GL_CONTEXT_RELEASE_BEHAVIOR = 0x82FB;

	/** Returned in {@code data} by GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v when {@code pname} is {@link #GL_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}. */
	public static final int GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x82FC;

	/** Returned by {@link #glGetGraphicsResetStatus GetGraphicsResetStatus}. */
	public static final int
		GL_GUILTY_CONTEXT_RESET   = 0x8253,
		GL_INNOCENT_CONTEXT_RESET = 0x8254,
		GL_UNKNOWN_CONTEXT_RESET  = 0x8255;

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int GL_RESET_NOTIFICATION_STRATEGY = 0x8256;

	/** Returned by GetIntegerv and related simple queries when {@code value} is {@link #GL_RESET_NOTIFICATION_STRATEGY RESET_NOTIFICATION_STRATEGY}. */
	public static final int
		GL_LOSE_CONTEXT_ON_RESET = 0x8252,
		GL_NO_RESET_NOTIFICATION = 0x8261;

	/** Returned by GetIntegerv when {@code pname} is CONTEXT_FLAGS. */
	public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT = 0x4;

	/** Returned by {@link GL11#glGetError GetError}. */
	public static final int GL_CONTEXT_LOST = 0x507;

	protected GL45() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, java.util.Set<String> ext) {
		return checkFunctions(
			caps.glClipControl, caps.glCreateTransformFeedbacks, caps.glTransformFeedbackBufferBase, caps.glTransformFeedbackBufferRange, 
			caps.glGetTransformFeedbackiv, caps.glGetTransformFeedbacki_v, caps.glGetTransformFeedbacki64_v, caps.glCreateBuffers, caps.glNamedBufferStorage, 
			caps.glNamedBufferData, caps.glNamedBufferSubData, caps.glCopyNamedBufferSubData, caps.glClearNamedBufferData, caps.glClearNamedBufferSubData, 
			caps.glMapNamedBuffer, caps.glMapNamedBufferRange, caps.glUnmapNamedBuffer, caps.glFlushMappedNamedBufferRange, caps.glGetNamedBufferParameteriv, 
			caps.glGetNamedBufferParameteri64v, caps.glGetNamedBufferPointerv, caps.glGetNamedBufferSubData, caps.glCreateFramebuffers, 
			caps.glNamedFramebufferRenderbuffer, caps.glNamedFramebufferParameteri, caps.glNamedFramebufferTexture, caps.glNamedFramebufferTextureLayer, 
			caps.glNamedFramebufferDrawBuffer, caps.glNamedFramebufferDrawBuffers, caps.glNamedFramebufferReadBuffer, caps.glInvalidateNamedFramebufferData, 
			caps.glInvalidateNamedFramebufferSubData, caps.glClearNamedFramebufferiv, caps.glClearNamedFramebufferuiv, caps.glClearNamedFramebufferfv, 
			caps.glClearNamedFramebufferfi, caps.glBlitNamedFramebuffer, caps.glCheckNamedFramebufferStatus, caps.glGetNamedFramebufferParameteriv, 
			caps.glGetNamedFramebufferAttachmentParameteriv, caps.glCreateRenderbuffers, caps.glNamedRenderbufferStorage, 
			caps.glNamedRenderbufferStorageMultisample, caps.glGetNamedRenderbufferParameteriv, caps.glCreateTextures, caps.glTextureBuffer, 
			caps.glTextureBufferRange, caps.glTextureStorage1D, caps.glTextureStorage2D, caps.glTextureStorage3D, caps.glTextureStorage2DMultisample, 
			caps.glTextureStorage3DMultisample, caps.glTextureSubImage1D, caps.glTextureSubImage2D, caps.glTextureSubImage3D, 
			caps.glCompressedTextureSubImage1D, caps.glCompressedTextureSubImage2D, caps.glCompressedTextureSubImage3D, caps.glCopyTextureSubImage1D, 
			caps.glCopyTextureSubImage2D, caps.glCopyTextureSubImage3D, caps.glTextureParameterf, caps.glTextureParameterfv, caps.glTextureParameteri, 
			caps.glTextureParameterIiv, caps.glTextureParameterIuiv, caps.glTextureParameteriv, caps.glGenerateTextureMipmap, caps.glBindTextureUnit, 
			caps.glGetTextureImage, caps.glGetCompressedTextureImage, caps.glGetTextureLevelParameterfv, caps.glGetTextureLevelParameteriv, 
			caps.glGetTextureParameterfv, caps.glGetTextureParameterIiv, caps.glGetTextureParameterIuiv, caps.glGetTextureParameteriv, 
			caps.glCreateVertexArrays, caps.glDisableVertexArrayAttrib, caps.glEnableVertexArrayAttrib, caps.glVertexArrayElementBuffer, 
			caps.glVertexArrayVertexBuffer, caps.glVertexArrayVertexBuffers, caps.glVertexArrayAttribFormat, caps.glVertexArrayAttribIFormat, 
			caps.glVertexArrayAttribLFormat, caps.glVertexArrayAttribBinding, caps.glVertexArrayBindingDivisor, caps.glGetVertexArrayiv, 
			caps.glGetVertexArrayIndexediv, caps.glGetVertexArrayIndexed64iv, caps.glCreateSamplers, caps.glCreateProgramPipelines, caps.glCreateQueries, 
			caps.glGetQueryBufferObjectiv, caps.glGetQueryBufferObjectuiv, caps.glGetQueryBufferObjecti64v, caps.glGetQueryBufferObjectui64v, 
			caps.glMemoryBarrierByRegion, caps.glGetTextureSubImage, caps.glGetCompressedTextureSubImage, caps.glTextureBarrier, caps.glGetGraphicsResetStatus, 
			caps.glReadnPixels, caps.glGetnUniformfv, caps.glGetnUniformiv, caps.glGetnUniformuiv
		);
	}

	// --- [ glClipControl ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClipControl.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Controls the clipping volume behavior.
	 * 
	 * <p>These parameters update the clip control origin and depth mode respectively. The initial value of the clip control origin is {@link GL20#GL_LOWER_LEFT LOWER_LEFT} and the
	 * initial value of the depth mode is {@link #GL_NEGATIVE_ONE_TO_ONE NEGATIVE_ONE_TO_ONE}.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if ClipControl is executed between the execution of {@link GL11#glBegin Begin} and the corresponding
	 * execution of {@link GL11#glEnd End}.</p>
	 *
	 * @param origin the clip origin. One of:<br><table><tr><td>{@link GL20#GL_LOWER_LEFT LOWER_LEFT}</td><td>{@link GL20#GL_UPPER_LEFT UPPER_LEFT}</td></tr></table>
	 * @param depth  the clip depth mode. One of:<br><table><tr><td>{@link #GL_NEGATIVE_ONE_TO_ONE NEGATIVE_ONE_TO_ONE}</td><td>{@link #GL_ZERO_TO_ONE ZERO_TO_ONE}</td></tr></table>
	 */
	public static void glClipControl(int origin, int depth) {
		long __functionAddress = GL.getCapabilities().glClipControl;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, origin, depth);
	}

	// --- [ glCreateTransformFeedbacks ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateTransformFeedbacks.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector.
	 *
	 * @param n   the number of transform feedback object names to create
	 * @param ids the buffer in which to return the names
	 */
	public static void nglCreateTransformFeedbacks(int n, long ids) {
		long __functionAddress = GL.getCapabilities().glCreateTransformFeedbacks;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, ids);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateTransformFeedbacks.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector.
	 *
	 * @param ids the buffer in which to return the names
	 */
	public static void glCreateTransformFeedbacks(IntBuffer ids) {
		nglCreateTransformFeedbacks(ids.remaining(), memAddress(ids));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateTransformFeedbacks.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector.
	 */
	public static int glCreateTransformFeedbacks() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.callocInt(1);
			nglCreateTransformFeedbacks(1, memAddress(ids));
			return ids.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glTransformFeedbackBufferBase ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTransformFeedbackBufferBase.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a buffer object to a transform feedback object.
	 *
	 * @param xfb    zero or the name of an existing transform feedback object
	 * @param index  the transform feedback stream index
	 * @param buffer the name of an existing buffer object
	 */
	public static void glTransformFeedbackBufferBase(int xfb, int index, int buffer) {
		long __functionAddress = GL.getCapabilities().glTransformFeedbackBufferBase;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, xfb, index, buffer);
	}

	// --- [ glTransformFeedbackBufferRange ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTransformFeedbackBufferRange.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a region of a buffer object to a transform feedback object.
	 *
	 * @param xfb    zero or the name of an existing transform feedback object
	 * @param index  the transform feedback stream index
	 * @param buffer the name of an existing buffer object
	 * @param offset the starting offset in basic machine units into the buffer object
	 * @param size   the amount of data in machine units
	 */
	public static void glTransformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size) {
		long __functionAddress = GL.getCapabilities().glTransformFeedbackBufferRange;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, xfb, index, buffer, offset, size);
	}

	// --- [ glGetTransformFeedbackiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about a transform feedback object.
	 *
	 * @param xfb   zero or the name of an existing transform feedback object
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL42#GL_TRANSFORM_FEEDBACK_PAUSED TRANSFORM_FEEDBACK_PAUSED}</td><td>{@link GL42#GL_TRANSFORM_FEEDBACK_ACTIVE TRANSFORM_FEEDBACK_ACTIVE}</td></tr></table>
	 * @param param the buffer in which to return the parameter value
	 */
	public static void nglGetTransformFeedbackiv(int xfb, int pname, long param) {
		long __functionAddress = GL.getCapabilities().glGetTransformFeedbackiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, xfb, pname, param);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about a transform feedback object.
	 *
	 * @param xfb   zero or the name of an existing transform feedback object
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL42#GL_TRANSFORM_FEEDBACK_PAUSED TRANSFORM_FEEDBACK_PAUSED}</td><td>{@link GL42#GL_TRANSFORM_FEEDBACK_ACTIVE TRANSFORM_FEEDBACK_ACTIVE}</td></tr></table>
	 * @param param the buffer in which to return the parameter value
	 */
	public static void glGetTransformFeedbackiv(int xfb, int pname, IntBuffer param) {
		if ( CHECKS )
			checkBuffer(param, 1);
		nglGetTransformFeedbackiv(xfb, pname, memAddress(param));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about a transform feedback object.
	 *
	 * @param xfb   zero or the name of an existing transform feedback object
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL42#GL_TRANSFORM_FEEDBACK_PAUSED TRANSFORM_FEEDBACK_PAUSED}</td><td>{@link GL42#GL_TRANSFORM_FEEDBACK_ACTIVE TRANSFORM_FEEDBACK_ACTIVE}</td></tr></table>
	 */
	public static int glGetTransformFeedbacki(int xfb, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer param = stack.callocInt(1);
			nglGetTransformFeedbackiv(xfb, pname, memAddress(param));
			return param.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTransformFeedbacki_v ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about a transform feedback object.
	 *
	 * @param xfb   zero or the name of an existing transform feedback object
	 * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_BINDING TRANSFORM_FEEDBACK_BUFFER_BINDING}</td></tr></table>
	 * @param index the transform feedback stream index
	 * @param param the buffer in which to return the parameter value
	 */
	public static void nglGetTransformFeedbacki_v(int xfb, int pname, int index, long param) {
		long __functionAddress = GL.getCapabilities().glGetTransformFeedbacki_v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, xfb, pname, index, param);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about a transform feedback object.
	 *
	 * @param xfb   zero or the name of an existing transform feedback object
	 * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_BINDING TRANSFORM_FEEDBACK_BUFFER_BINDING}</td></tr></table>
	 * @param index the transform feedback stream index
	 * @param param the buffer in which to return the parameter value
	 */
	public static void glGetTransformFeedbacki_v(int xfb, int pname, int index, IntBuffer param) {
		if ( CHECKS )
			checkBuffer(param, 1);
		nglGetTransformFeedbacki_v(xfb, pname, index, memAddress(param));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about a transform feedback object.
	 *
	 * @param xfb   zero or the name of an existing transform feedback object
	 * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_BINDING TRANSFORM_FEEDBACK_BUFFER_BINDING}</td></tr></table>
	 * @param index the transform feedback stream index
	 */
	public static int glGetTransformFeedbacki(int xfb, int pname, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer param = stack.callocInt(1);
			nglGetTransformFeedbacki_v(xfb, pname, index, memAddress(param));
			return param.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTransformFeedbacki64_v ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about a transform feedback object.
	 *
	 * @param xfb   zero or the name of an existing transform feedback object
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_START TRANSFORM_FEEDBACK_BUFFER_START}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_SIZE TRANSFORM_FEEDBACK_BUFFER_SIZE}</td></tr></table>
	 * @param index the transform feedback stream index
	 * @param param the buffer in which to return the parameter value
	 */
	public static void nglGetTransformFeedbacki64_v(int xfb, int pname, int index, long param) {
		long __functionAddress = GL.getCapabilities().glGetTransformFeedbacki64_v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, xfb, pname, index, param);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about a transform feedback object.
	 *
	 * @param xfb   zero or the name of an existing transform feedback object
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_START TRANSFORM_FEEDBACK_BUFFER_START}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_SIZE TRANSFORM_FEEDBACK_BUFFER_SIZE}</td></tr></table>
	 * @param index the transform feedback stream index
	 * @param param the buffer in which to return the parameter value
	 */
	public static void glGetTransformFeedbacki64_v(int xfb, int pname, int index, LongBuffer param) {
		if ( CHECKS )
			checkBuffer(param, 1);
		nglGetTransformFeedbacki64_v(xfb, pname, index, memAddress(param));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about a transform feedback object.
	 *
	 * @param xfb   zero or the name of an existing transform feedback object
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_START TRANSFORM_FEEDBACK_BUFFER_START}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_SIZE TRANSFORM_FEEDBACK_BUFFER_SIZE}</td></tr></table>
	 * @param index the transform feedback stream index
	 */
	public static long glGetTransformFeedbacki64(int xfb, int pname, int index) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer param = stack.callocLong(1);
			nglGetTransformFeedbacki64_v(xfb, pname, index, memAddress(param));
			return param.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glCreateBuffers ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
	 * unspecified target.
	 *
	 * @param n       the number of buffer names to create
	 * @param buffers the buffer in which to return the names
	 */
	public static void nglCreateBuffers(int n, long buffers) {
		long __functionAddress = GL.getCapabilities().glCreateBuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, buffers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
	 * unspecified target.
	 *
	 * @param buffers the buffer in which to return the names
	 */
	public static void glCreateBuffers(IntBuffer buffers) {
		nglCreateBuffers(buffers.remaining(), memAddress(buffers));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
	 * unspecified target.
	 */
	public static int glCreateBuffers() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer buffers = stack.callocInt(1);
			nglCreateBuffers(1, memAddress(buffers));
			return buffers.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glNamedBufferStorage ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL44#glBufferStorage BufferStorage}.
	 *
	 * @param buffer the buffer object name
	 * @param size   the size of the data store in basic machine units
	 * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
	 *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
	 * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
	 *               are as follows:
	 *               
	 *               <ul>
	 *               <li>{@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
	 *               {@link GL15#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
	 *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
	 *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31#glCopyBufferSubData CopyBufferSubData} and
	 *               {@link GL43#glClearBufferSubData ClearBufferSubData}.</li>
	 *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
	 *               obtained that may be read from.</li>
	 *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
	 *               space obtained that may be written to.</li>
	 *               <li>{@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
	 *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
	 *               <li>{@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
	 *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
	 *               immediately visible to the other with no further action taken by the application. In particular:
	 *               
	 *               <ul>
	 *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42#glMemoryBarrier MemoryBarrier} command with
	 *               the {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
	 *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
	 *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42#glMemoryBarrier MemoryBarrier} with the
	 *               {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
	 *               {@link GL11#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
	 *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32#glFenceSync FenceSync} with
	 *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
	 *               </ul></li>
	 *               <li>{@link GL44#GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
	 *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
	 *               </ul>
	 *               
	 *               <p>If {@code flags} contains {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
	 *               
	 *               <p>It is an error to specify {@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
	 */
	public static void nglNamedBufferStorage(int buffer, long size, long data, int flags) {
		long __functionAddress = GL.getCapabilities().glNamedBufferStorage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, size, data, flags);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL44#glBufferStorage BufferStorage}.
	 *
	 * @param buffer the buffer object name
	 * @param size   the size of the data store in basic machine units
	 * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
	 *               are as follows:
	 *               
	 *               <ul>
	 *               <li>{@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
	 *               {@link GL15#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
	 *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link GL44#GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
	 *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31#glCopyBufferSubData CopyBufferSubData} and
	 *               {@link GL43#glClearBufferSubData ClearBufferSubData}.</li>
	 *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
	 *               obtained that may be read from.</li>
	 *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
	 *               space obtained that may be written to.</li>
	 *               <li>{@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
	 *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
	 *               <li>{@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
	 *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
	 *               immediately visible to the other with no further action taken by the application. In particular:
	 *               
	 *               <ul>
	 *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42#glMemoryBarrier MemoryBarrier} command with
	 *               the {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
	 *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
	 *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42#glMemoryBarrier MemoryBarrier} with the
	 *               {@link GL44#GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
	 *               {@link GL11#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
	 *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32#glFenceSync FenceSync} with
	 *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
	 *               </ul></li>
	 *               <li>{@link GL44#GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
	 *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
	 *               </ul>
	 *               
	 *               <p>If {@code flags} contains {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.</p>
	 *               
	 *               <p>It is an error to specify {@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
	 */
	public static void glNamedBufferStorage(int buffer, long size, int flags) {
		nglNamedBufferStorage(buffer, size, NULL, flags);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ByteBuffer version of: {@link #glNamedBufferStorage NamedBufferStorage}
	 */
	public static void glNamedBufferStorage(int buffer, ByteBuffer data, int flags) {
		nglNamedBufferStorage(buffer, (long)data.remaining(), memAddress(data), flags);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glNamedBufferStorage NamedBufferStorage}
	 */
	public static void glNamedBufferStorage(int buffer, ShortBuffer data, int flags) {
		nglNamedBufferStorage(buffer, data.remaining() << 1, memAddress(data), flags);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glNamedBufferStorage NamedBufferStorage}
	 */
	public static void glNamedBufferStorage(int buffer, IntBuffer data, int flags) {
		nglNamedBufferStorage(buffer, data.remaining() << 2, memAddress(data), flags);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glNamedBufferStorage NamedBufferStorage}
	 */
	public static void glNamedBufferStorage(int buffer, FloatBuffer data, int flags) {
		nglNamedBufferStorage(buffer, data.remaining() << 2, memAddress(data), flags);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DoubleBuffer version of: {@link #glNamedBufferStorage NamedBufferStorage}
	 */
	public static void glNamedBufferStorage(int buffer, DoubleBuffer data, int flags) {
		nglNamedBufferStorage(buffer, data.remaining() << 3, memAddress(data), flags);
	}

	// --- [ glNamedBufferData ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glBufferData BufferData}.
	 *
	 * @param buffer 
	 * @param size   the size in bytes of the buffer object's new data store
	 * @param data   a pointer to data that will be copied into the data store for initialization, or {@code NULL} if no data is to be copied
	 * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
	 */
	public static void nglNamedBufferData(int buffer, long size, long data, int usage) {
		long __functionAddress = GL.getCapabilities().glNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, size, data, usage);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glBufferData BufferData}.
	 *
	 * @param buffer 
	 * @param size   the size in bytes of the buffer object's new data store
	 * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
	 */
	public static void glNamedBufferData(int buffer, long size, int usage) {
		nglNamedBufferData(buffer, size, NULL, usage);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ByteBuffer version of: {@link #glNamedBufferData NamedBufferData}
	 */
	public static void glNamedBufferData(int buffer, ByteBuffer data, int usage) {
		nglNamedBufferData(buffer, (long)data.remaining(), memAddress(data), usage);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glNamedBufferData NamedBufferData}
	 */
	public static void glNamedBufferData(int buffer, ShortBuffer data, int usage) {
		nglNamedBufferData(buffer, data.remaining() << 1, memAddress(data), usage);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glNamedBufferData NamedBufferData}
	 */
	public static void glNamedBufferData(int buffer, IntBuffer data, int usage) {
		nglNamedBufferData(buffer, data.remaining() << 2, memAddress(data), usage);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glNamedBufferData NamedBufferData}
	 */
	public static void glNamedBufferData(int buffer, FloatBuffer data, int usage) {
		nglNamedBufferData(buffer, data.remaining() << 2, memAddress(data), usage);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DoubleBuffer version of: {@link #glNamedBufferData NamedBufferData}
	 */
	public static void glNamedBufferData(int buffer, DoubleBuffer data, int usage) {
		nglNamedBufferData(buffer, data.remaining() << 3, memAddress(data), usage);
	}

	// --- [ glNamedBufferSubData ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glBufferSubData BufferSubData}.
	 *
	 * @param buffer 
	 * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
	 * @param size   the size in bytes of the data store region being replaced
	 * @param data   a pointer to the new data that will be copied into the data store
	 */
	public static void nglNamedBufferSubData(int buffer, long offset, long size, long data) {
		long __functionAddress = GL.getCapabilities().glNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, size, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glBufferSubData BufferSubData}.
	 *
	 * @param buffer 
	 * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
	 * @param data   a pointer to the new data that will be copied into the data store
	 */
	public static void glNamedBufferSubData(int buffer, long offset, ByteBuffer data) {
		nglNamedBufferSubData(buffer, offset, (long)data.remaining(), memAddress(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glNamedBufferSubData NamedBufferSubData}
	 */
	public static void glNamedBufferSubData(int buffer, long offset, ShortBuffer data) {
		nglNamedBufferSubData(buffer, offset, data.remaining() << 1, memAddress(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glNamedBufferSubData NamedBufferSubData}
	 */
	public static void glNamedBufferSubData(int buffer, long offset, IntBuffer data) {
		nglNamedBufferSubData(buffer, offset, data.remaining() << 2, memAddress(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glNamedBufferSubData NamedBufferSubData}
	 */
	public static void glNamedBufferSubData(int buffer, long offset, FloatBuffer data) {
		nglNamedBufferSubData(buffer, offset, data.remaining() << 2, memAddress(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DoubleBuffer version of: {@link #glNamedBufferSubData NamedBufferSubData}
	 */
	public static void glNamedBufferSubData(int buffer, long offset, DoubleBuffer data) {
		nglNamedBufferSubData(buffer, offset, data.remaining() << 3, memAddress(data));
	}

	// --- [ glCopyNamedBufferSubData ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCopyNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL31#glCopyBufferSubData CopyBufferSubData}.
	 *
	 * @param readBuffer  the source buffer object name
	 * @param writeBuffer the destination buffer object name
	 * @param readOffset  the source buffer object offset, in bytes
	 * @param writeOffset the destination buffer object offset, in bytes
	 * @param size        the number of bytes to copy
	 */
	public static void glCopyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
		long __functionAddress = GL.getCapabilities().glCopyNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, readBuffer, writeBuffer, readOffset, writeOffset, size);
	}

	// --- [ glClearNamedBufferData ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glClearBufferData ClearBufferData}.
	 *
	 * @param buffer         the buffer object name
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
	 *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
	 *                       sub-range of the buffer is filled with zeros.
	 */
	public static void nglClearNamedBufferData(int buffer, int internalformat, int format, int type, long data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, internalformat, format, type, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glClearBufferData ClearBufferData}.
	 *
	 * @param buffer         the buffer object name
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
	 *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
	 *                       sub-range of the buffer is filled with zeros.
	 */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, ByteBuffer data) {
		nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glClearNamedBufferData ClearNamedBufferData}
	 */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, ShortBuffer data) {
		nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glClearNamedBufferData ClearNamedBufferData}
	 */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, IntBuffer data) {
		nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glClearNamedBufferData ClearNamedBufferData}
	 */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, FloatBuffer data) {
		nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
	}

	// --- [ glClearNamedBufferSubData ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glClearBufferSubData ClearBufferSubData}.
	 *
	 * @param buffer         the buffer object name
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param offset         the offset, in basic machine units into the buffer object's data store at which to start filling
	 * @param size           the size, in basic machine units of the range of the data store to fill
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
	 *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
	 *                       sub-range of the buffer is filled with zeros.
	 */
	public static void nglClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, long data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, internalformat, offset, size, format, type, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glClearBufferSubData ClearBufferSubData}.
	 *
	 * @param buffer         the buffer object name
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param offset         the offset, in basic machine units into the buffer object's data store at which to start filling
	 * @param size           the size, in basic machine units of the range of the data store to fill
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param data           the buffer containing the data to be used as the source of the constant fill value. The elements of data are converted by the GL into the format
	 *                       specified by internalformat, and then used to fill the specified range of the destination buffer. If data is {@code NULL}, then it is ignored and the
	 *                       sub-range of the buffer is filled with zeros.
	 */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, ByteBuffer data) {
		nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData}
	 */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, ShortBuffer data) {
		nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData}
	 */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, IntBuffer data) {
		nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData}
	 */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, FloatBuffer data) {
		nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	// --- [ glMapNamedBuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMapNamedBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glMapBuffer MapBuffer}.
	 *
	 * @param buffer the buffer object name
	 * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
	 */
	public static long nglMapNamedBuffer(int buffer, int access) {
		long __functionAddress = GL.getCapabilities().glMapNamedBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress, buffer, access);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMapNamedBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glMapBuffer MapBuffer}.
	 *
	 * @param buffer the buffer object name
	 * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
	 */
	public static ByteBuffer glMapNamedBuffer(int buffer, int access) {
		long __result = nglMapNamedBuffer(buffer, access);
		return memByteBuffer(__result, glGetNamedBufferParameteri(buffer, GL15.GL_BUFFER_SIZE));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMapNamedBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glMapBuffer MapBuffer}.
	 *
	 * @param buffer the buffer object name
	 * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
	 */
	public static ByteBuffer glMapNamedBuffer(int buffer, int access, ByteBuffer old_buffer) {
		long __result = nglMapNamedBuffer(buffer, access);
		int length = glGetNamedBufferParameteri(buffer, GL15.GL_BUFFER_SIZE);
		return old_buffer == null ? memByteBuffer(__result, length) : memSetupBuffer(old_buffer, __result, length);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMapNamedBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glMapBuffer MapBuffer}.
	 *
	 * @param buffer the buffer object name
	 * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
	 */
	public static ByteBuffer glMapNamedBuffer(int buffer, int access, long length, ByteBuffer old_buffer) {
		long __result = nglMapNamedBuffer(buffer, access);
		return old_buffer == null ? memByteBuffer(__result, (int)length) : memSetupBuffer(old_buffer, __result, (int)length);
	}

	// --- [ glMapNamedBufferRange ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMapNamedBufferRange.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glMapBufferRange MapBufferRange}.
	 *
	 * @param buffer the buffer object name
	 * @param offset the starting offset within the buffer of the range to be mapped
	 * @param length the length of the range to be mapped
	 * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
	 */
	public static long nglMapNamedBufferRange(int buffer, long offset, long length, int access) {
		long __functionAddress = GL.getCapabilities().glMapNamedBufferRange;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPP(__functionAddress, buffer, offset, length, access);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMapNamedBufferRange.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glMapBufferRange MapBufferRange}.
	 *
	 * @param buffer the buffer object name
	 * @param offset the starting offset within the buffer of the range to be mapped
	 * @param length the length of the range to be mapped
	 * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
	 */
	public static ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access) {
		long __result = nglMapNamedBufferRange(buffer, offset, length, access);
		return memByteBuffer(__result, (int)length);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMapNamedBufferRange.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glMapBufferRange MapBufferRange}.
	 *
	 * @param buffer the buffer object name
	 * @param offset the starting offset within the buffer of the range to be mapped
	 * @param length the length of the range to be mapped
	 * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
	 */
	public static ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access, ByteBuffer old_buffer) {
		long __result = nglMapNamedBufferRange(buffer, offset, length, access);
		return old_buffer == null ? memByteBuffer(__result, (int)length) : memSetupBuffer(old_buffer, __result, (int)length);
	}

	// --- [ glUnmapNamedBuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUnmapNamedBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glUnmapBuffer UnmapBuffer}.
	 *
	 * @param buffer the buffer object name
	 */
	public static boolean glUnmapNamedBuffer(int buffer) {
		long __functionAddress = GL.getCapabilities().glUnmapNamedBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, buffer);
	}

	// --- [ glFlushMappedNamedBufferRange ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glFlushMappedNamedBufferRange.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glFlushMappedBufferRange FlushMappedBufferRange}.
	 *
	 * @param buffer the buffer object name
	 * @param offset the start of the buffer subrange, in basic machine units
	 * @param length the length of the buffer subrange, in basic machine units
	 */
	public static void glFlushMappedNamedBufferRange(int buffer, long offset, long length) {
		long __functionAddress = GL.getCapabilities().glFlushMappedNamedBufferRange;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, offset, length);
	}

	// --- [ glGetNamedBufferParameteriv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glGetBufferParameteriv GetBufferParameteriv}.
	 *
	 * @param buffer the buffer object name
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td></tr><tr><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
	 * @param params the requested parameter
	 */
	public static void nglGetNamedBufferParameteriv(int buffer, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glGetBufferParameteriv GetBufferParameteriv}.
	 *
	 * @param buffer the buffer object name
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td></tr><tr><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
	 * @param params the requested parameter
	 */
	public static void glGetNamedBufferParameteriv(int buffer, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetNamedBufferParameteriv(buffer, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glGetBufferParameteriv GetBufferParameteriv}.
	 *
	 * @param buffer the buffer object name
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td></tr><tr><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
	 */
	public static int glGetNamedBufferParameteri(int buffer, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetNamedBufferParameteriv(buffer, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetNamedBufferParameteri64v ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL32#glGetBufferParameteri64v GetBufferParameteri64v}.
	 *
	 * @param buffer the buffer object name
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td></tr><tr><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
	 * @param params the requested parameter
	 */
	public static void nglGetNamedBufferParameteri64v(int buffer, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferParameteri64v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL32#glGetBufferParameteri64v GetBufferParameteri64v}.
	 *
	 * @param buffer the buffer object name
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td></tr><tr><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
	 * @param params the requested parameter
	 */
	public static void glGetNamedBufferParameteri64v(int buffer, int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetNamedBufferParameteri64v(buffer, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL32#glGetBufferParameteri64v GetBufferParameteri64v}.
	 *
	 * @param buffer the buffer object name
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br><table><tr><td>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}</td><td>{@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}</td><td>{@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}</td><td>{@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}</td><td>{@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}</td></tr><tr><td>{@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}</td><td>{@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}</td><td>{@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}</td><td>{@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}</td></tr></table>
	 */
	public static long glGetNamedBufferParameteri64(int buffer, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetNamedBufferParameteri64v(buffer, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetNamedBufferPointerv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferPointer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glGetBufferPointerv GetBufferPointerv}.
	 *
	 * @param buffer the buffer object name
	 * @param pname  the pointer to be returned. Must be:<br><table><tr><td>{@link GL15#GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}</td></tr></table>
	 * @param params the pointer value specified by {@code pname}
	 */
	public static void nglGetNamedBufferPointerv(int buffer, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferPointerv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferPointer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glGetBufferPointerv GetBufferPointerv}.
	 *
	 * @param buffer the buffer object name
	 * @param pname  the pointer to be returned. Must be:<br><table><tr><td>{@link GL15#GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}</td></tr></table>
	 * @param params the pointer value specified by {@code pname}
	 */
	public static void glGetNamedBufferPointerv(int buffer, int pname, PointerBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetNamedBufferPointerv(buffer, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferPointer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glGetBufferPointerv GetBufferPointerv}.
	 *
	 * @param buffer the buffer object name
	 * @param pname  the pointer to be returned. Must be:<br><table><tr><td>{@link GL15#GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}</td></tr></table>
	 */
	public static long glGetNamedBufferPointer(int buffer, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			PointerBuffer params = stack.callocPointer(1);
			nglGetNamedBufferPointerv(buffer, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetNamedBufferSubData ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glGetBufferSubData GetBufferSubData}.
	 *
	 * @param buffer the buffer object name
	 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
	 * @param size   the size in bytes of the data store region being returned
	 * @param data   a pointer to the location where buffer object data is returned
	 */
	public static void nglGetNamedBufferSubData(int buffer, long offset, long size, long data) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, size, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glGetBufferSubData GetBufferSubData}.
	 *
	 * @param buffer the buffer object name
	 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
	 * @param data   a pointer to the location where buffer object data is returned
	 */
	public static void glGetNamedBufferSubData(int buffer, long offset, ByteBuffer data) {
		nglGetNamedBufferSubData(buffer, offset, (long)data.remaining(), memAddress(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
	 */
	public static void glGetNamedBufferSubData(int buffer, long offset, ShortBuffer data) {
		nglGetNamedBufferSubData(buffer, offset, data.remaining() << 1, memAddress(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
	 */
	public static void glGetNamedBufferSubData(int buffer, long offset, IntBuffer data) {
		nglGetNamedBufferSubData(buffer, offset, data.remaining() << 2, memAddress(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
	 */
	public static void glGetNamedBufferSubData(int buffer, long offset, FloatBuffer data) {
		nglGetNamedBufferSubData(buffer, offset, data.remaining() << 2, memAddress(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DoubleBuffer version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
	 */
	public static void glGetNamedBufferSubData(int buffer, long offset, DoubleBuffer data) {
		nglGetNamedBufferSubData(buffer, offset, data.remaining() << 3, memAddress(data));
	}

	// --- [ glCreateFramebuffers ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateFramebuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object.
	 *
	 * @param n            the number of framebuffer names to create
	 * @param framebuffers the buffer in which to store the framebuffer names
	 */
	public static void nglCreateFramebuffers(int n, long framebuffers) {
		long __functionAddress = GL.getCapabilities().glCreateFramebuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, framebuffers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateFramebuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object.
	 *
	 * @param framebuffers the buffer in which to store the framebuffer names
	 */
	public static void glCreateFramebuffers(IntBuffer framebuffers) {
		nglCreateFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateFramebuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object.
	 */
	public static int glCreateFramebuffers() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer framebuffers = stack.callocInt(1);
			nglCreateFramebuffers(1, memAddress(framebuffers));
			return framebuffers.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glNamedFramebufferRenderbuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferRenderbuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glFramebufferRenderbuffer FramebufferRenderbuffer}.
	 *
	 * @param framebuffer        the framebuffer name
	 * @param attachment         the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
	 * @param renderbuffertarget the renderbuffer target. Must be:<br><table><tr><td>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}</td></tr></table>
	 * @param renderbuffer       the name of an existing renderbuffer object of type {@code renderbuffertarget} to attach
	 */
	public static void glNamedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
		long __functionAddress = GL.getCapabilities().glNamedFramebufferRenderbuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, framebuffer, attachment, renderbuffertarget, renderbuffer);
	}

	// --- [ glNamedFramebufferParameteri ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferParameteri.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glFramebufferParameteri FramebufferParameteri}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param pname       a token indicating the parameter to be modified. One of:<br><table><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
	 * @param param       the new value for the parameter named {@code pname}
	 */
	public static void glNamedFramebufferParameteri(int framebuffer, int pname, int param) {
		long __functionAddress = GL.getCapabilities().glNamedFramebufferParameteri;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, framebuffer, pname, param);
	}

	// --- [ glNamedFramebufferTexture ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferTexture.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL32#glFramebufferTexture FramebufferTexture}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param attachment  the attachment point of the framebuffer
	 * @param texture     the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level       the mipmap level of {@code texture} to attach
	 */
	public static void glNamedFramebufferTexture(int framebuffer, int attachment, int texture, int level) {
		long __functionAddress = GL.getCapabilities().glNamedFramebufferTexture;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, framebuffer, attachment, texture, level);
	}

	// --- [ glNamedFramebufferTextureLayer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferTextureLayer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glFramebufferTextureLayer FramebufferTextureLayer}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param attachment  the attachment point of the framebuffer. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
	 * @param texture     the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level       the mipmap level of {@code texture} to attach
	 * @param layer       the layer of {@code texture} to attach.
	 */
	public static void glNamedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) {
		long __functionAddress = GL.getCapabilities().glNamedFramebufferTextureLayer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, framebuffer, attachment, texture, level, layer);
	}

	// --- [ glNamedFramebufferDrawBuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferDrawBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glDrawBuffer DrawBuffer}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buf         the color buffer to draw to. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11#GL_FRONT FRONT}</td><td>{@link GL11#GL_BACK BACK}</td><td>{@link GL11#GL_LEFT LEFT}</td></tr><tr><td>{@link GL11#GL_RIGHT RIGHT}</td><td>{@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}</td><td>{@link GL11#GL_AUX0 AUX0}</td><td>{@link GL11#GL_AUX1 AUX1}</td><td>{@link GL11#GL_AUX2 AUX2}</td><td>{@link GL11#GL_AUX3 AUX3}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
	 */
	public static void glNamedFramebufferDrawBuffer(int framebuffer, int buf) {
		long __functionAddress = GL.getCapabilities().glNamedFramebufferDrawBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, framebuffer, buf);
	}

	// --- [ glNamedFramebufferDrawBuffers ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferDrawBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL20#glDrawBuffers DrawBuffers}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param n           the number of buffers in {@code bufs}
	 * @param bufs        an array of symbolic constants specifying the buffers into which fragment colors or data values will be written. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11#GL_AUX0 AUX0}</td><td>{@link GL11#GL_AUX1 AUX1}</td><td>{@link GL11#GL_AUX2 AUX2}</td></tr><tr><td>{@link GL11#GL_AUX3 AUX3}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
	 */
	public static void nglNamedFramebufferDrawBuffers(int framebuffer, int n, long bufs) {
		long __functionAddress = GL.getCapabilities().glNamedFramebufferDrawBuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, n, bufs);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferDrawBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL20#glDrawBuffers DrawBuffers}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param bufs        an array of symbolic constants specifying the buffers into which fragment colors or data values will be written. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11#GL_AUX0 AUX0}</td><td>{@link GL11#GL_AUX1 AUX1}</td><td>{@link GL11#GL_AUX2 AUX2}</td></tr><tr><td>{@link GL11#GL_AUX3 AUX3}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
	 */
	public static void glNamedFramebufferDrawBuffers(int framebuffer, IntBuffer bufs) {
		nglNamedFramebufferDrawBuffers(framebuffer, bufs.remaining(), memAddress(bufs));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferDrawBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL20#glDrawBuffers DrawBuffers}.
	 *
	 * @param framebuffer the framebuffer name
	 */
	public static void glNamedFramebufferDrawBuffers(int framebuffer, int buf) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer bufs = stack.ints(buf);
			nglNamedFramebufferDrawBuffers(framebuffer, 1, memAddress(bufs));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glNamedFramebufferReadBuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferReadBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glReadBuffer ReadBuffer}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param src         the color buffer to read from. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11#GL_FRONT FRONT}</td><td>{@link GL11#GL_BACK BACK}</td><td>{@link GL11#GL_LEFT LEFT}</td></tr><tr><td>{@link GL11#GL_RIGHT RIGHT}</td><td>{@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}</td><td>{@link GL11#GL_AUX0 AUX0}</td><td>{@link GL11#GL_AUX1 AUX1}</td><td>{@link GL11#GL_AUX2 AUX2}</td><td>{@link GL11#GL_AUX3 AUX3}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
	 */
	public static void glNamedFramebufferReadBuffer(int framebuffer, int src) {
		long __functionAddress = GL.getCapabilities().glNamedFramebufferReadBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, framebuffer, src);
	}

	// --- [ glInvalidateNamedFramebufferData ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateNamedFramebufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glInvalidateFramebuffer InvalidateFramebuffer}.
	 *
	 * @param framebuffer    the framebuffer name
	 * @param numAttachments the number of entries in the {@code attachments} array
	 * @param attachments    the address of an array identifying the attachments to be invalidated
	 */
	public static void nglInvalidateNamedFramebufferData(int framebuffer, int numAttachments, long attachments) {
		long __functionAddress = GL.getCapabilities().glInvalidateNamedFramebufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, numAttachments, attachments);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateNamedFramebufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glInvalidateFramebuffer InvalidateFramebuffer}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param attachments the address of an array identifying the attachments to be invalidated
	 */
	public static void glInvalidateNamedFramebufferData(int framebuffer, IntBuffer attachments) {
		nglInvalidateNamedFramebufferData(framebuffer, attachments.remaining(), memAddress(attachments));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateNamedFramebufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glInvalidateFramebuffer InvalidateFramebuffer}.
	 *
	 * @param framebuffer the framebuffer name
	 */
	public static void glInvalidateNamedFramebufferData(int framebuffer, int attachment) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer attachments = stack.ints(attachment);
			nglInvalidateNamedFramebufferData(framebuffer, 1, memAddress(attachments));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glInvalidateNamedFramebufferSubData ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateNamedFramebufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glInvalidateSubFramebuffer InvalidateSubFramebuffer}.
	 *
	 * @param framebuffer    the framebuffer name
	 * @param numAttachments the number of entries in the {@code attachments} array
	 * @param attachments    an array identifying the attachments to be invalidated
	 * @param x              the X offset of the region to be invalidated
	 * @param y              the Y offset of the region to be invalidated
	 * @param width          the width of the region to be invalidated
	 * @param height         the height of the region to be invalidated
	 */
	public static void nglInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, long attachments, int x, int y, int width, int height) {
		long __functionAddress = GL.getCapabilities().glInvalidateNamedFramebufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, numAttachments, attachments, x, y, width, height);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateNamedFramebufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glInvalidateSubFramebuffer InvalidateSubFramebuffer}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param attachments an array identifying the attachments to be invalidated
	 * @param x           the X offset of the region to be invalidated
	 * @param y           the Y offset of the region to be invalidated
	 * @param width       the width of the region to be invalidated
	 * @param height      the height of the region to be invalidated
	 */
	public static void glInvalidateNamedFramebufferSubData(int framebuffer, IntBuffer attachments, int x, int y, int width, int height) {
		nglInvalidateNamedFramebufferSubData(framebuffer, attachments.remaining(), memAddress(attachments), x, y, width, height);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateNamedFramebufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glInvalidateSubFramebuffer InvalidateSubFramebuffer}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param x           the X offset of the region to be invalidated
	 * @param y           the Y offset of the region to be invalidated
	 * @param width       the width of the region to be invalidated
	 * @param height      the height of the region to be invalidated
	 */
	public static void glInvalidateNamedFramebufferSubData(int framebuffer, int attachment, int x, int y, int width, int height) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer attachments = stack.ints(attachment);
			nglInvalidateNamedFramebufferSubData(framebuffer, 1, memAddress(attachments), x, y, width, height);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glClearNamedFramebufferiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glClearBufferiv ClearBufferiv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buffer      the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_STENCIL STENCIL}</td></tr></table>
	 * @param drawbuffer  the draw buffer to clear
	 * @param value       for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For stencil buffers, a pointer to a
	 *                    single stencil value to clear the buffer to.
	 */
	public static void nglClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, long value) {
		long __functionAddress = GL.getCapabilities().glClearNamedFramebufferiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, buffer, drawbuffer, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glClearBufferiv ClearBufferiv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buffer      the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_STENCIL STENCIL}</td></tr></table>
	 * @param drawbuffer  the draw buffer to clear
	 * @param value       for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For stencil buffers, a pointer to a
	 *                    single stencil value to clear the buffer to.
	 */
	public static void glClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearNamedFramebufferuiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glClearBufferuiv ClearBufferuiv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buffer      the buffer to clear. Must be:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td></tr></table>
	 * @param drawbuffer  the draw buffer to clear
	 * @param value       a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to
	 */
	public static void nglClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, long value) {
		long __functionAddress = GL.getCapabilities().glClearNamedFramebufferuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, buffer, drawbuffer, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glClearBufferuiv ClearBufferuiv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buffer      the buffer to clear. Must be:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td></tr></table>
	 * @param drawbuffer  the draw buffer to clear
	 * @param value       a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to
	 */
	public static void glClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 4);
		nglClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearNamedFramebufferfv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glClearBufferfv ClearBufferfv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buffer      the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_DEPTH DEPTH}</td></tr></table>
	 * @param drawbuffer  the draw buffer to clear
	 * @param value       for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For depth buffers, a pointer to a
	 *                    single depth value to clear the buffer to.
	 */
	public static void nglClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, long value) {
		long __functionAddress = GL.getCapabilities().glClearNamedFramebufferfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, buffer, drawbuffer, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glClearBufferfv ClearBufferfv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buffer      the buffer to clear. One of:<br><table><tr><td>{@link GL11#GL_COLOR COLOR}</td><td>{@link GL11#GL_DEPTH DEPTH}</td></tr></table>
	 * @param drawbuffer  the draw buffer to clear
	 * @param value       for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For depth buffers, a pointer to a
	 *                    single depth value to clear the buffer to.
	 */
	public static void glClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, FloatBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearNamedFramebufferfi ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebufferfi.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glClearBufferfi ClearBufferfi}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buffer      the buffer to clear. Must be:<br><table><tr><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td></tr></table>
	 * @param drawbuffer  the draw buffer to clear
	 * @param depth       the depth value to clear the buffer to
	 * @param stencil     the stencil value to clear the buffer to
	 */
	public static void glClearNamedFramebufferfi(int framebuffer, int buffer, int drawbuffer, float depth, int stencil) {
		long __functionAddress = GL.getCapabilities().glClearNamedFramebufferfi;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, framebuffer, buffer, drawbuffer, depth, stencil);
	}

	// --- [ glBlitNamedFramebuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBlitNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glBlitFramebuffer BlitFramebuffer}.
	 *
	 * @param readFramebuffer the source framebuffer name
	 * @param drawFramebuffer the destination framebuffer name
	 * @param srcX0           the lower-left coordinate of the source rectangle within the read buffer
	 * @param srcY0           the upper-left coordinate of the source rectangle within the read buffer
	 * @param srcX1           the lower-right coordinate of the source rectangle within the read buffer
	 * @param srcY1           the upper-right coordinate of the source rectangle within the read buffer
	 * @param dstX0           the lower-left coordinate of the destination rectangle within the write buffer
	 * @param dstY0           the upper-left coordinate of the destination rectangle within the write buffer
	 * @param dstX1           the lower-right coordinate of the destination rectangle within the write buffer
	 * @param dstY1           the upper-right coordinate of the destination rectangle within the write buffer
	 * @param mask            the bitwise OR of the flags indicating which buffers are to be copied. One of:<br><table><tr><td>{@link GL11#GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link GL11#GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link GL11#GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr></table>
	 * @param filter          the interpolation to be applied if the image is stretched. One of:<br><table><tr><td>{@link GL11#GL_NEAREST NEAREST}</td><td>{@link GL11#GL_LINEAR LINEAR}</td></tr></table>
	 */
	public static void glBlitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = GL.getCapabilities().glBlitNamedFramebuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
	}

	// --- [ glCheckNamedFramebufferStatus ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCheckNamedFramebufferStatus.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glCheckFramebufferStatus CheckFramebufferStatus}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param target      the target of the framebuffer completeness check. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}</td><td>{@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}</td><td>{@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}</td></tr></table>
	 */
	public static int glCheckNamedFramebufferStatus(int framebuffer, int target) {
		long __functionAddress = GL.getCapabilities().glCheckNamedFramebufferStatus;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callI(__functionAddress, framebuffer, target);
	}

	// --- [ glGetNamedFramebufferParameteriv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedFramebufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glGetFramebufferParameteriv GetFramebufferParameteriv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param pname       a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
	 * @param params      a variable to receive the value of the parameter named {@code pname}
	 */
	public static void nglGetNamedFramebufferParameteriv(int framebuffer, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetNamedFramebufferParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedFramebufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glGetFramebufferParameteriv GetFramebufferParameteriv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param pname       a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
	 * @param params      a variable to receive the value of the parameter named {@code pname}
	 */
	public static void glGetNamedFramebufferParameteriv(int framebuffer, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetNamedFramebufferParameteriv(framebuffer, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedFramebufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glGetFramebufferParameteriv GetFramebufferParameteriv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param pname       a token indicating the parameter to be retrieved. One of:<br><table><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}</td><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}</td></tr><tr><td>{@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}</td></tr></table>
	 */
	public static int glGetNamedFramebufferParameteri(int framebuffer, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetNamedFramebufferParameteriv(framebuffer, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetNamedFramebufferAttachmentParameteriv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedFramebufferAttachmentParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param attachment  the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
	 * @param pname       the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
	 * @param params      an array to receive the value of the queried parameter
	 */
	public static void nglGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetNamedFramebufferAttachmentParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, attachment, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedFramebufferAttachmentParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param attachment  the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
	 * @param pname       the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
	 * @param params      an array to receive the value of the queried parameter
	 */
	public static void glGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedFramebufferAttachmentParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param attachment  the attachment within {@code target}. One of:<br><table><tr><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>{@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}</td><td>{@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}</td><td>{@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}</td><td>{@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}</td><td>{@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}</td><td>{@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}</td><td>{@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}</td><td>{@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}</td><td>{@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}</td><td>{@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}</td><td>{@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}</td><td>{@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT16 COLOR_ATTACHMENT16}</td><td>{@link GL30#GL_COLOR_ATTACHMENT17 COLOR_ATTACHMENT17}</td><td>{@link GL30#GL_COLOR_ATTACHMENT18 COLOR_ATTACHMENT18}</td><td>{@link GL30#GL_COLOR_ATTACHMENT19 COLOR_ATTACHMENT19}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT20 COLOR_ATTACHMENT20}</td><td>{@link GL30#GL_COLOR_ATTACHMENT21 COLOR_ATTACHMENT21}</td><td>{@link GL30#GL_COLOR_ATTACHMENT22 COLOR_ATTACHMENT22}</td><td>{@link GL30#GL_COLOR_ATTACHMENT23 COLOR_ATTACHMENT23}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT24 COLOR_ATTACHMENT24}</td><td>{@link GL30#GL_COLOR_ATTACHMENT25 COLOR_ATTACHMENT25}</td><td>{@link GL30#GL_COLOR_ATTACHMENT26 COLOR_ATTACHMENT26}</td><td>{@link GL30#GL_COLOR_ATTACHMENT27 COLOR_ATTACHMENT27}</td></tr><tr><td>{@link GL30#GL_COLOR_ATTACHMENT28 COLOR_ATTACHMENT28}</td><td>{@link GL30#GL_COLOR_ATTACHMENT29 COLOR_ATTACHMENT29}</td><td>{@link GL30#GL_COLOR_ATTACHMENT30 COLOR_ATTACHMENT30}</td><td>{@link GL30#GL_COLOR_ATTACHMENT31 COLOR_ATTACHMENT31}</td></tr><tr><td>{@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}</td><td>{@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}</td><td>{@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}</td></tr></table>
	 * @param pname       the parameter of {@code attachment} to query. One of:<br><table><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}</td><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}</td></tr><tr><td>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}</td></tr></table>
	 */
	public static int glGetNamedFramebufferAttachmentParameteri(int framebuffer, int attachment, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glCreateRenderbuffers ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateRenderbuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object.
	 *
	 * @param n             the number of renderbuffer names to create
	 * @param renderbuffers the buffer in which to store the created renderbuffer names
	 */
	public static void nglCreateRenderbuffers(int n, long renderbuffers) {
		long __functionAddress = GL.getCapabilities().glCreateRenderbuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, renderbuffers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateRenderbuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object.
	 *
	 * @param renderbuffers the buffer in which to store the created renderbuffer names
	 */
	public static void glCreateRenderbuffers(IntBuffer renderbuffers) {
		nglCreateRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateRenderbuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object.
	 */
	public static int glCreateRenderbuffers() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer renderbuffers = stack.callocInt(1);
			nglCreateRenderbuffers(1, memAddress(renderbuffers));
			return renderbuffers.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glNamedRenderbufferStorage ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedRenderbufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glRenderbufferStorage RenderbufferStorage}.
	 *
	 * @param renderbuffer   
	 * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
	 * @param width          the width of the renderbuffer, in pixels
	 * @param height         the height of the renderbuffer, in pixels
	 */
	public static void glNamedRenderbufferStorage(int renderbuffer, int internalformat, int width, int height) {
		long __functionAddress = GL.getCapabilities().glNamedRenderbufferStorage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, renderbuffer, internalformat, width, height);
	}

	// --- [ glNamedRenderbufferStorageMultisample ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedRenderbufferStorageMultisample.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glRenderbufferStorageMultisample RenderbufferStorageMultisample}.
	 *
	 * @param renderbuffer   
	 * @param samples        the number of samples to be used for the renderbuffer object's storage
	 * @param internalformat the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format.
	 * @param width          the width of the renderbuffer, in pixels
	 * @param height         the height of the renderbuffer, in pixels
	 */
	public static void glNamedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalformat, int width, int height) {
		long __functionAddress = GL.getCapabilities().glNamedRenderbufferStorageMultisample;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, renderbuffer, samples, internalformat, width, height);
	}

	// --- [ glGetNamedRenderbufferParameteriv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedRenderbufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetRenderbufferParameteriv GetRenderbufferParameteriv}.
	 *
	 * @param renderbuffer 
	 * @param pname        the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
	 * @param params       an array to receive the value of the queried parameter
	 */
	public static void nglGetNamedRenderbufferParameteriv(int renderbuffer, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetNamedRenderbufferParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, renderbuffer, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedRenderbufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetRenderbufferParameteriv GetRenderbufferParameteriv}.
	 *
	 * @param renderbuffer 
	 * @param pname        the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
	 * @param params       an array to receive the value of the queried parameter
	 */
	public static void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetNamedRenderbufferParameteriv(renderbuffer, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedRenderbufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetRenderbufferParameteriv GetRenderbufferParameteriv}.
	 *
	 * @param renderbuffer 
	 * @param pname        the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br><table><tr><td>{@link GL30#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}</td><td>{@link GL30#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}</td><td>{@link GL30#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}</td><td>{@link GL30#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}</td></tr><tr><td>{@link GL30#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}</td></tr></table>
	 */
	public static int glGetNamedRenderbufferParameteri(int renderbuffer, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetNamedRenderbufferParameteriv(renderbuffer, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glCreateTextures ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateTextures.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused texture names in {@code textures}, each representing a new texture object.
	 *
	 * @param target   the texture target. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
	 * @param n        the number of texture names to create
	 * @param textures the buffer in which to store the created texture names
	 */
	public static void nglCreateTextures(int target, int n, long textures) {
		long __functionAddress = GL.getCapabilities().glCreateTextures;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, n, textures);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateTextures.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused texture names in {@code textures}, each representing a new texture object.
	 *
	 * @param target   the texture target. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
	 * @param textures the buffer in which to store the created texture names
	 */
	public static void glCreateTextures(int target, IntBuffer textures) {
		nglCreateTextures(target, textures.remaining(), memAddress(textures));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateTextures.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused texture names in {@code textures}, each representing a new texture object.
	 *
	 * @param target the texture target. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
	 */
	public static int glCreateTextures(int target) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer textures = stack.callocInt(1);
			nglCreateTextures(target, 1, memAddress(textures));
			return textures.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glTextureBuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL31#glTexBuffer TexBuffer}.
	 *
	 * @param texture        the texture name
	 * @param internalformat the sized internal format of the data in the store belonging to {@code buffer}
	 * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
	 */
	public static void glTextureBuffer(int texture, int internalformat, int buffer) {
		long __functionAddress = GL.getCapabilities().glTextureBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, internalformat, buffer);
	}

	// --- [ glTextureBufferRange ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureBufferRange.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glTexBufferRange TexBufferRange}.
	 *
	 * @param texture        the texture name
	 * @param internalformat the internal format of the data in the store belonging to {@code buffer}
	 * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
	 * @param offset         the offset of the start of the range of the buffer's data store to attach
	 * @param size           the size of the range of the buffer's data store to attach
	 */
	public static void glTextureBufferRange(int texture, int internalformat, int buffer, long offset, long size) {
		long __functionAddress = GL.getCapabilities().glTextureBufferRange;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, texture, internalformat, buffer, offset, size);
	}

	// --- [ glTextureStorage1D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureStorage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL42#glTexStorage1D TexStorage1D}.
	 *
	 * @param texture        the texture name
	 * @param levels         the number of texture levels
	 * @param internalformat the sized internal format to be used to store texture image data
	 * @param width          the width of the texture, in texels
	 */
	public static void glTextureStorage1D(int texture, int levels, int internalformat, int width) {
		long __functionAddress = GL.getCapabilities().glTextureStorage1D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, levels, internalformat, width);
	}

	// --- [ glTextureStorage2D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureStorage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL42#glTexStorage2D TexStorage2D}.
	 *
	 * @param texture        the texture name
	 * @param levels         the number of texture levels
	 * @param internalformat the sized internal format to be used to store texture image data
	 * @param width          the width of the texture, in texels
	 * @param height         the height of the texture, in texels
	 */
	public static void glTextureStorage2D(int texture, int levels, int internalformat, int width, int height) {
		long __functionAddress = GL.getCapabilities().glTextureStorage2D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, levels, internalformat, width, height);
	}

	// --- [ glTextureStorage3D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureStorage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL42#glTexStorage3D TexStorage3D}.
	 *
	 * @param texture        the texture name
	 * @param levels         the number of texture levels
	 * @param internalformat the sized internal format to be used to store texture image data
	 * @param width          the width of the texture, in texels
	 * @param height         the height of the texture, in texels
	 * @param depth          the depth of the texture, in texels
	 */
	public static void glTextureStorage3D(int texture, int levels, int internalformat, int width, int height, int depth) {
		long __functionAddress = GL.getCapabilities().glTextureStorage3D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, levels, internalformat, width, height, depth);
	}

	// --- [ glTextureStorage2DMultisample ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureStorage2DMultisample.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glTexStorage2DMultisample TexStorage2DMultisample}.
	 *
	 * @param texture              the texture name
	 * @param samples              the number of samples in the texture
	 * @param internalformat       the sized internal format to be used to store texture image data
	 * @param width                the width of the texture, in texels
	 * @param height               the height of the texture, in texels
	 * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
	 *                             depend on the internal format or size of the image
	 */
	public static void glTextureStorage2DMultisample(int texture, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
		long __functionAddress = GL.getCapabilities().glTextureStorage2DMultisample;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, samples, internalformat, width, height, fixedsamplelocations);
	}

	// --- [ glTextureStorage3DMultisample ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureStorage3DMultisample.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glTexStorage3DMultisample TexStorage3DMultisample}.
	 *
	 * @param texture              the texture name
	 * @param samples              the number of samples in the texture
	 * @param internalformat       the sized internal format to be used to store texture image data
	 * @param width                the width of the texture, in texels
	 * @param height               the height of the texture, in texels
	 * @param depth                the depth of the texture, in texels
	 * @param fixedsamplelocations whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not
	 *                             depend on the internal format or size of the image
	 */
	public static void glTextureStorage3DMultisample(int texture, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
		long __functionAddress = GL.getCapabilities().glTextureStorage3DMultisample;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, samples, internalformat, width, height, depth, fixedsamplelocations);
	}

	// --- [ glTextureSubImage1D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexSubImage1D TexSubImage1D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void nglTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage1D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, level, xoffset, width, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexSubImage1D TexSubImage1D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexSubImage1D TexSubImage1D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glTextureSubImage1D TextureSubImage1D}
	 */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glTextureSubImage1D TextureSubImage1D}
	 */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glTextureSubImage1D TextureSubImage1D}
	 */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DoubleBuffer version of: {@link #glTextureSubImage1D TextureSubImage1D}
	 */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	// --- [ glTextureSubImage2D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexSubImage2D TexSubImage2D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param yoffset the bottom coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void nglTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage2D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexSubImage2D TexSubImage2D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param yoffset the bottom coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexSubImage2D TexSubImage2D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail-number
	 * @param xoffset the left coordinate of the texel subregion
	 * @param yoffset the bottom coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glTextureSubImage2D TextureSubImage2D}
	 */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glTextureSubImage2D TextureSubImage2D}
	 */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glTextureSubImage2D TextureSubImage2D}
	 */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DoubleBuffer version of: {@link #glTextureSubImage2D TextureSubImage2D}
	 */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	// --- [ glTextureSubImage3D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL12#glTexSubImage3D TexSubImage3D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail-number
	 * @param xoffset the x coordinate of the texel subregion
	 * @param yoffset the y coordinate of the texel subregion
	 * @param zoffset the z coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void nglTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage3D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL12#glTexSubImage3D TexSubImage3D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail-number
	 * @param xoffset the x coordinate of the texel subregion
	 * @param yoffset the y coordinate of the texel subregion
	 * @param zoffset the z coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL12#glTexSubImage3D TexSubImage3D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail-number
	 * @param xoffset the x coordinate of the texel subregion
	 * @param yoffset the y coordinate of the texel subregion
	 * @param zoffset the z coordinate of the texel subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the pixel data
	 */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glTextureSubImage3D TextureSubImage3D}
	 */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glTextureSubImage3D TextureSubImage3D}
	 */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glTextureSubImage3D TextureSubImage3D}
	 */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DoubleBuffer version of: {@link #glTextureSubImage3D TextureSubImage3D}
	 */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	// --- [ glCompressedTextureSubImage1D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL13#glCompressedTexSubImage1D CompressedTexSubImage1D}.
	 *
	 * @param texture   the texture name
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void nglCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data) {
		long __functionAddress = GL.getCapabilities().glCompressedTextureSubImage1D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, level, xoffset, width, format, imageSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL13#glCompressedTexSubImage1D CompressedTexSubImage1D}.
	 *
	 * @param texture   the texture name
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL13#glCompressedTexSubImage1D CompressedTexSubImage1D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset a texel offset in the x direction within the texture array
	 * @param width   the width of the texture subimage
	 * @param format  the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param data    a pointer to the compressed image data
	 */
	public static void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, ByteBuffer data) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTextureSubImage2D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL13#glCompressedTexSubImage2D CompressedTexSubImage2D}.
	 *
	 * @param texture   the texture name
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param yoffset   a texel offset in the y direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param height    the height of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void nglCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
		long __functionAddress = GL.getCapabilities().glCompressedTextureSubImage2D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, level, xoffset, yoffset, width, height, format, imageSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL13#glCompressedTexSubImage2D CompressedTexSubImage2D}.
	 *
	 * @param texture   the texture name
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param yoffset   a texel offset in the y direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param height    the height of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL13#glCompressedTexSubImage2D CompressedTexSubImage2D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset a texel offset in the x direction within the texture array
	 * @param yoffset a texel offset in the y direction within the texture array
	 * @param width   the width of the texture subimage
	 * @param height  the height of the texture subimage
	 * @param format  the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param data    a pointer to the compressed image data
	 */
	public static void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTextureSubImage3D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL13#glCompressedTexSubImage3D CompressedTexSubImage3D}.
	 *
	 * @param texture   the texture name
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param yoffset   a texel offset in the y direction within the texture array
	 * @param zoffset   a texel offset in the z direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param height    the height of the texture subimage
	 * @param depth     the depth of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void nglCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		long __functionAddress = GL.getCapabilities().glCompressedTextureSubImage3D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL13#glCompressedTexSubImage3D CompressedTexSubImage3D}.
	 *
	 * @param texture   the texture name
	 * @param level     the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset   a texel offset in the x direction within the texture array
	 * @param yoffset   a texel offset in the y direction within the texture array
	 * @param zoffset   a texel offset in the z direction within the texture array
	 * @param width     the width of the texture subimage
	 * @param height    the height of the texture subimage
	 * @param depth     the depth of the texture subimage
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCompressedTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL13#glCompressedTexSubImage3D CompressedTexSubImage3D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param xoffset a texel offset in the x direction within the texture array
	 * @param yoffset a texel offset in the y direction within the texture array
	 * @param zoffset a texel offset in the z direction within the texture array
	 * @param width   the width of the texture subimage
	 * @param height  the height of the texture subimage
	 * @param depth   the depth of the texture subimage
	 * @param format  the format of the compressed image data stored at address {@code data}. One of:<br><table><tr><td>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}</td></tr><tr><td>{@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}</td><td>{@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}</td><td>{@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}</td></tr><tr><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}</td><td>{@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}</td><td>{@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}</td></tr><tr><td>{@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}</td><td>{@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}</td></tr><tr><td>see {@link EXTTextureCompressionS3TC}</td><td>see {@link EXTTextureCompressionLATC}</td></tr><tr><td>see {@link ATITextureCompression3DC}</td><td>see {@link KHRTextureCompressionASTCLDR}</td></tr></table>
	 * @param data    a pointer to the compressed image data
	 */
	public static void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
	}

	// --- [ glCopyTextureSubImage1D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCopyTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glCopyTexSubImage1D CopyTexSubImage1D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param xoffset the left texel coordinate of the texture subregion to update
	 * @param x       the left framebuffer pixel coordinate
	 * @param y       the lower framebuffer pixel coordinate
	 * @param width   the texture subregion width
	 */
	public static void glCopyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width) {
		long __functionAddress = GL.getCapabilities().glCopyTextureSubImage1D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, level, xoffset, x, y, width);
	}

	// --- [ glCopyTextureSubImage2D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCopyTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glCopyTexSubImage2D CopyTexSubImage2D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param xoffset the left texel coordinate of the texture subregion to update
	 * @param yoffset the lower texel coordinate of the texture subregion to update
	 * @param x       the left framebuffer pixel coordinate
	 * @param y       the lower framebuffer pixel coordinate
	 * @param width   the texture subregion width
	 * @param height  the texture subregion height
	 */
	public static void glCopyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
		long __functionAddress = GL.getCapabilities().glCopyTextureSubImage2D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, level, xoffset, yoffset, x, y, width, height);
	}

	// --- [ glCopyTextureSubImage3D ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCopyTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL12#glCopyTexSubImage3D CopyTexSubImage3D}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param xoffset the x coordinate of the texture subregion to update
	 * @param yoffset the y coordinate of the texture subregion to update
	 * @param zoffset the z coordinate of the texture subregion to update
	 * @param x       the left framebuffer pixel coordinate
	 * @param y       the lower framebuffer pixel coordinate
	 * @param width   the texture subregion width
	 * @param height  the texture subregion height
	 */
	public static void glCopyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
		long __functionAddress = GL.getCapabilities().glCopyTextureSubImage3D;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, level, xoffset, yoffset, zoffset, x, y, width, height);
	}

	// --- [ glTextureParameterf ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameterf.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexParameterf TexParameterf}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to set
	 * @param param   the parameter value
	 */
	public static void glTextureParameterf(int texture, int pname, float param) {
		long __functionAddress = GL.getCapabilities().glTextureParameterf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, pname, param);
	}

	// --- [ glTextureParameterfv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexParameterfv TexParameterfv}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to set
	 * @param params  the parameter value
	 */
	public static void nglTextureParameterfv(int texture, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glTextureParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexParameterfv TexParameterfv}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to set
	 * @param params  the parameter value
	 */
	public static void glTextureParameterfv(int texture, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglTextureParameterfv(texture, pname, memAddress(params));
	}

	// --- [ glTextureParameteri ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameteri.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexParameteri TexParameteri}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to set. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL11#GL_TEXTURE_PRIORITY TEXTURE_PRIORITY}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td></tr><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td></tr><tr><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td></tr></table>
	 * @param param   the parameter value
	 */
	public static void glTextureParameteri(int texture, int pname, int param) {
		long __functionAddress = GL.getCapabilities().glTextureParameteri;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, pname, param);
	}

	// --- [ glTextureParameterIiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glTexParameterIiv TexParameterIiv}.
	 *
	 * @param texture the texture name
	 * @param pname   the symbolic name of a single-valued texture parameter
	 * @param params  the value of {@code pname}
	 */
	public static void nglTextureParameterIiv(int texture, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glTextureParameterIiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glTexParameterIiv TexParameterIiv}.
	 *
	 * @param texture the texture name
	 * @param pname   the symbolic name of a single-valued texture parameter
	 * @param params  the value of {@code pname}
	 */
	public static void glTextureParameterIiv(int texture, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglTextureParameterIiv(texture, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glTexParameterIiv TexParameterIiv}.
	 *
	 * @param texture the texture name
	 * @param pname   the symbolic name of a single-valued texture parameter
	 */
	public static void glTextureParameterIi(int texture, int pname, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.ints(param);
			nglTextureParameterIiv(texture, pname, memAddress(params));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glTextureParameterIuiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glTexParameterIuiv TexParameterIuiv}.
	 *
	 * @param texture the texture name
	 * @param pname   the symbolic name of a single-valued texture parameter
	 * @param params  the value of {@code pname}
	 */
	public static void nglTextureParameterIuiv(int texture, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glTextureParameterIuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glTexParameterIuiv TexParameterIuiv}.
	 *
	 * @param texture the texture name
	 * @param pname   the symbolic name of a single-valued texture parameter
	 * @param params  the value of {@code pname}
	 */
	public static void glTextureParameterIuiv(int texture, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglTextureParameterIuiv(texture, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glTexParameterIuiv TexParameterIuiv}.
	 *
	 * @param texture the texture name
	 * @param pname   the symbolic name of a single-valued texture parameter
	 */
	public static void glTextureParameterIui(int texture, int pname, int param) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.ints(param);
			nglTextureParameterIuiv(texture, pname, memAddress(params));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glTextureParameteriv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexParameteriv TexParameteriv}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to set
	 * @param params  the parameter value
	 */
	public static void nglTextureParameteriv(int texture, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glTextureParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexParameteriv TexParameteriv}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to set
	 * @param params  the parameter value
	 */
	public static void glTextureParameteriv(int texture, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglTextureParameteriv(texture, pname, memAddress(params));
	}

	// --- [ glGenerateTextureMipmap ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenerateTextureMipmap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGenerateMipmap GenerateMipmap}.
	 *
	 * @param texture the texture name
	 */
	public static void glGenerateTextureMipmap(int texture) {
		long __functionAddress = GL.getCapabilities().glGenerateTextureMipmap;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture);
	}

	// --- [ glBindTextureUnit ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindTextureUnit.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds an existing texture object to the texture unit numbered {@code unit}.
	 * 
	 * <p>{@code texture} must be zero or the name of an existing texture object. When {@code texture} is the name of an existing texture object, that object is
	 * bound to the target, in the corresponding texture unit, that was specified when the object was created. When {@code texture} is zero, each of the targets
	 * enumerated at the beginning of this section is reset to its default texture for the corresponding texture image unit.</p>
	 *
	 * @param unit    the texture unit number
	 * @param texture the texture name
	 */
	public static void glBindTextureUnit(int unit, int texture) {
		long __functionAddress = GL.getCapabilities().glBindTextureUnit;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, unit, texture);
	}

	// --- [ glGetTextureImage ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexImage GetTexImage}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param bufSize the size of the buffer to receive the retrieved pixel data
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void nglGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureImage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, level, format, type, bufSize, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexImage GetTexImage}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param bufSize the size of the buffer to receive the retrieved pixel data
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void glGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetTextureImage(texture, level, format, type, bufSize, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexImage GetTexImage}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void glGetTextureImage(int texture, int level, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining(), memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glGetTextureImage GetTextureImage}
	 */
	public static void glGetTextureImage(int texture, int level, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining() << 1, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glGetTextureImage GetTextureImage}
	 */
	public static void glGetTextureImage(int texture, int level, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glGetTextureImage GetTextureImage}
	 */
	public static void glGetTextureImage(int texture, int level, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DoubleBuffer version of: {@link #glGetTextureImage GetTextureImage}
	 */
	public static void glGetTextureImage(int texture, int level, int format, int type, DoubleBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining() << 3, memAddress(pixels));
	}

	// --- [ glGetCompressedTextureImage ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL13#glGetCompressedTexImage GetCompressedTexImage}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param bufSize the size of the buffer to receive the retrieved pixel data
	 * @param pixels  a buffer in which to return the compressed texture image
	 */
	public static void nglGetCompressedTextureImage(int texture, int level, int bufSize, long pixels) {
		long __functionAddress = GL.getCapabilities().glGetCompressedTextureImage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, level, bufSize, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL13#glGetCompressedTexImage GetCompressedTexImage}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param bufSize the size of the buffer to receive the retrieved pixel data
	 * @param pixels  a buffer in which to return the compressed texture image
	 */
	public static void glGetCompressedTextureImage(int texture, int level, int bufSize, long pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetCompressedTextureImage(texture, level, bufSize, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL13#glGetCompressedTexImage GetCompressedTexImage}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param pixels  a buffer in which to return the compressed texture image
	 */
	public static void glGetCompressedTextureImage(int texture, int level, ByteBuffer pixels) {
		if ( CHECKS ) {
			if ( DEBUG )
				checkBuffer(pixels, glGetTextureLevelParameteri(texture, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetCompressedTextureImage(texture, level, pixels.remaining(), memAddress(pixels));
	}

	// --- [ glGetTextureLevelParameterfv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureLevelParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexLevelParameterfv GetTexLevelParameterfv}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param pname   the parameter to query
	 * @param params  a scalar or buffer in which to place the returned data
	 */
	public static void nglGetTextureLevelParameterfv(int texture, int level, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetTextureLevelParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, level, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureLevelParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexLevelParameterfv GetTexLevelParameterfv}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param pname   the parameter to query
	 * @param params  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTextureLevelParameterfv(int texture, int level, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTextureLevelParameterfv(texture, level, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureLevelParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexLevelParameterfv GetTexLevelParameterfv}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param pname   the parameter to query
	 */
	public static float glGetTextureLevelParameterf(int texture, int level, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetTextureLevelParameterfv(texture, level, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTextureLevelParameteriv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureLevelParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexLevelParameteriv GetTexLevelParameteriv}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WIDTH TEXTURE_WIDTH}</td><td>{@link GL11#GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}</td><td>{@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}</td><td>{@link GL11#GL_TEXTURE_BORDER TEXTURE_BORDER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}</td><td>{@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}</td><td>{@link GL11#GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}</td><td>{@link GL11#GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}</td></tr><tr><td>{@link GL11#GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}</td><td>{@link GL11#GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}</td><td>{@link GL11#GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}</td><td>{@link GL11#GL_TEXTURE_LUMINANCE_SIZE TEXTURE_LUMINANCE_SIZE}</td></tr><tr><td>{@link GL11#GL_TEXTURE_INTENSITY_SIZE TEXTURE_INTENSITY_SIZE}</td><td>{@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}</td><td>{@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}</td><td>{@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_RED_TYPE TEXTURE_RED_TYPE}</td><td>{@link GL30#GL_TEXTURE_GREEN_TYPE TEXTURE_GREEN_TYPE}</td><td>{@link GL30#GL_TEXTURE_BLUE_TYPE TEXTURE_BLUE_TYPE}</td><td>{@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_LUMINANCE_TYPE TEXTURE_LUMINANCE_TYPE}</td><td>{@link GL30#GL_TEXTURE_INTENSITY_TYPE TEXTURE_INTENSITY_TYPE}</td><td>{@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}</td><td>{@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}</td></tr><tr><td>{@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}</td><td>{@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}</td><td>{@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}</td><td>{@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}</td></tr></table>
	 * @param params  a scalar or buffer in which to place the returned data
	 */
	public static void nglGetTextureLevelParameteriv(int texture, int level, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetTextureLevelParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, level, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureLevelParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexLevelParameteriv GetTexLevelParameteriv}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WIDTH TEXTURE_WIDTH}</td><td>{@link GL11#GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}</td><td>{@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}</td><td>{@link GL11#GL_TEXTURE_BORDER TEXTURE_BORDER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}</td><td>{@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}</td><td>{@link GL11#GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}</td><td>{@link GL11#GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}</td></tr><tr><td>{@link GL11#GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}</td><td>{@link GL11#GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}</td><td>{@link GL11#GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}</td><td>{@link GL11#GL_TEXTURE_LUMINANCE_SIZE TEXTURE_LUMINANCE_SIZE}</td></tr><tr><td>{@link GL11#GL_TEXTURE_INTENSITY_SIZE TEXTURE_INTENSITY_SIZE}</td><td>{@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}</td><td>{@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}</td><td>{@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_RED_TYPE TEXTURE_RED_TYPE}</td><td>{@link GL30#GL_TEXTURE_GREEN_TYPE TEXTURE_GREEN_TYPE}</td><td>{@link GL30#GL_TEXTURE_BLUE_TYPE TEXTURE_BLUE_TYPE}</td><td>{@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_LUMINANCE_TYPE TEXTURE_LUMINANCE_TYPE}</td><td>{@link GL30#GL_TEXTURE_INTENSITY_TYPE TEXTURE_INTENSITY_TYPE}</td><td>{@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}</td><td>{@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}</td></tr><tr><td>{@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}</td><td>{@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}</td><td>{@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}</td><td>{@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}</td></tr></table>
	 * @param params  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTextureLevelParameteriv(int texture, int level, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTextureLevelParameteriv(texture, level, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureLevelParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexLevelParameteriv GetTexLevelParameteriv}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WIDTH TEXTURE_WIDTH}</td><td>{@link GL11#GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}</td><td>{@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}</td><td>{@link GL11#GL_TEXTURE_BORDER TEXTURE_BORDER}</td></tr><tr><td>{@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}</td><td>{@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}</td><td>{@link GL11#GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}</td><td>{@link GL11#GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}</td></tr><tr><td>{@link GL11#GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}</td><td>{@link GL11#GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}</td><td>{@link GL11#GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}</td><td>{@link GL11#GL_TEXTURE_LUMINANCE_SIZE TEXTURE_LUMINANCE_SIZE}</td></tr><tr><td>{@link GL11#GL_TEXTURE_INTENSITY_SIZE TEXTURE_INTENSITY_SIZE}</td><td>{@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}</td><td>{@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}</td><td>{@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_RED_TYPE TEXTURE_RED_TYPE}</td><td>{@link GL30#GL_TEXTURE_GREEN_TYPE TEXTURE_GREEN_TYPE}</td><td>{@link GL30#GL_TEXTURE_BLUE_TYPE TEXTURE_BLUE_TYPE}</td><td>{@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}</td></tr><tr><td>{@link GL30#GL_TEXTURE_LUMINANCE_TYPE TEXTURE_LUMINANCE_TYPE}</td><td>{@link GL30#GL_TEXTURE_INTENSITY_TYPE TEXTURE_INTENSITY_TYPE}</td><td>{@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}</td><td>{@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}</td></tr><tr><td>{@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}</td><td>{@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}</td><td>{@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}</td><td>{@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}</td></tr></table>
	 */
	public static int glGetTextureLevelParameteri(int texture, int level, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTextureLevelParameteriv(texture, level, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTextureParameterfv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexParameterfv GetTexParameterfv}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to query
	 * @param params  a scalar or buffer in which to place the returned data
	 */
	public static void nglGetTextureParameterfv(int texture, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetTextureParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexParameterfv GetTexParameterfv}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to query
	 * @param params  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTextureParameterfv(int texture, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTextureParameterfv(texture, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexParameterfv GetTexParameterfv}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to query
	 */
	public static float glGetTextureParameterf(int texture, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetTextureParameterfv(texture, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTextureParameterIiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetTexParameterIiv GetTexParameterIiv}.
	 *
	 * @param texture the texture name
	 * @param pname   the symbolic name of a texture parameter
	 * @param params  returns the texture parameter value
	 */
	public static void nglGetTextureParameterIiv(int texture, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetTextureParameterIiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetTexParameterIiv GetTexParameterIiv}.
	 *
	 * @param texture the texture name
	 * @param pname   the symbolic name of a texture parameter
	 * @param params  returns the texture parameter value
	 */
	public static void glGetTextureParameterIiv(int texture, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTextureParameterIiv(texture, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetTexParameterIiv GetTexParameterIiv}.
	 *
	 * @param texture the texture name
	 * @param pname   the symbolic name of a texture parameter
	 */
	public static int glGetTextureParameterIi(int texture, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTextureParameterIiv(texture, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTextureParameterIuiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetTexParameterIuiv GetTexParameterIuiv}.
	 *
	 * @param texture the texture name
	 * @param pname   the symbolic name of a texture parameter
	 * @param params  returns the texture parameter value
	 */
	public static void nglGetTextureParameterIuiv(int texture, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetTextureParameterIuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetTexParameterIuiv GetTexParameterIuiv}.
	 *
	 * @param texture the texture name
	 * @param pname   the symbolic name of a texture parameter
	 * @param params  returns the texture parameter value
	 */
	public static void glGetTextureParameterIuiv(int texture, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTextureParameterIuiv(texture, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetTexParameterIuiv GetTexParameterIuiv}.
	 *
	 * @param texture the texture name
	 * @param pname   the symbolic name of a texture parameter
	 */
	public static int glGetTextureParameterIui(int texture, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTextureParameterIuiv(texture, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetTextureParameteriv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexParameteriv GetTexParameteriv}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL11#GL_TEXTURE_PRIORITY TEXTURE_PRIORITY}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td></tr><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td></tr><tr><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td><td>{@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}</td><td>{@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}</td><td>{@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}</td></tr><tr><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}</td></tr><tr><td>{@link GL11#GL_TEXTURE_RESIDENT TEXTURE_RESIDENT}</td></tr></table>
	 * @param params  a scalar or buffer in which to place the returned data
	 */
	public static void nglGetTextureParameteriv(int texture, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetTextureParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexParameteriv GetTexParameteriv}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL11#GL_TEXTURE_PRIORITY TEXTURE_PRIORITY}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td></tr><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td></tr><tr><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td><td>{@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}</td><td>{@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}</td><td>{@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}</td></tr><tr><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}</td></tr><tr><td>{@link GL11#GL_TEXTURE_RESIDENT TEXTURE_RESIDENT}</td></tr></table>
	 * @param params  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTextureParameteriv(int texture, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetTextureParameteriv(texture, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexParameteriv GetTexParameteriv}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to query. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL11#GL_TEXTURE_PRIORITY TEXTURE_PRIORITY}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}</td></tr><tr><td>{@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}</td><td>{@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}</td></tr><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}</td></tr><tr><td>{@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}</td><td>{@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}</td><td>{@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}</td><td>{@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}</td></tr><tr><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}</td><td>{@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}</td><td>{@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}</td></tr><tr><td>{@link GL11#GL_TEXTURE_RESIDENT TEXTURE_RESIDENT}</td></tr></table>
	 */
	public static int glGetTextureParameteri(int texture, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetTextureParameteriv(texture, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glCreateVertexArrays ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateVertexArrays.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused vertex array object names in {@code arrays}.
	 *
	 * @param n      the number of vertex array object names to create
	 * @param arrays the buffer in which to return the created vertex array object names
	 */
	public static void nglCreateVertexArrays(int n, long arrays) {
		long __functionAddress = GL.getCapabilities().glCreateVertexArrays;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, arrays);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateVertexArrays.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused vertex array object names in {@code arrays}.
	 *
	 * @param arrays the buffer in which to return the created vertex array object names
	 */
	public static void glCreateVertexArrays(IntBuffer arrays) {
		nglCreateVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateVertexArrays.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused vertex array object names in {@code arrays}.
	 */
	public static int glCreateVertexArrays() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer arrays = stack.callocInt(1);
			nglCreateVertexArrays(1, memAddress(arrays));
			return arrays.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDisableVertexArrayAttrib ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDisableVertexArrayAttrib.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL20#glDisableVertexAttribArray DisableVertexAttribArray}.
	 *
	 * @param vaobj the vertex array object name
	 * @param index the index of the generic vertex attribute to be disabled
	 */
	public static void glDisableVertexArrayAttrib(int vaobj, int index) {
		long __functionAddress = GL.getCapabilities().glDisableVertexArrayAttrib;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, vaobj, index);
	}

	// --- [ glEnableVertexArrayAttrib ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glEnableVertexArrayAttrib.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL20#glEnableVertexAttribArray EnableVertexAttribArray}.
	 *
	 * @param vaobj the vertex array object name
	 * @param index the index of the generic vertex attribute to be enabled
	 */
	public static void glEnableVertexArrayAttrib(int vaobj, int index) {
		long __functionAddress = GL.getCapabilities().glEnableVertexArrayAttrib;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, vaobj, index);
	}

	// --- [ glVertexArrayElementBuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayElementBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a buffer object to the element array buffer bind point of a vertex array object.
	 *
	 * @param vaobj  the vertex array object name
	 * @param buffer the buffer object name. If {@code buffer} is zero, any existing element array buffer binding to {@code vaobj} is removed.
	 */
	public static void glVertexArrayElementBuffer(int vaobj, int buffer) {
		long __functionAddress = GL.getCapabilities().glVertexArrayElementBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, vaobj, buffer);
	}

	// --- [ glVertexArrayVertexBuffer ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayVertexBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glBindVertexBuffer BindVertexBuffer}.
	 *
	 * @param vaobj        the vertex array object name
	 * @param bindingindex the index of the vertex buffer binding point to which to bind the buffer
	 * @param buffer       the name of an existing buffer to bind to the vertex buffer binding point
	 * @param offset       the offset of the first element of the buffer
	 * @param stride       the distance between elements within the buffer
	 */
	public static void glVertexArrayVertexBuffer(int vaobj, int bindingindex, int buffer, long offset, int stride) {
		long __functionAddress = GL.getCapabilities().glVertexArrayVertexBuffer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, vaobj, bindingindex, buffer, offset, stride);
	}

	// --- [ glVertexArrayVertexBuffers ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayVertexBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL44#glBindVertexBuffers BindVertexBuffers}.
	 *
	 * @param vaobj   the vertex array object name
	 * @param first   the first vertex buffer binding point
	 * @param count   the number of vertex buffer binding points
	 * @param buffers an array of zeros or names of existing buffers objects
	 * @param offsets an array of offses
	 * @param strides an array of stride values
	 */
	public static void nglVertexArrayVertexBuffers(int vaobj, int first, int count, long buffers, long offsets, long strides) {
		long __functionAddress = GL.getCapabilities().glVertexArrayVertexBuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, vaobj, first, count, buffers, offsets, strides);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayVertexBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL44#glBindVertexBuffers BindVertexBuffers}.
	 *
	 * @param vaobj   the vertex array object name
	 * @param first   the first vertex buffer binding point
	 * @param buffers an array of zeros or names of existing buffers objects
	 * @param offsets an array of offses
	 * @param strides an array of stride values
	 */
	public static void glVertexArrayVertexBuffers(int vaobj, int first, IntBuffer buffers, PointerBuffer offsets, IntBuffer strides) {
		if ( CHECKS ) {
			if ( offsets != null ) checkBuffer(offsets, buffers.remaining());
			if ( strides != null ) checkBuffer(strides, buffers.remaining());
		}
		nglVertexArrayVertexBuffers(vaobj, first, buffers == null ? 0 : buffers.remaining(), memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(strides));
	}

	// --- [ glVertexArrayAttribFormat ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayAttribFormat.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glVertexAttribFormat VertexAttribFormat}.
	 *
	 * @param vaobj          the vertex array object name
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type           the type of the data stored in the array
	 * @param normalized     if true then integer data is normalized to the range [-1, 1] or [0, 1] if it is signed or unsigned, respectively. If false then integer data is
	 *                       directly converted to floating point.
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexArrayAttribFormat(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) {
		long __functionAddress = GL.getCapabilities().glVertexArrayAttribFormat;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, vaobj, attribindex, size, type, normalized, relativeoffset);
	}

	// --- [ glVertexArrayAttribIFormat ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayAttribIFormat.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glVertexAttribIFormat VertexAttribIFormat}.
	 *
	 * @param vaobj          the vertex array object name
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexArrayAttribIFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = GL.getCapabilities().glVertexArrayAttribIFormat;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, vaobj, attribindex, size, type, relativeoffset);
	}

	// --- [ glVertexArrayAttribLFormat ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayAttribLFormat.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glVertexAttribLFormat VertexAttribLFormat}.
	 *
	 * @param vaobj          the vertex array object name
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexArrayAttribLFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = GL.getCapabilities().glVertexArrayAttribLFormat;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, vaobj, attribindex, size, type, relativeoffset);
	}

	// --- [ glVertexArrayAttribBinding ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayAttribBinding.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glVertexAttribBinding VertexAttribBinding}.
	 *
	 * @param vaobj        the vertex array object name
	 * @param attribindex  the index of the attribute to associate with a vertex buffer binding
	 * @param bindingindex the index of the vertex buffer binding with which to associate the generic vertex attribute
	 */
	public static void glVertexArrayAttribBinding(int vaobj, int attribindex, int bindingindex) {
		long __functionAddress = GL.getCapabilities().glVertexArrayAttribBinding;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, vaobj, attribindex, bindingindex);
	}

	// --- [ glVertexArrayBindingDivisor ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayBindingDivisor.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glVertexBindingDivisor VertexBindingDivisor}.
	 *
	 * @param vaobj        the vertex array object name
	 * @param bindingindex the index of the generic vertex attribute
	 * @param divisor      the number of instances that will pass between updates of the generic attribute at slot {@code index}
	 */
	public static void glVertexArrayBindingDivisor(int vaobj, int bindingindex, int divisor) {
		long __functionAddress = GL.getCapabilities().glVertexArrayBindingDivisor;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, vaobj, bindingindex, divisor);
	}

	// --- [ glGetVertexArrayiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArray.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries parameters of a vertex array object.
	 *
	 * @param vaobj the vertex array object name
	 * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER_BINDING ELEMENT_ARRAY_BUFFER_BINDING}</td></tr></table>
	 * @param param the buffer in which to return the parameter values
	 */
	public static void nglGetVertexArrayiv(int vaobj, int pname, long param) {
		long __functionAddress = GL.getCapabilities().glGetVertexArrayiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, vaobj, pname, param);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArray.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries parameters of a vertex array object.
	 *
	 * @param vaobj the vertex array object name
	 * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER_BINDING ELEMENT_ARRAY_BUFFER_BINDING}</td></tr></table>
	 * @param param the buffer in which to return the parameter values
	 */
	public static void glGetVertexArrayiv(int vaobj, int pname, IntBuffer param) {
		if ( CHECKS )
			checkBuffer(param, 1);
		nglGetVertexArrayiv(vaobj, pname, memAddress(param));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArray.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries parameters of a vertex array object.
	 *
	 * @param vaobj the vertex array object name
	 * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER_BINDING ELEMENT_ARRAY_BUFFER_BINDING}</td></tr></table>
	 */
	public static int glGetVertexArrayi(int vaobj, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer param = stack.callocInt(1);
			nglGetVertexArrayiv(vaobj, pname, memAddress(param));
			return param.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetVertexArrayIndexediv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArrayIndexed.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries parameters of an attribute of a vertex array object.
	 *
	 * @param vaobj the vertex array object name
	 * @param index the attribute to query
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE},</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td><td>{@link GL43#GL_VERTEX_ATTRIB_ARRAY_LONG VERTEX_ATTRIB_ARRAY_LONG}</td></tr><tr><td>{@link GL43#GL_VERTEX_ATTRIB_RELATIVE_OFFSET VERTEX_ATTRIB_RELATIVE_OFFSET}</td></tr></table>
	 * @param param the buffer in which to return the parameter values
	 */
	public static void nglGetVertexArrayIndexediv(int vaobj, int index, int pname, long param) {
		long __functionAddress = GL.getCapabilities().glGetVertexArrayIndexediv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, vaobj, index, pname, param);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArrayIndexed.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries parameters of an attribute of a vertex array object.
	 *
	 * @param vaobj the vertex array object name
	 * @param index the attribute to query
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE},</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td><td>{@link GL43#GL_VERTEX_ATTRIB_ARRAY_LONG VERTEX_ATTRIB_ARRAY_LONG}</td></tr><tr><td>{@link GL43#GL_VERTEX_ATTRIB_RELATIVE_OFFSET VERTEX_ATTRIB_RELATIVE_OFFSET}</td></tr></table>
	 * @param param the buffer in which to return the parameter values
	 */
	public static void glGetVertexArrayIndexediv(int vaobj, int index, int pname, IntBuffer param) {
		if ( CHECKS )
			checkBuffer(param, 1);
		nglGetVertexArrayIndexediv(vaobj, index, pname, memAddress(param));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArrayIndexed.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries parameters of an attribute of a vertex array object.
	 *
	 * @param vaobj the vertex array object name
	 * @param index the attribute to query
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE},</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}</td><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}</td></tr><tr><td>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td><td>{@link GL43#GL_VERTEX_ATTRIB_ARRAY_LONG VERTEX_ATTRIB_ARRAY_LONG}</td></tr><tr><td>{@link GL43#GL_VERTEX_ATTRIB_RELATIVE_OFFSET VERTEX_ATTRIB_RELATIVE_OFFSET}</td></tr></table>
	 */
	public static int glGetVertexArrayIndexedi(int vaobj, int index, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer param = stack.callocInt(1);
			nglGetVertexArrayIndexediv(vaobj, index, pname, memAddress(param));
			return param.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetVertexArrayIndexed64iv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArrayIndexed64i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries parameters of an attribute of a vertex array object.
	 *
	 * @param vaobj the vertex array object name
	 * @param index the attribute to query
	 * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL43#GL_VERTEX_BINDING_OFFSET VERTEX_BINDING_OFFSET}</td></tr></table>
	 * @param param the buffer in which to return the parameter values
	 */
	public static void nglGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long param) {
		long __functionAddress = GL.getCapabilities().glGetVertexArrayIndexed64iv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, vaobj, index, pname, param);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArrayIndexed64i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries parameters of an attribute of a vertex array object.
	 *
	 * @param vaobj the vertex array object name
	 * @param index the attribute to query
	 * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL43#GL_VERTEX_BINDING_OFFSET VERTEX_BINDING_OFFSET}</td></tr></table>
	 * @param param the buffer in which to return the parameter values
	 */
	public static void glGetVertexArrayIndexed64iv(int vaobj, int index, int pname, LongBuffer param) {
		if ( CHECKS )
			checkBuffer(param, 1);
		nglGetVertexArrayIndexed64iv(vaobj, index, pname, memAddress(param));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArrayIndexed64i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries parameters of an attribute of a vertex array object.
	 *
	 * @param vaobj the vertex array object name
	 * @param index the attribute to query
	 * @param pname the parameter to query. Must be:<br><table><tr><td>{@link GL43#GL_VERTEX_BINDING_OFFSET VERTEX_BINDING_OFFSET}</td></tr></table>
	 */
	public static long glGetVertexArrayIndexed64i(int vaobj, int index, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer param = stack.callocLong(1);
			nglGetVertexArrayIndexed64iv(vaobj, index, pname, memAddress(param));
			return param.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glCreateSamplers ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object.
	 *
	 * @param n        the number of sampler object names to create
	 * @param samplers the buffer in which to return the created sampler object names
	 */
	public static void nglCreateSamplers(int n, long samplers) {
		long __functionAddress = GL.getCapabilities().glCreateSamplers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, samplers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object.
	 *
	 * @param samplers the buffer in which to return the created sampler object names
	 */
	public static void glCreateSamplers(IntBuffer samplers) {
		nglCreateSamplers(samplers.remaining(), memAddress(samplers));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object.
	 */
	public static int glCreateSamplers() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer samplers = stack.callocInt(1);
			nglCreateSamplers(1, memAddress(samplers));
			return samplers.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glCreateProgramPipelines ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateProgramPipelines.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object.
	 *
	 * @param n         the number of program pipeline names to create
	 * @param pipelines the buffer in which to return the created program pipeline names
	 */
	public static void nglCreateProgramPipelines(int n, long pipelines) {
		long __functionAddress = GL.getCapabilities().glCreateProgramPipelines;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, pipelines);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateProgramPipelines.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object.
	 *
	 * @param pipelines the buffer in which to return the created program pipeline names
	 */
	public static void glCreateProgramPipelines(IntBuffer pipelines) {
		nglCreateProgramPipelines(pipelines.remaining(), memAddress(pipelines));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateProgramPipelines.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object.
	 */
	public static int glCreateProgramPipelines() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer pipelines = stack.callocInt(1);
			nglCreateProgramPipelines(1, memAddress(pipelines));
			return pipelines.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glCreateQueries ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateQueries.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused query object names in {@code ids}, each representing a new query object with the specified {@code target}.
	 *
	 * @param target the query target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 * @param n      the number of query object names to create
	 * @param ids    the buffer in which to return the created query object names
	 */
	public static void nglCreateQueries(int target, int n, long ids) {
		long __functionAddress = GL.getCapabilities().glCreateQueries;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, n, ids);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateQueries.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused query object names in {@code ids}, each representing a new query object with the specified {@code target}.
	 *
	 * @param target the query target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 * @param ids    the buffer in which to return the created query object names
	 */
	public static void glCreateQueries(int target, IntBuffer ids) {
		nglCreateQueries(target, ids.remaining(), memAddress(ids));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateQueries.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused query object names in {@code ids}, each representing a new query object with the specified {@code target}.
	 *
	 * @param target the query target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 */
	public static int glCreateQueries(int target) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer ids = stack.callocInt(1);
			nglCreateQueries(target, 1, memAddress(ids));
			return ids.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetQueryBufferObjectiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryBufferObjectiv.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the state of a query object.
	 *
	 * @param id     the name of a query object
	 * @param buffer the name of a buffer object
	 * @param pname  the state to query
	 * @param offset the offset into {@code buffer} at which the queried value is written
	 */
	public static void glGetQueryBufferObjectiv(int id, int buffer, int pname, long offset) {
		long __functionAddress = GL.getCapabilities().glGetQueryBufferObjectiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, buffer, pname, offset);
	}

	// --- [ glGetQueryBufferObjectuiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryBufferObjectuiv.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned version of {@link #glGetQueryBufferObjectiv GetQueryBufferObjectiv}.
	 *
	 * @param id     the name of a query object
	 * @param buffer the name of a buffer object
	 * @param pname  the state to query
	 * @param offset the offset into {@code buffer} at which the queried value is written
	 */
	public static void glGetQueryBufferObjectuiv(int id, int buffer, int pname, long offset) {
		long __functionAddress = GL.getCapabilities().glGetQueryBufferObjectuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, buffer, pname, offset);
	}

	// --- [ glGetQueryBufferObjecti64v ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryBufferObjecti64v.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * 64bit version of {@link #glGetQueryBufferObjectiv GetQueryBufferObjectiv}.
	 *
	 * @param id     the name of a query object
	 * @param buffer the name of a buffer object
	 * @param pname  the state to query
	 * @param offset the offset into {@code buffer} at which the queried value is written
	 */
	public static void glGetQueryBufferObjecti64v(int id, int buffer, int pname, long offset) {
		long __functionAddress = GL.getCapabilities().glGetQueryBufferObjecti64v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, buffer, pname, offset);
	}

	// --- [ glGetQueryBufferObjectui64v ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryBufferObjectui64v.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * 64bit version of {@link #glGetQueryBufferObjectuiv GetQueryBufferObjectuiv}.
	 *
	 * @param id     the name of a query object
	 * @param buffer the name of a buffer object
	 * @param pname  the state to query
	 * @param offset the offset into {@code buffer} at which the queried value is written
	 */
	public static void glGetQueryBufferObjectui64v(int id, int buffer, int pname, long offset) {
		long __functionAddress = GL.getCapabilities().glGetQueryBufferObjectui64v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, buffer, pname, offset);
	}

	// --- [ glMemoryBarrierByRegion ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMemoryBarrierByRegion.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Behaves like {@link GL42#glMemoryBarrier MemoryBarrier}, with two differences:
	 * 
	 * <p>First, it narrows the region under consideration so that only reads/writes of prior fragment shaders that are invoked for a smaller region of the
	 * framebuffer will be completed/reflected prior to subsequent reads/write of following fragment shaders. The size of the region is implementation
	 * dependent and may be as small as one framebuffer pixel.</p>
	 * 
	 * <p>Second, it only applies to memory transactions that may be read by or written by a fragment shader.</p>
	 * 
	 * <p>When barriers is {@link GL42#GL_ALL_BARRIER_BITS ALL_BARRIER_BITS}, shader memory accesses will be synchronized relative to all these barrier bits, but not to other
	 * barrier bits specific to {@link GL42#glMemoryBarrier MemoryBarrier}. This implies that reads/writes for scatter/gather-like algorithms may or may not be
	 * completed/reflected after a MemoryBarrierByRegion command. However, for uses such as deferred shading, where a linked list of visible
	 * surfaces with the head at a framebuffer address may be constructed, and the entirety of the list is only dependent on previous executions at that
	 * framebuffer address, MemoryBarrierByRegion may be significantly more efficient than {@link GL42#glMemoryBarrier MemoryBarrier}.</p>
	 *
	 * @param barriers the barriers to insert. One or more of:<br><table><tr><td>{@link GL42#GL_ATOMIC_COUNTER_BARRIER_BIT ATOMIC_COUNTER_BARRIER_BIT}</td><td>{@link GL42#GL_FRAMEBUFFER_BARRIER_BIT FRAMEBUFFER_BARRIER_BIT}</td><td>{@link GL42#GL_SHADER_IMAGE_ACCESS_BARRIER_BIT SHADER_IMAGE_ACCESS_BARRIER_BIT}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BARRIER_BIT SHADER_STORAGE_BARRIER_BIT}</td><td>{@link GL42#GL_TEXTURE_FETCH_BARRIER_BIT TEXTURE_FETCH_BARRIER_BIT}</td><td>{@link GL42#GL_UNIFORM_BARRIER_BIT UNIFORM_BARRIER_BIT}</td></tr></table>
	 */
	public static void glMemoryBarrierByRegion(int barriers) {
		long __functionAddress = GL.getCapabilities().glMemoryBarrierByRegion;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, barriers);
	}

	// --- [ glGetTextureSubImage ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Obtains sub-regions of a texture image from a texture object.
	 *
	 * @param texture the source texture object name
	 * @param level   the level-of-detail number
	 * @param xoffset the x-position of the subregion
	 * @param yoffset the y-position of the subregion
	 * @param zoffset the z-position of the subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param bufSize the size of the buffer to receive the retrieved pixel data
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void nglGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureSubImage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Obtains sub-regions of a texture image from a texture object.
	 *
	 * @param texture the source texture object name
	 * @param level   the level-of-detail number
	 * @param xoffset the x-position of the subregion
	 * @param yoffset the y-position of the subregion
	 * @param zoffset the z-position of the subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param bufSize the size of the buffer to receive the retrieved pixel data
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Obtains sub-regions of a texture image from a texture object.
	 *
	 * @param texture the source texture object name
	 * @param level   the level-of-detail number
	 * @param xoffset the x-position of the subregion
	 * @param yoffset the y-position of the subregion
	 * @param zoffset the z-position of the subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining(), memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glGetTextureSubImage GetTextureSubImage}
	 */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 1, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glGetTextureSubImage GetTextureSubImage}
	 */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glGetTextureSubImage GetTextureSubImage}
	 */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DoubleBuffer version of: {@link #glGetTextureSubImage GetTextureSubImage}
	 */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 3, memAddress(pixels));
	}

	// --- [ glGetCompressedTextureSubImage ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Obtains a sub-region of a compressed texture image.
	 *
	 * @param texture the source texture object name
	 * @param level   the level-of-detail number
	 * @param xoffset the x-position of the subregion
	 * @param yoffset the y-position of the subregion
	 * @param zoffset the z-position of the subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param bufSize the size of the buffer to receive the retrieved pixel data
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void nglGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels) {
		long __functionAddress = GL.getCapabilities().glGetCompressedTextureSubImage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Obtains a sub-region of a compressed texture image.
	 *
	 * @param texture the source texture object name
	 * @param level   the level-of-detail number
	 * @param xoffset the x-position of the subregion
	 * @param yoffset the y-position of the subregion
	 * @param zoffset the z-position of the subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param bufSize the size of the buffer to receive the retrieved pixel data
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Obtains a sub-region of a compressed texture image.
	 *
	 * @param texture the source texture object name
	 * @param level   the level-of-detail number
	 * @param xoffset the x-position of the subregion
	 * @param yoffset the y-position of the subregion
	 * @param zoffset the z-position of the subregion
	 * @param width   the subregion width
	 * @param height  the subregion height
	 * @param depth   the subregion depth
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, ByteBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining(), memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
	 */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, ShortBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 1, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
	 */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, IntBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 2, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
	 */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, FloatBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 2, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DoubleBuffer version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
	 */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, DoubleBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 3, memAddress(pixels));
	}

	// --- [ glTextureBarrier ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureBarrier.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Guarantees that writes have completed and caches have been invalidated before subsequent Draws are executed.
	 */
	public static void glTextureBarrier() {
		long __functionAddress = GL.getCapabilities().glTextureBarrier;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress);
	}

	// --- [ glGetGraphicsResetStatus ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetGraphicsResetStatus.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Indicates if the GL context has been in a reset state at any point since the last call to GetGraphicsResetStatus:
	 * 
	 * <ul>
	 * <li>{@link GL11#GL_NO_ERROR NO_ERROR} indicates that the GL context has not been in a reset state since the last call.</li>
	 * <li>{@link #GL_GUILTY_CONTEXT_RESET GUILTY_CONTEXT_RESET} indicates that a reset has been detected that is attributable to the current GL context.</li>
	 * <li>{@link #GL_INNOCENT_CONTEXT_RESET INNOCENT_CONTEXT_RESET} indicates a reset has been detected that is not attributable to the current GL context.</li>
	 * <li>{@link #GL_UNKNOWN_CONTEXT_RESET UNKNOWN_CONTEXT_RESET} indicates a detected graphics reset whose cause is unknown.</li>
	 * </ul>
	 * 
	 * <p>If a reset status other than NO_ERROR is returned and subsequent calls return NO_ERROR, the context reset was encountered and completed. If a reset
	 * status is repeatedly returned, the context may be in the process of resetting.</p>
	 * 
	 * <p>Reset notification behavior is determined at context creation time, and may be queried by calling GetIntegerv with the symbolic constant
	 * {@link #GL_RESET_NOTIFICATION_STRATEGY RESET_NOTIFICATION_STRATEGY}.</p>
	 * 
	 * <p>If the reset notification behavior is {@link #GL_NO_RESET_NOTIFICATION NO_RESET_NOTIFICATION}, then the implementation will never deliver notification of reset events, and
	 * GetGraphicsResetStatus will always return NO_ERROR.</p>
	 * 
	 * <p>If the behavior is {@link #GL_LOSE_CONTEXT_ON_RESET LOSE_CONTEXT_ON_RESET}, a graphics reset will result in a lost context and require creating a new context as described
	 * above. In this case GetGraphicsResetStatus will return an appropriate value from those described above.</p>
	 * 
	 * <p>If a graphics reset notification occurs in a context, a notification must also occur in all other contexts which share objects with that context.</p>
	 * 
	 * <p>After a graphics reset has occurred on a context, subsequent GL commands on that context (or any context which shares with that context) will generate a
	 * {@link #GL_CONTEXT_LOST CONTEXT_LOST} error. Such commands will not have side effects (in particular, they will not modify memory passed by pointer for query results,
	 * and may not block indefinitely or cause termination of the application. Exceptions to this behavior include:</p>
	 * 
	 * <ul>
	 * <li>{@link GL11#glGetError GetError} and GetGraphicsResetStatus behave normally following a graphics reset, so that the application can determine a reset has
	 * occurred, and when it is safe to destroy and recreate the context.</li>
	 * <li>Any commands which might cause a polling application to block indefinitely will generate a CONTEXT_LOST error, but will also return a value
	 * indicating completion to the application.</li>
	 * </ul>
	 */
	public static int glGetGraphicsResetStatus() {
		long __functionAddress = GL.getCapabilities().glGetGraphicsResetStatus;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callI(__functionAddress);
	}

	// --- [ glGetnMapdv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetMapdv GetMapdv}
	 *
	 * @param target  the evaluator map
	 * @param query   the information to query
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void nglGetnMapdv(int target, int query, int bufSize, long data) {
		long __functionAddress = GL.getCapabilities().glGetnMapdv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, query, bufSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetMapdv GetMapdv}
	 *
	 * @param target the evaluator map
	 * @param query  the information to query
	 * @param data   a buffer in which to place the returned data
	 */
	public static void glGetnMapdv(int target, int query, DoubleBuffer data) {
		nglGetnMapdv(target, query, data.remaining(), memAddress(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetMapdv GetMapdv}
	 *
	 * @param target the evaluator map
	 * @param query  the information to query
	 */
	public static double glGetnMapd(int target, int query) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			DoubleBuffer data = stack.callocDouble(1);
			nglGetnMapdv(target, query, 1, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetnMapfv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetMapfv GetMapfv}
	 *
	 * @param target  the evaluator map
	 * @param query   the information to query
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void nglGetnMapfv(int target, int query, int bufSize, long data) {
		long __functionAddress = GL.getCapabilities().glGetnMapfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, query, bufSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetMapfv GetMapfv}
	 *
	 * @param target the evaluator map
	 * @param query  the information to query
	 * @param data   a buffer in which to place the returned data
	 */
	public static void glGetnMapfv(int target, int query, FloatBuffer data) {
		nglGetnMapfv(target, query, data.remaining(), memAddress(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetMapfv GetMapfv}
	 *
	 * @param target the evaluator map
	 * @param query  the information to query
	 */
	public static float glGetnMapf(int target, int query) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer data = stack.callocFloat(1);
			nglGetnMapfv(target, query, 1, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetnMapiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetMapiv GetMapiv}
	 *
	 * @param target  the evaluator target. One of:<br><table><tr><td>{@link GL11#GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link GL11#GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link GL11#GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link GL11#GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link GL11#GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td><td>{@link GL11#GL_MAP2_VERTEX_3 MAP2_VERTEX_3}</td><td>{@link GL11#GL_MAP2_VERTEX_4 MAP2_VERTEX_4}</td></tr><tr><td>{@link GL11#GL_MAP2_COLOR_4 MAP2_COLOR_4}</td><td>{@link GL11#GL_MAP2_NORMAL MAP2_NORMAL}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}</td></tr><tr><td>{@link GL11#GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}</td></tr></table>
	 * @param query   the information to query. One of:<br><table><tr><td>{@link GL11#GL_ORDER ORDER}</td><td>{@link GL11#GL_COEFF COEFF}</td><td>{@link GL11#GL_DOMAIN DOMAIN}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void nglGetnMapiv(int target, int query, int bufSize, long data) {
		long __functionAddress = GL.getCapabilities().glGetnMapiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, query, bufSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetMapiv GetMapiv}
	 *
	 * @param target the evaluator target. One of:<br><table><tr><td>{@link GL11#GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link GL11#GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link GL11#GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link GL11#GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link GL11#GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td><td>{@link GL11#GL_MAP2_VERTEX_3 MAP2_VERTEX_3}</td><td>{@link GL11#GL_MAP2_VERTEX_4 MAP2_VERTEX_4}</td></tr><tr><td>{@link GL11#GL_MAP2_COLOR_4 MAP2_COLOR_4}</td><td>{@link GL11#GL_MAP2_NORMAL MAP2_NORMAL}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}</td></tr><tr><td>{@link GL11#GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}</td></tr></table>
	 * @param query  the information to query. One of:<br><table><tr><td>{@link GL11#GL_ORDER ORDER}</td><td>{@link GL11#GL_COEFF COEFF}</td><td>{@link GL11#GL_DOMAIN DOMAIN}</td></tr></table>
	 * @param data   a buffer in which to place the returned data
	 */
	public static void glGetnMapiv(int target, int query, IntBuffer data) {
		nglGetnMapiv(target, query, data.remaining(), memAddress(data));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetMapiv GetMapiv}
	 *
	 * @param target the evaluator target. One of:<br><table><tr><td>{@link GL11#GL_MAP1_VERTEX_3 MAP1_VERTEX_3}</td><td>{@link GL11#GL_MAP1_VERTEX_4 MAP1_VERTEX_4}</td><td>{@link GL11#GL_MAP1_COLOR_4 MAP1_COLOR_4}</td><td>{@link GL11#GL_MAP1_NORMAL MAP1_NORMAL}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_1 MAP1_TEXTURE_COORD_1}</td></tr><tr><td>{@link GL11#GL_MAP1_TEXTURE_COORD_2 MAP1_TEXTURE_COORD_2}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_3 MAP1_TEXTURE_COORD_3}</td><td>{@link GL11#GL_MAP1_TEXTURE_COORD_4 MAP1_TEXTURE_COORD_4}</td><td>{@link GL11#GL_MAP2_VERTEX_3 MAP2_VERTEX_3}</td><td>{@link GL11#GL_MAP2_VERTEX_4 MAP2_VERTEX_4}</td></tr><tr><td>{@link GL11#GL_MAP2_COLOR_4 MAP2_COLOR_4}</td><td>{@link GL11#GL_MAP2_NORMAL MAP2_NORMAL}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_1 MAP2_TEXTURE_COORD_1}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_2 MAP2_TEXTURE_COORD_2}</td><td>{@link GL11#GL_MAP2_TEXTURE_COORD_3 MAP2_TEXTURE_COORD_3}</td></tr><tr><td>{@link GL11#GL_MAP2_TEXTURE_COORD_4 MAP2_TEXTURE_COORD_4}</td></tr></table>
	 * @param query  the information to query. One of:<br><table><tr><td>{@link GL11#GL_ORDER ORDER}</td><td>{@link GL11#GL_COEFF COEFF}</td><td>{@link GL11#GL_DOMAIN DOMAIN}</td></tr></table>
	 */
	public static int glGetnMapi(int target, int query) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer data = stack.callocInt(1);
			nglGetnMapiv(target, query, 1, memAddress(data));
			return data.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetnPixelMapfv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnPixelMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetPixelMapfv GetPixelMapfv}
	 *
	 * @param map     the pixel map parameter to query. One of:<br><table><tr><td>{@link GL11#GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link GL11#GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link GL11#GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link GL11#GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link GL11#GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link GL11#GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link GL11#GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link GL11#GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link GL11#GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link GL11#GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void nglGetnPixelMapfv(int map, int bufSize, long data) {
		long __functionAddress = GL.getCapabilities().glGetnPixelMapfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, map, bufSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnPixelMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetPixelMapfv GetPixelMapfv}
	 *
	 * @param map  the pixel map parameter to query. One of:<br><table><tr><td>{@link GL11#GL_PIXEL_MAP_I_TO_I PIXEL_MAP_I_TO_I}</td><td>{@link GL11#GL_PIXEL_MAP_S_TO_S PIXEL_MAP_S_TO_S}</td><td>{@link GL11#GL_PIXEL_MAP_I_TO_R PIXEL_MAP_I_TO_R}</td><td>{@link GL11#GL_PIXEL_MAP_I_TO_G PIXEL_MAP_I_TO_G}</td><td>{@link GL11#GL_PIXEL_MAP_I_TO_B PIXEL_MAP_I_TO_B}</td></tr><tr><td>{@link GL11#GL_PIXEL_MAP_I_TO_A PIXEL_MAP_I_TO_A}</td><td>{@link GL11#GL_PIXEL_MAP_R_TO_R PIXEL_MAP_R_TO_R}</td><td>{@link GL11#GL_PIXEL_MAP_G_TO_G PIXEL_MAP_G_TO_G}</td><td>{@link GL11#GL_PIXEL_MAP_B_TO_B PIXEL_MAP_B_TO_B}</td><td>{@link GL11#GL_PIXEL_MAP_A_TO_A PIXEL_MAP_A_TO_A}</td></tr></table>
	 * @param data a buffer in which to place the returned data
	 */
	public static void glGetnPixelMapfv(int map, FloatBuffer data) {
		nglGetnPixelMapfv(map, data.remaining(), memAddress(data));
	}

	// --- [ glGetnPixelMapuiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnPixelMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetPixelMapuiv GetPixelMapuiv}
	 *
	 * @param map     the pixel map parameter to query
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void nglGetnPixelMapuiv(int map, int bufSize, long data) {
		long __functionAddress = GL.getCapabilities().glGetnPixelMapuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, map, bufSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnPixelMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetPixelMapuiv GetPixelMapuiv}
	 *
	 * @param map  the pixel map parameter to query
	 * @param data a buffer in which to place the returned data
	 */
	public static void glGetnPixelMapuiv(int map, IntBuffer data) {
		nglGetnPixelMapuiv(map, data.remaining(), memAddress(data));
	}

	// --- [ glGetnPixelMapusv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnPixelMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetPixelMapusv GetPixelMapusv}
	 *
	 * @param map     the pixel map parameter to query
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param data    a buffer in which to place the returned data
	 */
	public static void nglGetnPixelMapusv(int map, int bufSize, long data) {
		long __functionAddress = GL.getCapabilities().glGetnPixelMapusv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, map, bufSize, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnPixelMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetPixelMapusv GetPixelMapusv}
	 *
	 * @param map  the pixel map parameter to query
	 * @param data a buffer in which to place the returned data
	 */
	public static void glGetnPixelMapusv(int map, ShortBuffer data) {
		nglGetnPixelMapusv(map, data.remaining(), memAddress(data));
	}

	// --- [ glGetnPolygonStipple ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnPolygonStipple.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetPolygonStipple GetPolygonStipple}
	 *
	 * @param bufSize the maximum number of bytes to write into {@code pattern}
	 * @param pattern a buffer in which to place the returned pattern
	 */
	public static void nglGetnPolygonStipple(int bufSize, long pattern) {
		long __functionAddress = GL.getCapabilities().glGetnPolygonStipple;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, bufSize, pattern);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnPolygonStipple.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetPolygonStipple GetPolygonStipple}
	 *
	 * @param bufSize the maximum number of bytes to write into {@code pattern}
	 * @param pattern a buffer in which to place the returned pattern
	 */
	public static void glGetnPolygonStipple(int bufSize, long pattern) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnPolygonStipple(bufSize, pattern);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnPolygonStipple.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetPolygonStipple GetPolygonStipple}
	 *
	 * @param pattern a buffer in which to place the returned pattern
	 */
	public static void glGetnPolygonStipple(ByteBuffer pattern) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnPolygonStipple(pattern.remaining(), memAddress(pattern));
	}

	// --- [ glGetnTexImage ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetTexImage GetTexImage}
	 *
	 * @param tex     the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
	 * @param level   the level-of-detail number
	 * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code img}
	 * @param img     a buffer in which to place the returned data
	 */
	public static void nglGetnTexImage(int tex, int level, int format, int type, int bufSize, long img) {
		long __functionAddress = GL.getCapabilities().glGetnTexImage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, tex, level, format, type, bufSize, img);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetTexImage GetTexImage}
	 *
	 * @param tex     the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
	 * @param level   the level-of-detail number
	 * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code img}
	 * @param img     a buffer in which to place the returned data
	 */
	public static void glGetnTexImage(int tex, int level, int format, int type, int bufSize, long img) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnTexImage(tex, level, format, type, bufSize, img);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL11#glGetTexImage GetTexImage}
	 *
	 * @param tex    the texture (or texture face) to be obtained. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr></table>
	 * @param level  the level-of-detail number
	 * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param img    a buffer in which to place the returned data
	 */
	public static void glGetnTexImage(int tex, int level, int format, int type, ByteBuffer img) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnTexImage(tex, level, format, type, img.remaining(), memAddress(img));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glGetnTexImage GetnTexImage}
	 */
	public static void glGetnTexImage(int tex, int level, int format, int type, ShortBuffer img) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnTexImage(tex, level, format, type, img.remaining() << 1, memAddress(img));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glGetnTexImage GetnTexImage}
	 */
	public static void glGetnTexImage(int tex, int level, int format, int type, IntBuffer img) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnTexImage(tex, level, format, type, img.remaining() << 2, memAddress(img));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glGetnTexImage GetnTexImage}
	 */
	public static void glGetnTexImage(int tex, int level, int format, int type, FloatBuffer img) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnTexImage(tex, level, format, type, img.remaining() << 2, memAddress(img));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DoubleBuffer version of: {@link #glGetnTexImage GetnTexImage}
	 */
	public static void glGetnTexImage(int tex, int level, int format, int type, DoubleBuffer img) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnTexImage(tex, level, format, type, img.remaining() << 3, memAddress(img));
	}

	// --- [ glReadnPixels ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glReadnPixels.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Behaves identically to {@link GL11#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
	 *
	 * @param x       the left pixel coordinate
	 * @param y       the lower pixel coordinate
	 * @param width   the number of pixels to read in the x-dimension
	 * @param height  the number of pixels to read in the y-dimension
	 * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param pixels  a buffer in which to place the returned pixel data
	 */
	public static void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
		long __functionAddress = GL.getCapabilities().glReadnPixels;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, x, y, width, height, format, type, bufSize, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glReadnPixels.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Behaves identically to {@link GL11#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
	 *
	 * @param x       the left pixel coordinate
	 * @param y       the lower pixel coordinate
	 * @param width   the number of pixels to read in the x-dimension
	 * @param height  the number of pixels to read in the y-dimension
	 * @param format  the pixel format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type    the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param pixels  a buffer in which to place the returned pixel data
	 */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglReadnPixels(x, y, width, height, format, type, bufSize, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glReadnPixels.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Behaves identically to {@link GL11#glReadPixels ReadPixels} except that it does not write more than {@code bufSize} bytes into {@code data}
	 *
	 * @param x      the left pixel coordinate
	 * @param y      the lower pixel coordinate
	 * @param width  the number of pixels to read in the x-dimension
	 * @param height the number of pixels to read in the y-dimension
	 * @param format the pixel format. One of:<br><table><tr><td>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}</td><td>{@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}</td><td>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}</td><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL30#GL_RG RG}</td></tr><tr><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td><td>{@link GL30#GL_RED_INTEGER RED_INTEGER}</td><td>{@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}</td></tr><tr><td>{@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}</td><td>{@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}</td><td>{@link GL30#GL_RG_INTEGER RG_INTEGER}</td><td>{@link GL30#GL_RGB_INTEGER RGB_INTEGER}</td><td>{@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}</td><td>{@link GL30#GL_BGR_INTEGER BGR_INTEGER}</td><td>{@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}</td></tr></table>
	 * @param type   the pixel type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr><tr><td>{@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}</td><td>{@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}</td><td>{@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}</td><td>{@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}</td></tr><tr><td>{@link GL11#GL_BITMAP BITMAP}</td></tr></table>
	 * @param pixels a buffer in which to place the returned pixel data
	 */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining(), memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glReadnPixels.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glReadnPixels ReadnPixels}
	 */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 1, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glReadnPixels.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glReadnPixels ReadnPixels}
	 */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glReadnPixels.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glReadnPixels ReadnPixels}
	 */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	// --- [ glGetnColorTable ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnColorTable.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetColorTable GetColorTable}
	 *
	 * @param target  the color table target. One of:<br><table><tr><td>{@link ARBImaging#GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param format  the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type    the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code table}
	 * @param table   a buffer in which to place the returned data
	 */
	public static void nglGetnColorTable(int target, int format, int type, int bufSize, long table) {
		long __functionAddress = GL.getCapabilities().glGetnColorTable;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, format, type, bufSize, table);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnColorTable.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetColorTable GetColorTable}
	 *
	 * @param target  the color table target. One of:<br><table><tr><td>{@link ARBImaging#GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param format  the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type    the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code table}
	 * @param table   a buffer in which to place the returned data
	 */
	public static void glGetnColorTable(int target, int format, int type, int bufSize, long table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnColorTable(target, format, type, bufSize, table);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnColorTable.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetColorTable GetColorTable}
	 *
	 * @param target the color table target. One of:<br><table><tr><td>{@link ARBImaging#GL_COLOR_TABLE COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_CONVOLUTION_COLOR_TABLE POST_CONVOLUTION_COLOR_TABLE}</td><td>{@link ARBImaging#GL_POST_COLOR_MATRIX_COLOR_TABLE POST_COLOR_MATRIX_COLOR_TABLE}</td></tr></table>
	 * @param format the color data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the color data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param table  a buffer in which to place the returned data
	 */
	public static void glGetnColorTable(int target, int format, int type, ByteBuffer table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnColorTable(target, format, type, table.remaining(), memAddress(table));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnColorTable.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * ShortBuffer version of: {@link #glGetnColorTable GetnColorTable}
	 */
	public static void glGetnColorTable(int target, int format, int type, ShortBuffer table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnColorTable(target, format, type, table.remaining() << 1, memAddress(table));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnColorTable.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * IntBuffer version of: {@link #glGetnColorTable GetnColorTable}
	 */
	public static void glGetnColorTable(int target, int format, int type, IntBuffer table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnColorTable(target, format, type, table.remaining() << 2, memAddress(table));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnColorTable.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * FloatBuffer version of: {@link #glGetnColorTable GetnColorTable}
	 */
	public static void glGetnColorTable(int target, int format, int type, FloatBuffer table) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnColorTable(target, format, type, table.remaining() << 2, memAddress(table));
	}

	// --- [ glGetnConvolutionFilter ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnConvolutionFilter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetConvolutionFilter GetConvolutionFilter}
	 *
	 * @param target  the convolution target. One of:<br><table><tr><td>{@link ARBImaging#GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link ARBImaging#GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
	 * @param format  the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type    the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code image}
	 * @param image   a buffer in which to place the returned data
	 */
	public static void nglGetnConvolutionFilter(int target, int format, int type, int bufSize, long image) {
		long __functionAddress = GL.getCapabilities().glGetnConvolutionFilter;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, format, type, bufSize, image);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnConvolutionFilter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetConvolutionFilter GetConvolutionFilter}
	 *
	 * @param target  the convolution target. One of:<br><table><tr><td>{@link ARBImaging#GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link ARBImaging#GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
	 * @param format  the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type    the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code image}
	 * @param image   a buffer in which to place the returned data
	 */
	public static void glGetnConvolutionFilter(int target, int format, int type, int bufSize, long image) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnConvolutionFilter(target, format, type, bufSize, image);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnConvolutionFilter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetConvolutionFilter GetConvolutionFilter}
	 *
	 * @param target the convolution target. One of:<br><table><tr><td>{@link ARBImaging#GL_CONVOLUTION_1D CONVOLUTION_1D}</td><td>{@link ARBImaging#GL_CONVOLUTION_2D CONVOLUTION_2D}</td></tr></table>
	 * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param image  a buffer in which to place the returned data
	 */
	public static void glGetnConvolutionFilter(int target, int format, int type, ByteBuffer image) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnConvolutionFilter(target, format, type, image.remaining(), memAddress(image));
	}

	// --- [ glGetnSeparableFilter ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnSeparableFilter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetSeparableFilter GetSeparableFilter}
	 *
	 * @param target        the filter target. Must be:<br><table><tr><td>{@link ARBImaging#GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param format        the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type          the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param rowBufSize    the maximum number of bytes to write into {@code row}
	 * @param row           a buffer in which to return the filter row
	 * @param columnBufSize the maximum number of bytes to write into {@code column}
	 * @param column        a buffer in which to return the filter column
	 * @param span          
	 */
	public static void nglGetnSeparableFilter(int target, int format, int type, int rowBufSize, long row, int columnBufSize, long column, long span) {
		long __functionAddress = GL.getCapabilities().glGetnSeparableFilter;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, target, format, type, rowBufSize, row, columnBufSize, column, span);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnSeparableFilter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetSeparableFilter GetSeparableFilter}
	 *
	 * @param target        the filter target. Must be:<br><table><tr><td>{@link ARBImaging#GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param format        the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type          the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param rowBufSize    the maximum number of bytes to write into {@code row}
	 * @param row           a buffer in which to return the filter row
	 * @param columnBufSize the maximum number of bytes to write into {@code column}
	 * @param column        a buffer in which to return the filter column
	 * @param span          
	 */
	public static void glGetnSeparableFilter(int target, int format, int type, int rowBufSize, long row, int columnBufSize, long column, ByteBuffer span) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnSeparableFilter(target, format, type, rowBufSize, row, columnBufSize, column, memAddressSafe(span));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnSeparableFilter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetSeparableFilter GetSeparableFilter}
	 *
	 * @param target the filter target. Must be:<br><table><tr><td>{@link ARBImaging#GL_SEPARABLE_2D SEPARABLE_2D}</td></tr></table>
	 * @param format the filter data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the filter data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param row    a buffer in which to return the filter row
	 * @param column a buffer in which to return the filter column
	 * @param span   
	 */
	public static void glGetnSeparableFilter(int target, int format, int type, ByteBuffer row, ByteBuffer column, ByteBuffer span) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnSeparableFilter(target, format, type, row.remaining(), memAddress(row), column.remaining(), memAddress(column), memAddressSafe(span));
	}

	// --- [ glGetnHistogram ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnHistogram.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetHistogram GetHistogram}
	 *
	 * @param target  the histogram target. Must be:<br><table><tr><td>{@link ARBImaging#GL_HISTOGRAM HISTOGRAM}</td></tr></table>
	 * @param reset   if {@link GL11#GL_TRUE TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type    the pixel data types. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code values}
	 * @param values  a buffer in which to place the returned data
	 */
	public static void nglGetnHistogram(int target, boolean reset, int format, int type, int bufSize, long values) {
		long __functionAddress = GL.getCapabilities().glGetnHistogram;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, reset, format, type, bufSize, values);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnHistogram.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetHistogram GetHistogram}
	 *
	 * @param target  the histogram target. Must be:<br><table><tr><td>{@link ARBImaging#GL_HISTOGRAM HISTOGRAM}</td></tr></table>
	 * @param reset   if {@link GL11#GL_TRUE TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type    the pixel data types. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code values}
	 * @param values  a buffer in which to place the returned data
	 */
	public static void glGetnHistogram(int target, boolean reset, int format, int type, int bufSize, long values) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnHistogram(target, reset, format, type, bufSize, values);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnHistogram.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetHistogram GetHistogram}
	 *
	 * @param target the histogram target. Must be:<br><table><tr><td>{@link ARBImaging#GL_HISTOGRAM HISTOGRAM}</td></tr></table>
	 * @param reset  if {@link GL11#GL_TRUE TRUE}, then all counters of all elements of the histogram are reset to zero. Counters are reset whether returned or not.
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the pixel data types. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param values a buffer in which to place the returned data
	 */
	public static void glGetnHistogram(int target, boolean reset, int format, int type, ByteBuffer values) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnHistogram(target, reset, format, type, values.remaining(), memAddress(values));
	}

	// --- [ glGetnMinmax ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMinmax.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetMinmax GetMinmax}
	 *
	 * @param target  the minmax target. Must be:<br><table><tr><td>{@link ARBImaging#GL_MINMAX MINMAX}</td></tr></table>
	 * @param reset   If {@link GL11#GL_TRUE TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
	 *                representable value. All values are reset, whether returned or not.
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code values}
	 * @param values  a buffer in which to place the returned data
	 */
	public static void nglGetnMinmax(int target, boolean reset, int format, int type, int bufSize, long values) {
		long __functionAddress = GL.getCapabilities().glGetnMinmax;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, reset, format, type, bufSize, values);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMinmax.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetMinmax GetMinmax}
	 *
	 * @param target  the minmax target. Must be:<br><table><tr><td>{@link ARBImaging#GL_MINMAX MINMAX}</td></tr></table>
	 * @param reset   If {@link GL11#GL_TRUE TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
	 *                representable value. All values are reset, whether returned or not.
	 * @param format  the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type    the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param bufSize the maximum number of bytes to write into {@code values}
	 * @param values  a buffer in which to place the returned data
	 */
	public static void glGetnMinmax(int target, boolean reset, int format, int type, int bufSize, long values) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnMinmax(target, reset, format, type, bufSize, values);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMinmax.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link ARBImaging#glGetMinmax GetMinmax}
	 *
	 * @param target the minmax target. Must be:<br><table><tr><td>{@link ARBImaging#GL_MINMAX MINMAX}</td></tr></table>
	 * @param reset  If {@link GL11#GL_TRUE TRUE}, then each minimum value is reset to the maximum representable value, and each maximum value is reset to the minimum
	 *               representable value. All values are reset, whether returned or not.
	 * @param format the pixel data format. One of:<br><table><tr><td>{@link GL11#GL_RED RED}</td><td>{@link GL11#GL_GREEN GREEN}</td><td>{@link GL11#GL_BLUE BLUE}</td><td>{@link GL11#GL_ALPHA ALPHA}</td><td>{@link GL11#GL_RGB RGB}</td><td>{@link GL11#GL_RGBA RGBA}</td><td>{@link GL12#GL_BGR BGR}</td><td>{@link GL12#GL_BGRA BGRA}</td><td>{@link GL11#GL_LUMINANCE LUMINANCE}</td><td>{@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}</td></tr></table>
	 * @param type   the pixel data type. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_SHORT SHORT}</td></tr><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}</td><td>{@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}</td><td>{@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}</td><td>{@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}</td><td>{@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}</td><td>{@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}</td></tr><tr><td>{@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param values a buffer in which to place the returned data
	 */
	public static void glGetnMinmax(int target, boolean reset, int format, int type, ByteBuffer values) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetnMinmax(target, reset, format, type, values.remaining(), memAddress(values));
	}

	// --- [ glGetnCompressedTexImage ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnCompressedTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL13#glGetCompressedTexImage GetCompressedTexImage}
	 *
	 * @param target  the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
	 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param bufSize the maximum number of bytes to write into {@code img}
	 * @param img     a buffer in which to place the returned data
	 */
	public static void nglGetnCompressedTexImage(int target, int level, int bufSize, long img) {
		long __functionAddress = GL.getCapabilities().glGetnCompressedTexImage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, level, bufSize, img);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnCompressedTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL13#glGetCompressedTexImage GetCompressedTexImage}
	 *
	 * @param target  the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
	 * @param level   the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param bufSize the maximum number of bytes to write into {@code img}
	 * @param img     a buffer in which to place the returned data
	 */
	public static void glGetnCompressedTexImage(int target, int level, int bufSize, long img) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetnCompressedTexImage(target, level, bufSize, img);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnCompressedTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Robust version of {@link GL13#glGetCompressedTexImage GetCompressedTexImage}
	 *
	 * @param target the target texture. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_X TEXTURE_CUBE_MAP_NEGATIVE_X}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Y TEXTURE_CUBE_MAP_POSITIVE_Y}</td></tr><tr><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Y TEXTURE_CUBE_MAP_NEGATIVE_Y}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_Z TEXTURE_CUBE_MAP_POSITIVE_Z}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP_NEGATIVE_Z TEXTURE_CUBE_MAP_NEGATIVE_Z}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
	 * @param level  the level-of-detail number. Level 0 is the base image level. Level n is the nth mipmap reduction image.
	 * @param img    a buffer in which to place the returned data
	 */
	public static void glGetnCompressedTexImage(int target, int level, ByteBuffer img) {
		if ( CHECKS ) {
			if ( DEBUG )
				checkBuffer(img, GL11.glGetTexLevelParameteri(target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetnCompressedTexImage(target, level, img.remaining(), memAddress(img));
	}

	// --- [ glGetnUniformfv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the value or values of a uniform of the default uniform block.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void nglGetnUniformfv(int program, int location, int bufSize, long params) {
		long __functionAddress = GL.getCapabilities().glGetnUniformfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the value or values of a uniform of the default uniform block.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformfv(int program, int location, FloatBuffer params) {
		nglGetnUniformfv(program, location, params.remaining(), memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the value or values of a uniform of the default uniform block.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 */
	public static float glGetnUniformf(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetnUniformfv(program, location, 1, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetnUniformdv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Double version of {@link #glGetnUniformfv GetnUniformfv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void nglGetnUniformdv(int program, int location, int bufSize, long params) {
		long __functionAddress = GL.getCapabilities().glGetnUniformdv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Double version of {@link #glGetnUniformfv GetnUniformfv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformdv(int program, int location, DoubleBuffer params) {
		nglGetnUniformdv(program, location, params.remaining(), memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Double version of {@link #glGetnUniformfv GetnUniformfv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 */
	public static double glGetnUniformd(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			DoubleBuffer params = stack.callocDouble(1);
			nglGetnUniformdv(program, location, 1, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetnUniformiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniformi.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Integer version of {@link #glGetnUniformfv GetnUniformfv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void nglGetnUniformiv(int program, int location, int bufSize, long params) {
		long __functionAddress = GL.getCapabilities().glGetnUniformiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniformi.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Integer version of {@link #glGetnUniformfv GetnUniformfv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformiv(int program, int location, FloatBuffer params) {
		nglGetnUniformiv(program, location, params.remaining(), memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniformi.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Integer version of {@link #glGetnUniformfv GetnUniformfv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 */
	public static float glGetnUniformi(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetnUniformiv(program, location, 1, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetnUniformuiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniformui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned version of {@link #glGetnUniformiv GetnUniformiv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param bufSize  the maximum number of bytes to write to {@code params}
	 * @param params   the buffer in which to place the returned data
	 */
	public static void nglGetnUniformuiv(int program, int location, int bufSize, long params) {
		long __functionAddress = GL.getCapabilities().glGetnUniformuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, bufSize, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniformui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned version of {@link #glGetnUniformiv GetnUniformiv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param params   the buffer in which to place the returned data
	 */
	public static void glGetnUniformuiv(int program, int location, FloatBuffer params) {
		nglGetnUniformuiv(program, location, params.remaining(), memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniformui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned version of {@link #glGetnUniformiv GetnUniformiv}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 */
	public static float glGetnUniformui(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetnUniformuiv(program, location, 1, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateTransformFeedbacks.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glCreateTransformFeedbacks CreateTransformFeedbacks}
	 */
	public static void glCreateTransformFeedbacks(int[] ids) {
		long __functionAddress = GL.getCapabilities().glCreateTransformFeedbacks;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetTransformFeedbackiv GetTransformFeedbackiv}
	 */
	public static void glGetTransformFeedbackiv(int xfb, int pname, int[] param) {
		long __functionAddress = GL.getCapabilities().glGetTransformFeedbackiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(param, 1);
		}
		callPV(__functionAddress, xfb, pname, param);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetTransformFeedbacki_v GetTransformFeedbacki_v}
	 */
	public static void glGetTransformFeedbacki_v(int xfb, int pname, int index, int[] param) {
		long __functionAddress = GL.getCapabilities().glGetTransformFeedbacki_v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(param, 1);
		}
		callPV(__functionAddress, xfb, pname, index, param);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetTransformFeedbacki64_v GetTransformFeedbacki64_v}
	 */
	public static void glGetTransformFeedbacki64_v(int xfb, int pname, int index, long[] param) {
		long __functionAddress = GL.getCapabilities().glGetTransformFeedbacki64_v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(param, 1);
		}
		callPV(__functionAddress, xfb, pname, index, param);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glCreateBuffers CreateBuffers}
	 */
	public static void glCreateBuffers(int[] buffers) {
		long __functionAddress = GL.getCapabilities().glCreateBuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffers.length, buffers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glNamedBufferStorage NamedBufferStorage}
	 */
	public static void glNamedBufferStorage(int buffer, short[] data, int flags) {
		long __functionAddress = GL.getCapabilities().glNamedBufferStorage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 1), data, flags);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glNamedBufferStorage NamedBufferStorage}
	 */
	public static void glNamedBufferStorage(int buffer, int[] data, int flags) {
		long __functionAddress = GL.getCapabilities().glNamedBufferStorage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 2), data, flags);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glNamedBufferStorage NamedBufferStorage}
	 */
	public static void glNamedBufferStorage(int buffer, float[] data, int flags) {
		long __functionAddress = GL.getCapabilities().glNamedBufferStorage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 2), data, flags);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferStorage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * double[] version of: {@link #glNamedBufferStorage NamedBufferStorage}
	 */
	public static void glNamedBufferStorage(int buffer, double[] data, int flags) {
		long __functionAddress = GL.getCapabilities().glNamedBufferStorage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 3), data, flags);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glNamedBufferData NamedBufferData}
	 */
	public static void glNamedBufferData(int buffer, short[] data, int usage) {
		long __functionAddress = GL.getCapabilities().glNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 1), data, usage);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glNamedBufferData NamedBufferData}
	 */
	public static void glNamedBufferData(int buffer, int[] data, int usage) {
		long __functionAddress = GL.getCapabilities().glNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 2), data, usage);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glNamedBufferData NamedBufferData}
	 */
	public static void glNamedBufferData(int buffer, float[] data, int usage) {
		long __functionAddress = GL.getCapabilities().glNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 2), data, usage);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * double[] version of: {@link #glNamedBufferData NamedBufferData}
	 */
	public static void glNamedBufferData(int buffer, double[] data, int usage) {
		long __functionAddress = GL.getCapabilities().glNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 3), data, usage);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glNamedBufferSubData NamedBufferSubData}
	 */
	public static void glNamedBufferSubData(int buffer, long offset, short[] data) {
		long __functionAddress = GL.getCapabilities().glNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 1), data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glNamedBufferSubData NamedBufferSubData}
	 */
	public static void glNamedBufferSubData(int buffer, long offset, int[] data) {
		long __functionAddress = GL.getCapabilities().glNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 2), data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glNamedBufferSubData NamedBufferSubData}
	 */
	public static void glNamedBufferSubData(int buffer, long offset, float[] data) {
		long __functionAddress = GL.getCapabilities().glNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 2), data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * double[] version of: {@link #glNamedBufferSubData NamedBufferSubData}
	 */
	public static void glNamedBufferSubData(int buffer, long offset, double[] data) {
		long __functionAddress = GL.getCapabilities().glNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 3), data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glClearNamedBufferData ClearNamedBufferData}
	 */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, short[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, internalformat, format, type, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glClearNamedBufferData ClearNamedBufferData}
	 */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, int[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, internalformat, format, type, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glClearNamedBufferData ClearNamedBufferData}
	 */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, float[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, internalformat, format, type, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData}
	 */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, short[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, internalformat, offset, size, format, type, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData}
	 */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, int[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, internalformat, offset, size, format, type, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData}
	 */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, float[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, internalformat, offset, size, format, type, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetNamedBufferParameteriv GetNamedBufferParameteriv}
	 */
	public static void glGetNamedBufferParameteriv(int buffer, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, buffer, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetNamedBufferParameteri64v GetNamedBufferParameteri64v}
	 */
	public static void glGetNamedBufferParameteri64v(int buffer, int pname, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferParameteri64v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, buffer, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
	 */
	public static void glGetNamedBufferSubData(int buffer, long offset, short[] data) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 1), data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
	 */
	public static void glGetNamedBufferSubData(int buffer, long offset, int[] data) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 2), data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
	 */
	public static void glGetNamedBufferSubData(int buffer, long offset, float[] data) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 2), data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * double[] version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData}
	 */
	public static void glGetNamedBufferSubData(int buffer, long offset, double[] data) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 3), data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateFramebuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glCreateFramebuffers CreateFramebuffers}
	 */
	public static void glCreateFramebuffers(int[] framebuffers) {
		long __functionAddress = GL.getCapabilities().glCreateFramebuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffers.length, framebuffers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferDrawBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glNamedFramebufferDrawBuffers NamedFramebufferDrawBuffers}
	 */
	public static void glNamedFramebufferDrawBuffers(int framebuffer, int[] bufs) {
		long __functionAddress = GL.getCapabilities().glNamedFramebufferDrawBuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, bufs.length, bufs);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateNamedFramebufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glInvalidateNamedFramebufferData InvalidateNamedFramebufferData}
	 */
	public static void glInvalidateNamedFramebufferData(int framebuffer, int[] attachments) {
		long __functionAddress = GL.getCapabilities().glInvalidateNamedFramebufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, attachments.length, attachments);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateNamedFramebufferSubData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glInvalidateNamedFramebufferSubData InvalidateNamedFramebufferSubData}
	 */
	public static void glInvalidateNamedFramebufferSubData(int framebuffer, int[] attachments, int x, int y, int width, int height) {
		long __functionAddress = GL.getCapabilities().glInvalidateNamedFramebufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, attachments.length, attachments, x, y, width, height);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glClearNamedFramebufferiv ClearNamedFramebufferiv}
	 */
	public static void glClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, int[] value) {
		long __functionAddress = GL.getCapabilities().glClearNamedFramebufferiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, framebuffer, buffer, drawbuffer, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glClearNamedFramebufferuiv ClearNamedFramebufferuiv}
	 */
	public static void glClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, int[] value) {
		long __functionAddress = GL.getCapabilities().glClearNamedFramebufferuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 4);
		}
		callPV(__functionAddress, framebuffer, buffer, drawbuffer, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glClearNamedFramebufferfv ClearNamedFramebufferfv}
	 */
	public static void glClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, float[] value) {
		long __functionAddress = GL.getCapabilities().glClearNamedFramebufferfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, framebuffer, buffer, drawbuffer, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedFramebufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetNamedFramebufferParameteriv GetNamedFramebufferParameteriv}
	 */
	public static void glGetNamedFramebufferParameteriv(int framebuffer, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetNamedFramebufferParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, framebuffer, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedFramebufferAttachmentParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetNamedFramebufferAttachmentParameteriv GetNamedFramebufferAttachmentParameteriv}
	 */
	public static void glGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetNamedFramebufferAttachmentParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, framebuffer, attachment, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateRenderbuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glCreateRenderbuffers CreateRenderbuffers}
	 */
	public static void glCreateRenderbuffers(int[] renderbuffers) {
		long __functionAddress = GL.getCapabilities().glCreateRenderbuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, renderbuffers.length, renderbuffers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedRenderbufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetNamedRenderbufferParameteriv GetNamedRenderbufferParameteriv}
	 */
	public static void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetNamedRenderbufferParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, renderbuffer, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateTextures.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glCreateTextures CreateTextures}
	 */
	public static void glCreateTextures(int target, int[] textures) {
		long __functionAddress = GL.getCapabilities().glCreateTextures;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, textures.length, textures);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glTextureSubImage1D TextureSubImage1D}
	 */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, short[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage1D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, width, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glTextureSubImage1D TextureSubImage1D}
	 */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, int[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage1D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, width, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glTextureSubImage1D TextureSubImage1D}
	 */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, float[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage1D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, width, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage1D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * double[] version of: {@link #glTextureSubImage1D TextureSubImage1D}
	 */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, double[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage1D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, width, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glTextureSubImage2D TextureSubImage2D}
	 */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage2D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glTextureSubImage2D TextureSubImage2D}
	 */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage2D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glTextureSubImage2D TextureSubImage2D}
	 */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage2D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage2D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * double[] version of: {@link #glTextureSubImage2D TextureSubImage2D}
	 */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage2D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glTextureSubImage3D TextureSubImage3D}
	 */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glTextureSubImage3D TextureSubImage3D}
	 */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glTextureSubImage3D TextureSubImage3D}
	 */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureSubImage3D.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * double[] version of: {@link #glTextureSubImage3D TextureSubImage3D}
	 */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glTextureParameterfv TextureParameterfv}
	 */
	public static void glTextureParameterfv(int texture, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glTextureParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glTextureParameterIiv TextureParameterIiv}
	 */
	public static void glTextureParameterIiv(int texture, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glTextureParameterIiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glTextureParameterIuiv TextureParameterIuiv}
	 */
	public static void glTextureParameterIuiv(int texture, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glTextureParameterIuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glTextureParameteriv TextureParameteriv}
	 */
	public static void glTextureParameteriv(int texture, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glTextureParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glGetTextureImage GetTextureImage}
	 */
	public static void glGetTextureImage(int texture, int level, int format, int type, short[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, format, type, pixels.length << 1, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glGetTextureImage GetTextureImage}
	 */
	public static void glGetTextureImage(int texture, int level, int format, int type, int[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, format, type, pixels.length << 2, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glGetTextureImage GetTextureImage}
	 */
	public static void glGetTextureImage(int texture, int level, int format, int type, float[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, format, type, pixels.length << 2, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * double[] version of: {@link #glGetTextureImage GetTextureImage}
	 */
	public static void glGetTextureImage(int texture, int level, int format, int type, double[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, format, type, pixels.length << 3, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureLevelParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetTextureLevelParameterfv GetTextureLevelParameterfv}
	 */
	public static void glGetTextureLevelParameterfv(int texture, int level, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetTextureLevelParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, level, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureLevelParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetTextureLevelParameteriv GetTextureLevelParameteriv}
	 */
	public static void glGetTextureLevelParameteriv(int texture, int level, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetTextureLevelParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, level, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetTextureParameterfv GetTextureParameterfv}
	 */
	public static void glGetTextureParameterfv(int texture, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetTextureParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetTextureParameterIiv GetTextureParameterIiv}
	 */
	public static void glGetTextureParameterIiv(int texture, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetTextureParameterIiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetTextureParameterIuiv GetTextureParameterIuiv}
	 */
	public static void glGetTextureParameterIuiv(int texture, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetTextureParameterIuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetTextureParameteriv GetTextureParameteriv}
	 */
	public static void glGetTextureParameteriv(int texture, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetTextureParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateVertexArrays.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glCreateVertexArrays CreateVertexArrays}
	 */
	public static void glCreateVertexArrays(int[] arrays) {
		long __functionAddress = GL.getCapabilities().glCreateVertexArrays;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, arrays.length, arrays);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayVertexBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glVertexArrayVertexBuffers VertexArrayVertexBuffers}
	 */
	public static void glVertexArrayVertexBuffers(int vaobj, int first, int[] buffers, PointerBuffer offsets, int[] strides) {
		long __functionAddress = GL.getCapabilities().glVertexArrayVertexBuffers;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( offsets != null ) checkBuffer(offsets, buffers.length);
			if ( strides != null ) checkBuffer(strides, buffers.length);
		}
		callPPPV(__functionAddress, vaobj, first, buffers == null ? 0 : buffers.length, buffers, memAddressSafe(offsets), strides);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArray.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetVertexArrayiv GetVertexArrayiv}
	 */
	public static void glGetVertexArrayiv(int vaobj, int pname, int[] param) {
		long __functionAddress = GL.getCapabilities().glGetVertexArrayiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(param, 1);
		}
		callPV(__functionAddress, vaobj, pname, param);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArrayIndexed.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetVertexArrayIndexediv GetVertexArrayIndexediv}
	 */
	public static void glGetVertexArrayIndexediv(int vaobj, int index, int pname, int[] param) {
		long __functionAddress = GL.getCapabilities().glGetVertexArrayIndexediv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(param, 1);
		}
		callPV(__functionAddress, vaobj, index, pname, param);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArrayIndexed64i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetVertexArrayIndexed64iv GetVertexArrayIndexed64iv}
	 */
	public static void glGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long[] param) {
		long __functionAddress = GL.getCapabilities().glGetVertexArrayIndexed64iv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(param, 1);
		}
		callPV(__functionAddress, vaobj, index, pname, param);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glCreateSamplers CreateSamplers}
	 */
	public static void glCreateSamplers(int[] samplers) {
		long __functionAddress = GL.getCapabilities().glCreateSamplers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, samplers.length, samplers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateProgramPipelines.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glCreateProgramPipelines CreateProgramPipelines}
	 */
	public static void glCreateProgramPipelines(int[] pipelines) {
		long __functionAddress = GL.getCapabilities().glCreateProgramPipelines;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pipelines.length, pipelines);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateQueries.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glCreateQueries CreateQueries}
	 */
	public static void glCreateQueries(int target, int[] ids) {
		long __functionAddress = GL.getCapabilities().glCreateQueries;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, ids.length, ids);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glGetTextureSubImage GetTextureSubImage}
	 */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureSubImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length << 1, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glGetTextureSubImage GetTextureSubImage}
	 */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureSubImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length << 2, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glGetTextureSubImage GetTextureSubImage}
	 */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureSubImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length << 2, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * double[] version of: {@link #glGetTextureSubImage GetTextureSubImage}
	 */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureSubImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length << 3, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
	 */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, short[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetCompressedTextureSubImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.length << 1, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
	 */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetCompressedTextureSubImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.length << 2, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
	 */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, float[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetCompressedTextureSubImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.length << 2, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetCompressedTextureSubImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * double[] version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage}
	 */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, double[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetCompressedTextureSubImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.length << 3, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetnMapdv GetnMapdv}
	 */
	public static void glGetnMapdv(int target, int query, double[] data) {
		long __functionAddress = GL.getCapabilities().glGetnMapdv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, query, data.length, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetnMapfv GetnMapfv}
	 */
	public static void glGetnMapfv(int target, int query, float[] data) {
		long __functionAddress = GL.getCapabilities().glGetnMapfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, query, data.length, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetnMapiv GetnMapiv}
	 */
	public static void glGetnMapiv(int target, int query, int[] data) {
		long __functionAddress = GL.getCapabilities().glGetnMapiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, query, data.length, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnPixelMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetnPixelMapfv GetnPixelMapfv}
	 */
	public static void glGetnPixelMapfv(int map, float[] data) {
		long __functionAddress = GL.getCapabilities().glGetnPixelMapfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, map, data.length, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnPixelMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetnPixelMapuiv GetnPixelMapuiv}
	 */
	public static void glGetnPixelMapuiv(int map, int[] data) {
		long __functionAddress = GL.getCapabilities().glGetnPixelMapuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, map, data.length, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnPixelMap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetnPixelMapusv GetnPixelMapusv}
	 */
	public static void glGetnPixelMapusv(int map, short[] data) {
		long __functionAddress = GL.getCapabilities().glGetnPixelMapusv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, map, data.length, data);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glGetnTexImage GetnTexImage}
	 */
	public static void glGetnTexImage(int tex, int level, int format, int type, short[] img) {
		long __functionAddress = GL.getCapabilities().glGetnTexImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, tex, level, format, type, img.length << 1, img);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glGetnTexImage GetnTexImage}
	 */
	public static void glGetnTexImage(int tex, int level, int format, int type, int[] img) {
		long __functionAddress = GL.getCapabilities().glGetnTexImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, tex, level, format, type, img.length << 2, img);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glGetnTexImage GetnTexImage}
	 */
	public static void glGetnTexImage(int tex, int level, int format, int type, float[] img) {
		long __functionAddress = GL.getCapabilities().glGetnTexImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, tex, level, format, type, img.length << 2, img);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnTexImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * double[] version of: {@link #glGetnTexImage GetnTexImage}
	 */
	public static void glGetnTexImage(int tex, int level, int format, int type, double[] img) {
		long __functionAddress = GL.getCapabilities().glGetnTexImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, tex, level, format, type, img.length << 3, img);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glReadnPixel.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glReadnPixels ReadnPixels}
	 */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, short[] pixels) {
		long __functionAddress = GL.getCapabilities().glReadnPixels;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, x, y, width, height, format, type, pixels.length << 1, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glReadnPixels.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glReadnPixels ReadnPixels}
	 */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, int[] pixels) {
		long __functionAddress = GL.getCapabilities().glReadnPixels;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, x, y, width, height, format, type, pixels.length << 2, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glReadnPixels.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glReadnPixels ReadnPixels}
	 */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, float[] pixels) {
		long __functionAddress = GL.getCapabilities().glReadnPixels;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, x, y, width, height, format, type, pixels.length << 2, pixels);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnColorTable.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * short[] version of: {@link #glGetnColorTable GetnColorTable}
	 */
	public static void glGetnColorTable(int target, int format, int type, short[] table) {
		long __functionAddress = GL.getCapabilities().glGetnColorTable;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, format, type, table.length << 1, table);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnColorTable.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * int[] version of: {@link #glGetnColorTable GetnColorTable}
	 */
	public static void glGetnColorTable(int target, int format, int type, int[] table) {
		long __functionAddress = GL.getCapabilities().glGetnColorTable;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, format, type, table.length << 2, table);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnColorTable.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * float[] version of: {@link #glGetnColorTable GetnColorTable}
	 */
	public static void glGetnColorTable(int target, int format, int type, float[] table) {
		long __functionAddress = GL.getCapabilities().glGetnColorTable;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, target, format, type, table.length << 2, table);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetnUniformfv GetnUniformfv}
	 */
	public static void glGetnUniformfv(int program, int location, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetnUniformfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params.length, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniform.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetnUniformdv GetnUniformdv}
	 */
	public static void glGetnUniformdv(int program, int location, double[] params) {
		long __functionAddress = GL.getCapabilities().glGetnUniformdv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params.length, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniformi.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetnUniformiv GetnUniformiv}
	 */
	public static void glGetnUniformiv(int program, int location, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetnUniformiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params.length, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetnUniformui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetnUniformuiv GetnUniformuiv}
	 */
	public static void glGetnUniformuiv(int program, int location, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetnUniformuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params.length, params);
	}

}