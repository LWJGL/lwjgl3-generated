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
 * The core OpenGL 4.5 functionality. OpenGL 4.5 implementations support revision 4.50 of the OpenGL Shading Language.
 * 
 * <p>Extensions promoted to core in this release:
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
 * </ul></p>
 */
public final class GL45 {

	/** Accepted by the {@code origin} parameter of {@link #glClipControl ClipControl}. */
	public static final int
		GL_LOWER_LEFT = 0x8CA1,
		GL_UPPER_LEFT = 0x8CA2;

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

	/** Accepted by the {@code pname} parameter of GetIntegeri_v. */
	public static final int GL_TEXTURE_BINDING = 0x82EB;

	/** Accepted by the {@code pname} parameter of GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v. */
	public static final int GL_CONTEXT_RELEASE_BEHAVIOR = 0x82FB;

	/** Returned in {@code data} by GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v when {@code pname} is {@link #GL_CONTEXT_RELEASE_BEHAVIOR CONTEXT_RELEASE_BEHAVIOR}. */
	public static final int GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x82FC;

	/** Returned by {@link #glGetGraphicsResetStatus GetGraphicsResetStatus}. */
	public static final int
		GL_NO_ERROR               = 0x0,
		GL_GUILTY_CONTEXT_RESET   = 0x8253,
		GL_INNOCENT_CONTEXT_RESET = 0x8254,
		GL_UNKNOWN_CONTEXT_RESET  = 0x8255;

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int
		GL_CONTEXT_ROBUST_ACCESS       = 0x90F3,
		GL_RESET_NOTIFICATION_STRATEGY = 0x8256;

	/** Returned by GetIntegerv and related simple queries when {@code value} is {@link #GL_RESET_NOTIFICATION_STRATEGY RESET_NOTIFICATION_STRATEGY}. */
	public static final int
		GL_LOSE_CONTEXT_ON_RESET = 0x8252,
		GL_NO_RESET_NOTIFICATION = 0x8261;

	/** Returned by {@link GL11#glGetError GetError}. */
	public static final int GL_CONTEXT_LOST = 0x507;

	/** Function address. */
	@JavadocExclude
	public final long
		ClipControl,
		CreateTransformFeedbacks,
		TransformFeedbackBufferBase,
		TransformFeedbackBufferRange,
		GetTransformFeedbackiv,
		GetTransformFeedbacki_v,
		GetTransformFeedbacki64_v,
		CreateBuffers,
		NamedBufferStorage,
		NamedBufferData,
		NamedBufferSubData,
		CopyNamedBufferSubData,
		ClearNamedBufferData,
		ClearNamedBufferSubData,
		MapNamedBuffer,
		MapNamedBufferRange,
		UnmapNamedBuffer,
		FlushMappedNamedBufferRange,
		GetNamedBufferParameteriv,
		GetNamedBufferParameteri64v,
		GetNamedBufferPointerv,
		GetNamedBufferSubData,
		CreateFramebuffers,
		NamedFramebufferRenderbuffer,
		NamedFramebufferParameteri,
		NamedFramebufferTexture,
		NamedFramebufferTextureLayer,
		NamedFramebufferDrawBuffer,
		NamedFramebufferDrawBuffers,
		NamedFramebufferReadBuffer,
		InvalidateNamedFramebufferData,
		InvalidateNamedFramebufferSubData,
		ClearNamedFramebufferiv,
		ClearNamedFramebufferuiv,
		ClearNamedFramebufferfv,
		ClearNamedFramebufferfi,
		BlitNamedFramebuffer,
		CheckNamedFramebufferStatus,
		GetNamedFramebufferParameteriv,
		GetNamedFramebufferAttachmentParameteriv,
		CreateRenderbuffers,
		NamedRenderbufferStorage,
		NamedRenderbufferStorageMultisample,
		GetNamedRenderbufferParameteriv,
		CreateTextures,
		TextureBuffer,
		TextureBufferRange,
		TextureStorage1D,
		TextureStorage2D,
		TextureStorage3D,
		TextureStorage2DMultisample,
		TextureStorage3DMultisample,
		TextureSubImage1D,
		TextureSubImage2D,
		TextureSubImage3D,
		CompressedTextureSubImage1D,
		CompressedTextureSubImage2D,
		CompressedTextureSubImage3D,
		CopyTextureSubImage1D,
		CopyTextureSubImage2D,
		CopyTextureSubImage3D,
		TextureParameterf,
		TextureParameterfv,
		TextureParameteri,
		TextureParameterIiv,
		TextureParameterIuiv,
		TextureParameteriv,
		GenerateTextureMipmap,
		BindTextureUnit,
		GetTextureImage,
		GetCompressedTextureImage,
		GetTextureLevelParameterfv,
		GetTextureLevelParameteriv,
		GetTextureParameterfv,
		GetTextureParameterIiv,
		GetTextureParameterIuiv,
		GetTextureParameteriv,
		CreateVertexArrays,
		DisableVertexArrayAttrib,
		EnableVertexArrayAttrib,
		VertexArrayElementBuffer,
		VertexArrayVertexBuffer,
		VertexArrayVertexBuffers,
		VertexArrayAttribFormat,
		VertexArrayAttribIFormat,
		VertexArrayAttribLFormat,
		VertexArrayAttribBinding,
		VertexArrayBindingDivisor,
		GetVertexArrayiv,
		GetVertexArrayIndexediv,
		GetVertexArrayIndexed64iv,
		CreateSamplers,
		CreateProgramPipelines,
		CreateQueries,
		MemoryBarrierByRegion,
		GetTextureSubImage,
		GetCompressedTextureSubImage,
		TextureBarrier,
		GetGraphicsResetStatus,
		ReadnPixels,
		GetnUniformfv,
		GetnUniformiv,
		GetnUniformuiv;

	@JavadocExclude
	public GL45(FunctionProvider provider) {
		ClipControl = provider.getFunctionAddress("glClipControl");
		CreateTransformFeedbacks = provider.getFunctionAddress("glCreateTransformFeedbacks");
		TransformFeedbackBufferBase = provider.getFunctionAddress("glTransformFeedbackBufferBase");
		TransformFeedbackBufferRange = provider.getFunctionAddress("glTransformFeedbackBufferRange");
		GetTransformFeedbackiv = provider.getFunctionAddress("glGetTransformFeedbackiv");
		GetTransformFeedbacki_v = provider.getFunctionAddress("glGetTransformFeedbacki_v");
		GetTransformFeedbacki64_v = provider.getFunctionAddress("glGetTransformFeedbacki64_v");
		CreateBuffers = provider.getFunctionAddress("glCreateBuffers");
		NamedBufferStorage = provider.getFunctionAddress("glNamedBufferStorage");
		NamedBufferData = provider.getFunctionAddress("glNamedBufferData");
		NamedBufferSubData = provider.getFunctionAddress("glNamedBufferSubData");
		CopyNamedBufferSubData = provider.getFunctionAddress("glCopyNamedBufferSubData");
		ClearNamedBufferData = provider.getFunctionAddress("glClearNamedBufferData");
		ClearNamedBufferSubData = provider.getFunctionAddress("glClearNamedBufferSubData");
		MapNamedBuffer = provider.getFunctionAddress("glMapNamedBuffer");
		MapNamedBufferRange = provider.getFunctionAddress("glMapNamedBufferRange");
		UnmapNamedBuffer = provider.getFunctionAddress("glUnmapNamedBuffer");
		FlushMappedNamedBufferRange = provider.getFunctionAddress("glFlushMappedNamedBufferRange");
		GetNamedBufferParameteriv = provider.getFunctionAddress("glGetNamedBufferParameteriv");
		GetNamedBufferParameteri64v = provider.getFunctionAddress("glGetNamedBufferParameteri64v");
		GetNamedBufferPointerv = provider.getFunctionAddress("glGetNamedBufferPointerv");
		GetNamedBufferSubData = provider.getFunctionAddress("glGetNamedBufferSubData");
		CreateFramebuffers = provider.getFunctionAddress("glCreateFramebuffers");
		NamedFramebufferRenderbuffer = provider.getFunctionAddress("glNamedFramebufferRenderbuffer");
		NamedFramebufferParameteri = provider.getFunctionAddress("glNamedFramebufferParameteri");
		NamedFramebufferTexture = provider.getFunctionAddress("glNamedFramebufferTexture");
		NamedFramebufferTextureLayer = provider.getFunctionAddress("glNamedFramebufferTextureLayer");
		NamedFramebufferDrawBuffer = provider.getFunctionAddress("glNamedFramebufferDrawBuffer");
		NamedFramebufferDrawBuffers = provider.getFunctionAddress("glNamedFramebufferDrawBuffers");
		NamedFramebufferReadBuffer = provider.getFunctionAddress("glNamedFramebufferReadBuffer");
		InvalidateNamedFramebufferData = provider.getFunctionAddress("glInvalidateNamedFramebufferData");
		InvalidateNamedFramebufferSubData = provider.getFunctionAddress("glInvalidateNamedFramebufferSubData");
		ClearNamedFramebufferiv = provider.getFunctionAddress("glClearNamedFramebufferiv");
		ClearNamedFramebufferuiv = provider.getFunctionAddress("glClearNamedFramebufferuiv");
		ClearNamedFramebufferfv = provider.getFunctionAddress("glClearNamedFramebufferfv");
		ClearNamedFramebufferfi = provider.getFunctionAddress("glClearNamedFramebufferfi");
		BlitNamedFramebuffer = provider.getFunctionAddress("glBlitNamedFramebuffer");
		CheckNamedFramebufferStatus = provider.getFunctionAddress("glCheckNamedFramebufferStatus");
		GetNamedFramebufferParameteriv = provider.getFunctionAddress("glGetNamedFramebufferParameteriv");
		GetNamedFramebufferAttachmentParameteriv = provider.getFunctionAddress("glGetNamedFramebufferAttachmentParameteriv");
		CreateRenderbuffers = provider.getFunctionAddress("glCreateRenderbuffers");
		NamedRenderbufferStorage = provider.getFunctionAddress("glNamedRenderbufferStorage");
		NamedRenderbufferStorageMultisample = provider.getFunctionAddress("glNamedRenderbufferStorageMultisample");
		GetNamedRenderbufferParameteriv = provider.getFunctionAddress("glGetNamedRenderbufferParameteriv");
		CreateTextures = provider.getFunctionAddress("glCreateTextures");
		TextureBuffer = provider.getFunctionAddress("glTextureBuffer");
		TextureBufferRange = provider.getFunctionAddress("glTextureBufferRange");
		TextureStorage1D = provider.getFunctionAddress("glTextureStorage1D");
		TextureStorage2D = provider.getFunctionAddress("glTextureStorage2D");
		TextureStorage3D = provider.getFunctionAddress("glTextureStorage3D");
		TextureStorage2DMultisample = provider.getFunctionAddress("glTextureStorage2DMultisample");
		TextureStorage3DMultisample = provider.getFunctionAddress("glTextureStorage3DMultisample");
		TextureSubImage1D = provider.getFunctionAddress("glTextureSubImage1D");
		TextureSubImage2D = provider.getFunctionAddress("glTextureSubImage2D");
		TextureSubImage3D = provider.getFunctionAddress("glTextureSubImage3D");
		CompressedTextureSubImage1D = provider.getFunctionAddress("glCompressedTextureSubImage1D");
		CompressedTextureSubImage2D = provider.getFunctionAddress("glCompressedTextureSubImage2D");
		CompressedTextureSubImage3D = provider.getFunctionAddress("glCompressedTextureSubImage3D");
		CopyTextureSubImage1D = provider.getFunctionAddress("glCopyTextureSubImage1D");
		CopyTextureSubImage2D = provider.getFunctionAddress("glCopyTextureSubImage2D");
		CopyTextureSubImage3D = provider.getFunctionAddress("glCopyTextureSubImage3D");
		TextureParameterf = provider.getFunctionAddress("glTextureParameterf");
		TextureParameterfv = provider.getFunctionAddress("glTextureParameterfv");
		TextureParameteri = provider.getFunctionAddress("glTextureParameteri");
		TextureParameterIiv = provider.getFunctionAddress("glTextureParameterIiv");
		TextureParameterIuiv = provider.getFunctionAddress("glTextureParameterIuiv");
		TextureParameteriv = provider.getFunctionAddress("glTextureParameteriv");
		GenerateTextureMipmap = provider.getFunctionAddress("glGenerateTextureMipmap");
		BindTextureUnit = provider.getFunctionAddress("glBindTextureUnit");
		GetTextureImage = provider.getFunctionAddress("glGetTextureImage");
		GetCompressedTextureImage = provider.getFunctionAddress("glGetCompressedTextureImage");
		GetTextureLevelParameterfv = provider.getFunctionAddress("glGetTextureLevelParameterfv");
		GetTextureLevelParameteriv = provider.getFunctionAddress("glGetTextureLevelParameteriv");
		GetTextureParameterfv = provider.getFunctionAddress("glGetTextureParameterfv");
		GetTextureParameterIiv = provider.getFunctionAddress("glGetTextureParameterIiv");
		GetTextureParameterIuiv = provider.getFunctionAddress("glGetTextureParameterIuiv");
		GetTextureParameteriv = provider.getFunctionAddress("glGetTextureParameteriv");
		CreateVertexArrays = provider.getFunctionAddress("glCreateVertexArrays");
		DisableVertexArrayAttrib = provider.getFunctionAddress("glDisableVertexArrayAttrib");
		EnableVertexArrayAttrib = provider.getFunctionAddress("glEnableVertexArrayAttrib");
		VertexArrayElementBuffer = provider.getFunctionAddress("glVertexArrayElementBuffer");
		VertexArrayVertexBuffer = provider.getFunctionAddress("glVertexArrayVertexBuffer");
		VertexArrayVertexBuffers = provider.getFunctionAddress("glVertexArrayVertexBuffers");
		VertexArrayAttribFormat = provider.getFunctionAddress("glVertexArrayAttribFormat");
		VertexArrayAttribIFormat = provider.getFunctionAddress("glVertexArrayAttribIFormat");
		VertexArrayAttribLFormat = provider.getFunctionAddress("glVertexArrayAttribLFormat");
		VertexArrayAttribBinding = provider.getFunctionAddress("glVertexArrayAttribBinding");
		VertexArrayBindingDivisor = provider.getFunctionAddress("glVertexArrayBindingDivisor");
		GetVertexArrayiv = provider.getFunctionAddress("glGetVertexArrayiv");
		GetVertexArrayIndexediv = provider.getFunctionAddress("glGetVertexArrayIndexediv");
		GetVertexArrayIndexed64iv = provider.getFunctionAddress("glGetVertexArrayIndexed64iv");
		CreateSamplers = provider.getFunctionAddress("glCreateSamplers");
		CreateProgramPipelines = provider.getFunctionAddress("glCreateProgramPipelines");
		CreateQueries = provider.getFunctionAddress("glCreateQueries");
		MemoryBarrierByRegion = provider.getFunctionAddress("glMemoryBarrierByRegion");
		GetTextureSubImage = provider.getFunctionAddress("glGetTextureSubImage");
		GetCompressedTextureSubImage = provider.getFunctionAddress("glGetCompressedTextureSubImage");
		TextureBarrier = provider.getFunctionAddress("glTextureBarrier");
		GetGraphicsResetStatus = provider.getFunctionAddress("glGetGraphicsResetStatus");
		ReadnPixels = provider.getFunctionAddress("glReadnPixels");
		GetnUniformfv = provider.getFunctionAddress("glGetnUniformfv");
		GetnUniformiv = provider.getFunctionAddress("glGetnUniformiv");
		GetnUniformuiv = provider.getFunctionAddress("glGetnUniformuiv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL45} instance for the current context. */
	public static GL45 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GL45);
	}

	static GL45 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("OpenGL45") ) return null;

		GL45 funcs = new GL45(provider);

		boolean supported = checkFunctions(
			funcs.ClipControl, funcs.CreateTransformFeedbacks, funcs.TransformFeedbackBufferBase, funcs.TransformFeedbackBufferRange, 
			funcs.GetTransformFeedbackiv, funcs.GetTransformFeedbacki_v, funcs.GetTransformFeedbacki64_v, funcs.CreateBuffers, funcs.NamedBufferStorage, 
			funcs.NamedBufferData, funcs.NamedBufferSubData, funcs.CopyNamedBufferSubData, funcs.ClearNamedBufferData, funcs.ClearNamedBufferSubData, 
			funcs.MapNamedBuffer, funcs.MapNamedBufferRange, funcs.UnmapNamedBuffer, funcs.FlushMappedNamedBufferRange, funcs.GetNamedBufferParameteriv, 
			funcs.GetNamedBufferParameteri64v, funcs.GetNamedBufferPointerv, funcs.GetNamedBufferSubData, funcs.CreateFramebuffers, 
			funcs.NamedFramebufferRenderbuffer, funcs.NamedFramebufferParameteri, funcs.NamedFramebufferTexture, funcs.NamedFramebufferTextureLayer, 
			funcs.NamedFramebufferDrawBuffer, funcs.NamedFramebufferDrawBuffers, funcs.NamedFramebufferReadBuffer, funcs.InvalidateNamedFramebufferData, 
			funcs.InvalidateNamedFramebufferSubData, funcs.ClearNamedFramebufferiv, funcs.ClearNamedFramebufferuiv, funcs.ClearNamedFramebufferfv, 
			funcs.ClearNamedFramebufferfi, funcs.BlitNamedFramebuffer, funcs.CheckNamedFramebufferStatus, funcs.GetNamedFramebufferParameteriv, 
			funcs.GetNamedFramebufferAttachmentParameteriv, funcs.CreateRenderbuffers, funcs.NamedRenderbufferStorage, 
			funcs.NamedRenderbufferStorageMultisample, funcs.GetNamedRenderbufferParameteriv, funcs.CreateTextures, funcs.TextureBuffer, 
			funcs.TextureBufferRange, funcs.TextureStorage1D, funcs.TextureStorage2D, funcs.TextureStorage3D, funcs.TextureStorage2DMultisample, 
			funcs.TextureStorage3DMultisample, funcs.TextureSubImage1D, funcs.TextureSubImage2D, funcs.TextureSubImage3D, funcs.CompressedTextureSubImage1D, 
			funcs.CompressedTextureSubImage2D, funcs.CompressedTextureSubImage3D, funcs.CopyTextureSubImage1D, funcs.CopyTextureSubImage2D, 
			funcs.CopyTextureSubImage3D, funcs.TextureParameterf, funcs.TextureParameterfv, funcs.TextureParameteri, funcs.TextureParameterIiv, 
			funcs.TextureParameterIuiv, funcs.TextureParameteriv, funcs.GenerateTextureMipmap, funcs.BindTextureUnit, funcs.GetTextureImage, 
			funcs.GetCompressedTextureImage, funcs.GetTextureLevelParameterfv, funcs.GetTextureLevelParameteriv, funcs.GetTextureParameterfv, 
			funcs.GetTextureParameterIiv, funcs.GetTextureParameterIuiv, funcs.GetTextureParameteriv, funcs.CreateVertexArrays, funcs.DisableVertexArrayAttrib, 
			funcs.EnableVertexArrayAttrib, funcs.VertexArrayElementBuffer, funcs.VertexArrayVertexBuffer, funcs.VertexArrayVertexBuffers, 
			funcs.VertexArrayAttribFormat, funcs.VertexArrayAttribIFormat, funcs.VertexArrayAttribLFormat, funcs.VertexArrayAttribBinding, 
			funcs.VertexArrayBindingDivisor, funcs.GetVertexArrayiv, funcs.GetVertexArrayIndexediv, funcs.GetVertexArrayIndexed64iv, funcs.CreateSamplers, 
			funcs.CreateProgramPipelines, funcs.CreateQueries, funcs.MemoryBarrierByRegion, funcs.GetTextureSubImage, funcs.GetCompressedTextureSubImage, 
			funcs.TextureBarrier, funcs.GetGraphicsResetStatus, funcs.ReadnPixels, funcs.GetnUniformfv, funcs.GetnUniformiv, funcs.GetnUniformuiv
		);

		return GL.checkExtension("OpenGL45", funcs, supported);
	}

	// --- [ glClipControl ] ---

	/** JNI method for {@link #glClipControl ClipControl} */
	@JavadocExclude
	public static native void nglClipControl(int origin, int depth, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClipControl.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Controls the clipping volume behavior.
	 * 
	 * <p>These parameters update the clip control origin and depth mode respectively. The initial value of the clip control origin is {@link #GL_LOWER_LEFT LOWER_LEFT} and
	 * the initial value of the depth mode is {@link #GL_NEGATIVE_ONE_TO_ONE NEGATIVE_ONE_TO_ONE}.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if ClipControl is executed between the execution of {@link GL11#glBegin Begin} and the corresponding
	 * execution of {@link GL11#glEnd End}.</p>
	 *
	 * @param origin the clip origin. One of:<br>{@link #GL_LOWER_LEFT LOWER_LEFT}, {@link #GL_UPPER_LEFT UPPER_LEFT}
	 * @param depth  the clip depth mode. One of:<br>{@link #GL_NEGATIVE_ONE_TO_ONE NEGATIVE_ONE_TO_ONE}, {@link #GL_ZERO_TO_ONE ZERO_TO_ONE}
	 */
	public static void glClipControl(int origin, int depth) {
		long __functionAddress = getInstance().ClipControl;
		nglClipControl(origin, depth, __functionAddress);
	}

	// --- [ glCreateTransformFeedbacks ] ---

	/** JNI method for {@link #glCreateTransformFeedbacks CreateTransformFeedbacks} */
	@JavadocExclude
	public static native void nglCreateTransformFeedbacks(int n, long ids, long __functionAddress);

	/** Unsafe version of {@link #glCreateTransformFeedbacks CreateTransformFeedbacks} */
	@JavadocExclude
	public static void nglCreateTransformFeedbacks(int n, long ids) {
		long __functionAddress = getInstance().CreateTransformFeedbacks;
		nglCreateTransformFeedbacks(n, ids, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateTransformFeedbacks.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector.
	 *
	 * @param n   the number of transform feedback object names to create
	 * @param ids the buffer in which to return the names
	 */
	public static void glCreateTransformFeedbacks(int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglCreateTransformFeedbacks(n, memAddress(ids));
	}

	/** Alternative version of: {@link #glCreateTransformFeedbacks CreateTransformFeedbacks} */
	public static void glCreateTransformFeedbacks(IntBuffer ids) {
		nglCreateTransformFeedbacks(ids.remaining(), memAddress(ids));
	}

	/** Single return value version of: {@link #glCreateTransformFeedbacks CreateTransformFeedbacks} */
	public static int glCreateTransformFeedbacks() {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam();
		nglCreateTransformFeedbacks(1, __buffer.address(ids));
		return __buffer.intValue(ids);
	}

	// --- [ glTransformFeedbackBufferBase ] ---

	/** JNI method for {@link #glTransformFeedbackBufferBase TransformFeedbackBufferBase} */
	@JavadocExclude
	public static native void nglTransformFeedbackBufferBase(int xfb, int index, int buffer, long __functionAddress);

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
		long __functionAddress = getInstance().TransformFeedbackBufferBase;
		nglTransformFeedbackBufferBase(xfb, index, buffer, __functionAddress);
	}

	// --- [ glTransformFeedbackBufferRange ] ---

	/** JNI method for {@link #glTransformFeedbackBufferRange TransformFeedbackBufferRange} */
	@JavadocExclude
	public static native void nglTransformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size, long __functionAddress);

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
		long __functionAddress = getInstance().TransformFeedbackBufferRange;
		nglTransformFeedbackBufferRange(xfb, index, buffer, offset, size, __functionAddress);
	}

	// --- [ glGetTransformFeedbackiv ] ---

	/** JNI method for {@link #glGetTransformFeedbackiv GetTransformFeedbackiv} */
	@JavadocExclude
	public static native void nglGetTransformFeedbackiv(int xfb, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glGetTransformFeedbackiv GetTransformFeedbackiv} */
	@JavadocExclude
	public static void nglGetTransformFeedbackiv(int xfb, int pname, long param) {
		long __functionAddress = getInstance().GetTransformFeedbackiv;
		nglGetTransformFeedbackiv(xfb, pname, param, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about a transform feedback object.
	 *
	 * @param xfb   zero or the name of an existing transform feedback object
	 * @param pname the parameter to query. One of:<br>{@link GL42#GL_TRANSFORM_FEEDBACK_PAUSED TRANSFORM_FEEDBACK_PAUSED}, {@link GL42#GL_TRANSFORM_FEEDBACK_ACTIVE TRANSFORM_FEEDBACK_ACTIVE}
	 * @param param the buffer in which to return the parameter value
	 */
	public static void glGetTransformFeedbackiv(int xfb, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << 2);
		nglGetTransformFeedbackiv(xfb, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glGetTransformFeedbackiv GetTransformFeedbackiv} */
	public static void glGetTransformFeedbackiv(int xfb, int pname, IntBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglGetTransformFeedbackiv(xfb, pname, memAddress(param));
	}

	/** Single return value version of: {@link #glGetTransformFeedbackiv GetTransformFeedbackiv} */
	public static int glGetTransformFeedbacki(int xfb, int pname) {
		APIBuffer __buffer = apiBuffer();
		int param = __buffer.intParam();
		nglGetTransformFeedbackiv(xfb, pname, __buffer.address(param));
		return __buffer.intValue(param);
	}

	// --- [ glGetTransformFeedbacki_v ] ---

	/** JNI method for {@link #glGetTransformFeedbacki_v GetTransformFeedbacki_v} */
	@JavadocExclude
	public static native void nglGetTransformFeedbacki_v(int xfb, int pname, int index, long param, long __functionAddress);

	/** Unsafe version of {@link #glGetTransformFeedbacki_v GetTransformFeedbacki_v} */
	@JavadocExclude
	public static void nglGetTransformFeedbacki_v(int xfb, int pname, int index, long param) {
		long __functionAddress = getInstance().GetTransformFeedbacki_v;
		nglGetTransformFeedbacki_v(xfb, pname, index, param, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about a transform feedback object.
	 *
	 * @param xfb   zero or the name of an existing transform feedback object
	 * @param pname the parameter to query. Must be:<br>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_BINDING TRANSFORM_FEEDBACK_BUFFER_BINDING}
	 * @param index the transform feedback stream index
	 * @param param the buffer in which to return the parameter value
	 */
	public static void glGetTransformFeedbacki_v(int xfb, int pname, int index, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << 2);
		nglGetTransformFeedbacki_v(xfb, pname, index, memAddress(param));
	}

	/** Alternative version of: {@link #glGetTransformFeedbacki_v GetTransformFeedbacki_v} */
	public static void glGetTransformFeedbacki_v(int xfb, int pname, int index, IntBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglGetTransformFeedbacki_v(xfb, pname, index, memAddress(param));
	}

	/** Single return value version of: {@link #glGetTransformFeedbacki_v GetTransformFeedbacki_v} */
	public static int glGetTransformFeedbacki(int xfb, int pname, int index) {
		APIBuffer __buffer = apiBuffer();
		int param = __buffer.intParam();
		nglGetTransformFeedbacki_v(xfb, pname, index, __buffer.address(param));
		return __buffer.intValue(param);
	}

	// --- [ glGetTransformFeedbacki64_v ] ---

	/** JNI method for {@link #glGetTransformFeedbacki64_v GetTransformFeedbacki64_v} */
	@JavadocExclude
	public static native void nglGetTransformFeedbacki64_v(int xfb, int pname, int index, long param, long __functionAddress);

	/** Unsafe version of {@link #glGetTransformFeedbacki64_v GetTransformFeedbacki64_v} */
	@JavadocExclude
	public static void nglGetTransformFeedbacki64_v(int xfb, int pname, int index, long param) {
		long __functionAddress = getInstance().GetTransformFeedbacki64_v;
		nglGetTransformFeedbacki64_v(xfb, pname, index, param, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTransformFeedback.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns information about a transform feedback object.
	 *
	 * @param xfb   zero or the name of an existing transform feedback object
	 * @param pname the parameter to query. One of:<br>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_START TRANSFORM_FEEDBACK_BUFFER_START}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_SIZE TRANSFORM_FEEDBACK_BUFFER_SIZE}
	 * @param index the transform feedback stream index
	 * @param param the buffer in which to return the parameter value
	 */
	public static void glGetTransformFeedbacki64_v(int xfb, int pname, int index, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << 3);
		nglGetTransformFeedbacki64_v(xfb, pname, index, memAddress(param));
	}

	/** Alternative version of: {@link #glGetTransformFeedbacki64_v GetTransformFeedbacki64_v} */
	public static void glGetTransformFeedbacki64_v(int xfb, int pname, int index, LongBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglGetTransformFeedbacki64_v(xfb, pname, index, memAddress(param));
	}

	/** Single return value version of: {@link #glGetTransformFeedbacki64_v GetTransformFeedbacki64_v} */
	public static long glGetTransformFeedbacki64(int xfb, int pname, int index) {
		APIBuffer __buffer = apiBuffer();
		int param = __buffer.longParam();
		nglGetTransformFeedbacki64_v(xfb, pname, index, __buffer.address(param));
		return __buffer.longValue(param);
	}

	// --- [ glCreateBuffers ] ---

	/** JNI method for {@link #glCreateBuffers CreateBuffers} */
	@JavadocExclude
	public static native void nglCreateBuffers(int n, long buffers, long __functionAddress);

	/** Unsafe version of {@link #glCreateBuffers CreateBuffers} */
	@JavadocExclude
	public static void nglCreateBuffers(int n, long buffers) {
		long __functionAddress = getInstance().CreateBuffers;
		nglCreateBuffers(n, buffers, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
	 * unspecified target.
	 *
	 * @param n       the number of buffer names to create
	 * @param buffers the buffer in which to return the names
	 */
	public static void glCreateBuffers(int n, ByteBuffer buffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(buffers, n << 2);
		nglCreateBuffers(n, memAddress(buffers));
	}

	/** Alternative version of: {@link #glCreateBuffers CreateBuffers} */
	public static void glCreateBuffers(IntBuffer buffers) {
		nglCreateBuffers(buffers.remaining(), memAddress(buffers));
	}

	/** Single return value version of: {@link #glCreateBuffers CreateBuffers} */
	public static int glCreateBuffers() {
		APIBuffer __buffer = apiBuffer();
		int buffers = __buffer.intParam();
		nglCreateBuffers(1, __buffer.address(buffers));
		return __buffer.intValue(buffers);
	}

	// --- [ glNamedBufferStorage ] ---

	/** JNI method for {@link #glNamedBufferStorage NamedBufferStorage} */
	@JavadocExclude
	public static native void nglNamedBufferStorage(int buffer, long size, long data, int flags, long __functionAddress);

	/** Unsafe version of {@link #glNamedBufferStorage NamedBufferStorage} */
	@JavadocExclude
	public static void nglNamedBufferStorage(int buffer, long size, long data, int flags) {
		long __functionAddress = getInstance().NamedBufferStorage;
		nglNamedBufferStorage(buffer, size, data, flags, __functionAddress);
	}

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
	 *               If {@code flags} contains {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.
	 *               
	 *               <p>It is an error to specify {@link GL44#GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link GL44#GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
	 */
	public static void glNamedBufferStorage(int buffer, long size, ByteBuffer data, int flags) {
		if ( LWJGLUtil.CHECKS )
			if ( data != null ) checkBuffer(data, size);
		nglNamedBufferStorage(buffer, size, memAddressSafe(data), flags);
	}

	/** Alternative version of: {@link #glNamedBufferStorage NamedBufferStorage} */
	public static void glNamedBufferStorage(int buffer, long size, int flags) {
		nglNamedBufferStorage(buffer, size, 0L, flags);
	}

	/** ByteBuffer version of: {@link #glNamedBufferStorage NamedBufferStorage} */
	public static void glNamedBufferStorage(int buffer, ByteBuffer data, int flags) {
		nglNamedBufferStorage(buffer, data.remaining(), memAddress(data), flags);
	}

	/** ShortBuffer version of: {@link #glNamedBufferStorage NamedBufferStorage} */
	public static void glNamedBufferStorage(int buffer, ShortBuffer data, int flags) {
		nglNamedBufferStorage(buffer, data.remaining() << 1, memAddress(data), flags);
	}

	/** IntBuffer version of: {@link #glNamedBufferStorage NamedBufferStorage} */
	public static void glNamedBufferStorage(int buffer, IntBuffer data, int flags) {
		nglNamedBufferStorage(buffer, data.remaining() << 2, memAddress(data), flags);
	}

	/** FloatBuffer version of: {@link #glNamedBufferStorage NamedBufferStorage} */
	public static void glNamedBufferStorage(int buffer, FloatBuffer data, int flags) {
		nglNamedBufferStorage(buffer, data.remaining() << 2, memAddress(data), flags);
	}

	/** DoubleBuffer version of: {@link #glNamedBufferStorage NamedBufferStorage} */
	public static void glNamedBufferStorage(int buffer, DoubleBuffer data, int flags) {
		nglNamedBufferStorage(buffer, data.remaining() << 3, memAddress(data), flags);
	}

	// --- [ glNamedBufferData ] ---

	/** JNI method for {@link #glNamedBufferData NamedBufferData} */
	@JavadocExclude
	public static native void nglNamedBufferData(int buffer, long size, long data, int usage, long __functionAddress);

	/** Unsafe version of {@link #glNamedBufferData NamedBufferData} */
	@JavadocExclude
	public static void nglNamedBufferData(int buffer, long size, long data, int usage) {
		long __functionAddress = getInstance().NamedBufferData;
		nglNamedBufferData(buffer, size, data, usage, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glBufferData BufferData}.
	 *
	 * @param buffer 
	 * @param size   the size in bytes of the buffer object's new data store
	 * @param data   a pointer to data that will be copied into the data store for initialization, or NULL if no data is to be copied
	 * @param usage  the expected usage pattern of the data store. One of:<br>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}, {@link GL15#GL_STREAM_READ STREAM_READ}, {@link GL15#GL_STREAM_COPY STREAM_COPY}, {@link GL15#GL_STATIC_DRAW STATIC_DRAW}, {@link GL15#GL_STATIC_READ STATIC_READ}, {@link GL15#GL_STATIC_COPY STATIC_COPY}, {@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}, {@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}, {@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}
	 */
	public static void glNamedBufferData(int buffer, long size, ByteBuffer data, int usage) {
		if ( LWJGLUtil.CHECKS )
			if ( data != null ) checkBuffer(data, size);
		nglNamedBufferData(buffer, size, memAddressSafe(data), usage);
	}

	/** Alternative version of: {@link #glNamedBufferData NamedBufferData} */
	public static void glNamedBufferData(int buffer, long size, int usage) {
		nglNamedBufferData(buffer, size, 0L, usage);
	}

	/** ByteBuffer version of: {@link #glNamedBufferData NamedBufferData} */
	public static void glNamedBufferData(int buffer, ByteBuffer data, int usage) {
		nglNamedBufferData(buffer, data.remaining(), memAddress(data), usage);
	}

	/** ShortBuffer version of: {@link #glNamedBufferData NamedBufferData} */
	public static void glNamedBufferData(int buffer, ShortBuffer data, int usage) {
		nglNamedBufferData(buffer, data.remaining() << 1, memAddress(data), usage);
	}

	/** IntBuffer version of: {@link #glNamedBufferData NamedBufferData} */
	public static void glNamedBufferData(int buffer, IntBuffer data, int usage) {
		nglNamedBufferData(buffer, data.remaining() << 2, memAddress(data), usage);
	}

	/** FloatBuffer version of: {@link #glNamedBufferData NamedBufferData} */
	public static void glNamedBufferData(int buffer, FloatBuffer data, int usage) {
		nglNamedBufferData(buffer, data.remaining() << 2, memAddress(data), usage);
	}

	/** DoubleBuffer version of: {@link #glNamedBufferData NamedBufferData} */
	public static void glNamedBufferData(int buffer, DoubleBuffer data, int usage) {
		nglNamedBufferData(buffer, data.remaining() << 3, memAddress(data), usage);
	}

	// --- [ glNamedBufferSubData ] ---

	/** JNI method for {@link #glNamedBufferSubData NamedBufferSubData} */
	@JavadocExclude
	public static native void nglNamedBufferSubData(int buffer, long offset, long size, long data, long __functionAddress);

	/** Unsafe version of {@link #glNamedBufferSubData NamedBufferSubData} */
	@JavadocExclude
	public static void nglNamedBufferSubData(int buffer, long offset, long size, long data) {
		long __functionAddress = getInstance().NamedBufferSubData;
		nglNamedBufferSubData(buffer, offset, size, data, __functionAddress);
	}

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
	public static void glNamedBufferSubData(int buffer, long offset, long size, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, size);
		nglNamedBufferSubData(buffer, offset, size, memAddress(data));
	}

	/** ByteBuffer version of: {@link #glNamedBufferSubData NamedBufferSubData} */
	public static void glNamedBufferSubData(int buffer, long offset, ByteBuffer data) {
		nglNamedBufferSubData(buffer, offset, data.remaining(), memAddress(data));
	}

	/** ShortBuffer version of: {@link #glNamedBufferSubData NamedBufferSubData} */
	public static void glNamedBufferSubData(int buffer, long offset, ShortBuffer data) {
		nglNamedBufferSubData(buffer, offset, data.remaining() << 1, memAddress(data));
	}

	/** IntBuffer version of: {@link #glNamedBufferSubData NamedBufferSubData} */
	public static void glNamedBufferSubData(int buffer, long offset, IntBuffer data) {
		nglNamedBufferSubData(buffer, offset, data.remaining() << 2, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glNamedBufferSubData NamedBufferSubData} */
	public static void glNamedBufferSubData(int buffer, long offset, FloatBuffer data) {
		nglNamedBufferSubData(buffer, offset, data.remaining() << 2, memAddress(data));
	}

	/** DoubleBuffer version of: {@link #glNamedBufferSubData NamedBufferSubData} */
	public static void glNamedBufferSubData(int buffer, long offset, DoubleBuffer data) {
		nglNamedBufferSubData(buffer, offset, data.remaining() << 3, memAddress(data));
	}

	// --- [ glCopyNamedBufferSubData ] ---

	/** JNI method for {@link #glCopyNamedBufferSubData CopyNamedBufferSubData} */
	@JavadocExclude
	public static native void nglCopyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size, long __functionAddress);

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
		long __functionAddress = getInstance().CopyNamedBufferSubData;
		nglCopyNamedBufferSubData(readBuffer, writeBuffer, readOffset, writeOffset, size, __functionAddress);
	}

	// --- [ glClearNamedBufferData ] ---

	/** JNI method for {@link #glClearNamedBufferData ClearNamedBufferData} */
	@JavadocExclude
	public static native void nglClearNamedBufferData(int buffer, int internalformat, int format, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #glClearNamedBufferData ClearNamedBufferData} */
	@JavadocExclude
	public static void nglClearNamedBufferData(int buffer, int internalformat, int format, int type, long data) {
		long __functionAddress = getInstance().ClearNamedBufferData;
		nglClearNamedBufferData(buffer, internalformat, format, type, data, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedBufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glClearBufferData ClearBufferData}.
	 *
	 * @param buffer         the buffer object name
	 * @param internalformat the internal format with which the data will be stored in the buffer object
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param data           buffer containing the data to be used as the source of the constant fill value.
	 *                       The elements of data are converted by the GL into the format specified by internalformat,
	 *                       and then used to fill the specified range of the destination buffer.
	 *                       If data is {@code NULL}, then it is ignored and the sub-range of the buffer is filled with zeros.
	 */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, ByteBuffer data) {
		nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
	}

	/** ShortBuffer version of: {@link #glClearNamedBufferData ClearNamedBufferData} */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, ShortBuffer data) {
		nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
	}

	/** IntBuffer version of: {@link #glClearNamedBufferData ClearNamedBufferData} */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, IntBuffer data) {
		nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
	}

	/** FloatBuffer version of: {@link #glClearNamedBufferData ClearNamedBufferData} */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, FloatBuffer data) {
		nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
	}

	// --- [ glClearNamedBufferSubData ] ---

	/** JNI method for {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
	@JavadocExclude
	public static native void nglClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, long data, long __functionAddress);

	/** Unsafe version of {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
	@JavadocExclude
	public static void nglClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, long data) {
		long __functionAddress = getInstance().ClearNamedBufferSubData;
		nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data, __functionAddress);
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
	 * @param format         the format of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type           the type of the data in memory addressed by {@code data}. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param data           buffer containing the data to be used as the source of the constant fill value.
	 *                       The elements of data are converted by the GL into the format specified by internalformat,
	 *                       and then used to fill the specified range of the destination buffer.
	 *                       If data is {@code NULL}, then it is ignored and the sub-range of the buffer is filled with zeros.
	 */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, ByteBuffer data) {
		nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/** ShortBuffer version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, ShortBuffer data) {
		nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/** IntBuffer version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, IntBuffer data) {
		nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	/** FloatBuffer version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, FloatBuffer data) {
		nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
	}

	// --- [ glMapNamedBuffer ] ---

	/** JNI method for {@link #glMapNamedBuffer MapNamedBuffer} */
	@JavadocExclude
	public static native long nglMapNamedBuffer(int buffer, int access, long __functionAddress);

	/** Unsafe version of {@link #glMapNamedBuffer MapNamedBuffer} */
	@JavadocExclude
	public static long nglMapNamedBuffer(int buffer, int access) {
		long __functionAddress = getInstance().MapNamedBuffer;
		return nglMapNamedBuffer(buffer, access, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMapNamedBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glMapBuffer MapBuffer}.
	 *
	 * @param buffer the buffer object name
	 * @param access the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store. One of:<br>{@link GL15#GL_READ_ONLY READ_ONLY}, {@link GL15#GL_WRITE_ONLY WRITE_ONLY}, {@link GL15#GL_READ_WRITE READ_WRITE}
	 */
	public static ByteBuffer glMapNamedBuffer(int buffer, int access) {
		long __result = nglMapNamedBuffer(buffer, access);
		return memByteBuffer(__result, (int)glGetNamedBufferParameteri(buffer, GL15.GL_BUFFER_SIZE));
	}

	/** Alternative version of: {@link #glMapNamedBuffer MapNamedBuffer} */
	public static ByteBuffer glMapNamedBuffer(int buffer, int access, ByteBuffer old_buffer) {
		long __result = nglMapNamedBuffer(buffer, access);
		int length = glGetNamedBufferParameteri(buffer, GL15.GL_BUFFER_SIZE);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, length);
	}

	/** Explicit size alternative version of: {@link #glMapNamedBuffer MapNamedBuffer} */
	public static ByteBuffer glMapNamedBuffer(int buffer, int access, long length, ByteBuffer old_buffer) {
		long __result = nglMapNamedBuffer(buffer, access);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, (int)length);
	}

	// --- [ glMapNamedBufferRange ] ---

	/** JNI method for {@link #glMapNamedBufferRange MapNamedBufferRange} */
	@JavadocExclude
	public static native long nglMapNamedBufferRange(int buffer, long offset, long length, int access, long __functionAddress);

	/** Unsafe version of {@link #glMapNamedBufferRange MapNamedBufferRange} */
	@JavadocExclude
	public static long nglMapNamedBufferRange(int buffer, long offset, long length, int access) {
		long __functionAddress = getInstance().MapNamedBufferRange;
		return nglMapNamedBufferRange(buffer, offset, length, access, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glMapNamedBufferRange.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glMapBufferRange MapBufferRange}.
	 *
	 * @param buffer the buffer object name
	 * @param offset the starting offset within the buffer of the range to be mapped
	 * @param length the length of the range to be mapped
	 * @param access a combination of access flags indicating the desired access to the range. One or more of:<br>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}, {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}, {@link GL30#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}, {@link GL30#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}, {@link GL30#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}, {@link GL30#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}
	 */
	public static ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access) {
		long __result = nglMapNamedBufferRange(buffer, offset, length, access);
		return memByteBuffer(__result, (int)length);
	}

	/** Alternative version of: {@link #glMapNamedBufferRange MapNamedBufferRange} */
	public static ByteBuffer glMapNamedBufferRange(int buffer, long offset, long length, int access, ByteBuffer old_buffer) {
		long __result = nglMapNamedBufferRange(buffer, offset, length, access);
		return old_buffer != null && __result == memAddress0(old_buffer) && old_buffer.capacity() == length ? old_buffer : memByteBuffer(__result, (int)length);
	}

	// --- [ glUnmapNamedBuffer ] ---

	/** JNI method for {@link #glUnmapNamedBuffer UnmapNamedBuffer} */
	@JavadocExclude
	public static native boolean nglUnmapNamedBuffer(int buffer, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glUnmapNamedBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glUnmapBuffer UnmapBuffer}.
	 *
	 * @param buffer the buffer object name
	 */
	public static boolean glUnmapNamedBuffer(int buffer) {
		long __functionAddress = getInstance().UnmapNamedBuffer;
		return nglUnmapNamedBuffer(buffer, __functionAddress);
	}

	// --- [ glFlushMappedNamedBufferRange ] ---

	/** JNI method for {@link #glFlushMappedNamedBufferRange FlushMappedNamedBufferRange} */
	@JavadocExclude
	public static native void nglFlushMappedNamedBufferRange(int buffer, long offset, long length, long __functionAddress);

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
		long __functionAddress = getInstance().FlushMappedNamedBufferRange;
		nglFlushMappedNamedBufferRange(buffer, offset, length, __functionAddress);
	}

	// --- [ glGetNamedBufferParameteriv ] ---

	/** JNI method for {@link #glGetNamedBufferParameteriv GetNamedBufferParameteriv} */
	@JavadocExclude
	public static native void nglGetNamedBufferParameteriv(int buffer, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedBufferParameteriv GetNamedBufferParameteriv} */
	@JavadocExclude
	public static void nglGetNamedBufferParameteriv(int buffer, int pname, long params) {
		long __functionAddress = getInstance().GetNamedBufferParameteriv;
		nglGetNamedBufferParameteriv(buffer, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glGetBufferParameteriv GetBufferParameteriv}.
	 *
	 * @param buffer the buffer object name
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}, {@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}, {@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}, {@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}, {@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}, {@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}, {@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}, {@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}, {@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}
	 * @param params the requested parameter
	 */
	public static void glGetNamedBufferParameteriv(int buffer, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetNamedBufferParameteriv(buffer, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedBufferParameteriv GetNamedBufferParameteriv} */
	public static void glGetNamedBufferParameteriv(int buffer, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedBufferParameteriv(buffer, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedBufferParameteriv GetNamedBufferParameteriv} */
	public static int glGetNamedBufferParameteri(int buffer, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetNamedBufferParameteriv(buffer, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetNamedBufferParameteri64v ] ---

	/** JNI method for {@link #glGetNamedBufferParameteri64v GetNamedBufferParameteri64v} */
	@JavadocExclude
	public static native void nglGetNamedBufferParameteri64v(int buffer, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedBufferParameteri64v GetNamedBufferParameteri64v} */
	@JavadocExclude
	public static void nglGetNamedBufferParameteri64v(int buffer, int pname, long params) {
		long __functionAddress = getInstance().GetNamedBufferParameteri64v;
		nglGetNamedBufferParameteri64v(buffer, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL32#glGetBufferParameteri64v GetBufferParameteri64v}.
	 *
	 * @param buffer the buffer object name
	 * @param pname  the symbolic name of a buffer object parameter. One of:<br>{@link GL15#GL_BUFFER_SIZE BUFFER_SIZE}, {@link GL15#GL_BUFFER_USAGE BUFFER_USAGE}, {@link GL15#GL_BUFFER_ACCESS BUFFER_ACCESS}, {@link GL15#GL_BUFFER_MAPPED BUFFER_MAPPED}, {@link GL30#GL_BUFFER_ACCESS_FLAGS BUFFER_ACCESS_FLAGS}, {@link GL30#GL_BUFFER_MAP_LENGTH BUFFER_MAP_LENGTH}, {@link GL30#GL_BUFFER_MAP_OFFSET BUFFER_MAP_OFFSET}, {@link GL44#GL_BUFFER_IMMUTABLE_STORAGE BUFFER_IMMUTABLE_STORAGE}, {@link GL44#GL_BUFFER_STORAGE_FLAGS BUFFER_STORAGE_FLAGS}
	 * @param params the requested parameter
	 */
	public static void glGetNamedBufferParameteri64v(int buffer, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetNamedBufferParameteri64v(buffer, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedBufferParameteri64v GetNamedBufferParameteri64v} */
	public static void glGetNamedBufferParameteri64v(int buffer, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedBufferParameteri64v(buffer, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedBufferParameteri64v GetNamedBufferParameteri64v} */
	public static long glGetNamedBufferParameteri64(int buffer, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetNamedBufferParameteri64v(buffer, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetNamedBufferPointerv ] ---

	/** JNI method for {@link #glGetNamedBufferPointerv GetNamedBufferPointerv} */
	@JavadocExclude
	public static native void nglGetNamedBufferPointerv(int buffer, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedBufferPointerv GetNamedBufferPointerv} */
	@JavadocExclude
	public static void nglGetNamedBufferPointerv(int buffer, int pname, long params) {
		long __functionAddress = getInstance().GetNamedBufferPointerv;
		nglGetNamedBufferPointerv(buffer, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedBufferPointer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL15#glGetBufferPointerv GetBufferPointerv}.
	 *
	 * @param buffer the buffer object name
	 * @param pname  the pointer to be returned. Must be:<br>{@link GL15#GL_BUFFER_MAP_POINTER BUFFER_MAP_POINTER}
	 * @param params the pointer value specified by {@code pname}
	 */
	public static void glGetNamedBufferPointerv(int buffer, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << POINTER_SHIFT);
		nglGetNamedBufferPointerv(buffer, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedBufferPointerv GetNamedBufferPointerv} */
	public static void glGetNamedBufferPointerv(int buffer, int pname, PointerBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedBufferPointerv(buffer, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedBufferPointerv GetNamedBufferPointerv} */
	public static long glGetNamedBufferPointer(int buffer, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.pointerParam();
		nglGetNamedBufferPointerv(buffer, pname, __buffer.address(params));
		return __buffer.pointerValue(params);
	}

	// --- [ glGetNamedBufferSubData ] ---

	/** JNI method for {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
	@JavadocExclude
	public static native void nglGetNamedBufferSubData(int buffer, long offset, long size, long data, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
	@JavadocExclude
	public static void nglGetNamedBufferSubData(int buffer, long offset, long size, long data) {
		long __functionAddress = getInstance().GetNamedBufferSubData;
		nglGetNamedBufferSubData(buffer, offset, size, data, __functionAddress);
	}

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
	public static void glGetNamedBufferSubData(int buffer, long offset, long size, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(data, size);
		nglGetNamedBufferSubData(buffer, offset, size, memAddress(data));
	}

	/** ByteBuffer version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
	public static void glGetNamedBufferSubData(int buffer, long offset, ByteBuffer data) {
		nglGetNamedBufferSubData(buffer, offset, data.remaining(), memAddress(data));
	}

	/** ShortBuffer version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
	public static void glGetNamedBufferSubData(int buffer, long offset, ShortBuffer data) {
		nglGetNamedBufferSubData(buffer, offset, data.remaining() << 1, memAddress(data));
	}

	/** IntBuffer version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
	public static void glGetNamedBufferSubData(int buffer, long offset, IntBuffer data) {
		nglGetNamedBufferSubData(buffer, offset, data.remaining() << 2, memAddress(data));
	}

	/** FloatBuffer version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
	public static void glGetNamedBufferSubData(int buffer, long offset, FloatBuffer data) {
		nglGetNamedBufferSubData(buffer, offset, data.remaining() << 2, memAddress(data));
	}

	/** DoubleBuffer version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
	public static void glGetNamedBufferSubData(int buffer, long offset, DoubleBuffer data) {
		nglGetNamedBufferSubData(buffer, offset, data.remaining() << 3, memAddress(data));
	}

	// --- [ glCreateFramebuffers ] ---

	/** JNI method for {@link #glCreateFramebuffers CreateFramebuffers} */
	@JavadocExclude
	public static native void nglCreateFramebuffers(int n, long framebuffers, long __functionAddress);

	/** Unsafe version of {@link #glCreateFramebuffers CreateFramebuffers} */
	@JavadocExclude
	public static void nglCreateFramebuffers(int n, long framebuffers) {
		long __functionAddress = getInstance().CreateFramebuffers;
		nglCreateFramebuffers(n, framebuffers, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateFramebuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object.
	 *
	 * @param n            the number of framebuffer names to create
	 * @param framebuffers the buffer in which to store the framebuffer names
	 */
	public static void glCreateFramebuffers(int n, ByteBuffer framebuffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(framebuffers, n << 2);
		nglCreateFramebuffers(n, memAddress(framebuffers));
	}

	/** Alternative version of: {@link #glCreateFramebuffers CreateFramebuffers} */
	public static void glCreateFramebuffers(IntBuffer framebuffers) {
		nglCreateFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
	}

	/** Single return value version of: {@link #glCreateFramebuffers CreateFramebuffers} */
	public static int glCreateFramebuffers() {
		APIBuffer __buffer = apiBuffer();
		int framebuffers = __buffer.intParam();
		nglCreateFramebuffers(1, __buffer.address(framebuffers));
		return __buffer.intValue(framebuffers);
	}

	// --- [ glNamedFramebufferRenderbuffer ] ---

	/** JNI method for {@link #glNamedFramebufferRenderbuffer NamedFramebufferRenderbuffer} */
	@JavadocExclude
	public static native void nglNamedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferRenderbuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glFramebufferRenderbuffer FramebufferRenderbuffer}.
	 *
	 * @param framebuffer        the framebuffer name
	 * @param attachment         the attachment point of the framebuffer. One of:<br>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, {@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}, {@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}, {@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}, {@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}, {@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}, {@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}, {@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}, {@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}, {@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}, {@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}, {@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}, {@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}, {@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}, {@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}, {@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}, {@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}, {@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}, {@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}
	 * @param renderbuffertarget the renderbuffer target. Must be:<br>{@link GL30#GL_RENDERBUFFER RENDERBUFFER}
	 * @param renderbuffer       the name of an existing renderbuffer object of type {@code renderbuffertarget} to attach
	 */
	public static void glNamedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
		long __functionAddress = getInstance().NamedFramebufferRenderbuffer;
		nglNamedFramebufferRenderbuffer(framebuffer, attachment, renderbuffertarget, renderbuffer, __functionAddress);
	}

	// --- [ glNamedFramebufferParameteri ] ---

	/** JNI method for {@link #glNamedFramebufferParameteri NamedFramebufferParameteri} */
	@JavadocExclude
	public static native void nglNamedFramebufferParameteri(int framebuffer, int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferParameteri.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glFramebufferParameteri FramebufferParameteri}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param pname       a token indicating the parameter to be modified. One of:<br>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}
	 * @param param       the new value for the parameter named {@code pname}
	 */
	public static void glNamedFramebufferParameteri(int framebuffer, int pname, int param) {
		long __functionAddress = getInstance().NamedFramebufferParameteri;
		nglNamedFramebufferParameteri(framebuffer, pname, param, __functionAddress);
	}

	// --- [ glNamedFramebufferTexture ] ---

	/** JNI method for {@link #glNamedFramebufferTexture NamedFramebufferTexture} */
	@JavadocExclude
	public static native void nglNamedFramebufferTexture(int framebuffer, int attachment, int texture, int level, long __functionAddress);

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
		long __functionAddress = getInstance().NamedFramebufferTexture;
		nglNamedFramebufferTexture(framebuffer, attachment, texture, level, __functionAddress);
	}

	// --- [ glNamedFramebufferTextureLayer ] ---

	/** JNI method for {@link #glNamedFramebufferTextureLayer NamedFramebufferTextureLayer} */
	@JavadocExclude
	public static native void nglNamedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferTextureLayer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glFramebufferTextureLayer FramebufferTextureLayer}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param attachment  the attachment point of the framebuffer. One of:<br>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, {@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}, {@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}, {@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}, {@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}, {@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}, {@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}, {@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}, {@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}, {@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}, {@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}, {@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}, {@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}, {@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}, {@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}, {@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}, {@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}, {@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}, {@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}
	 * @param texture     the texture object to attach to the framebuffer attachment point named by {@code attachment}
	 * @param level       the mipmap level of {@code texture} to attach
	 * @param layer       the layer of {@code texture} to attach.
	 */
	public static void glNamedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) {
		long __functionAddress = getInstance().NamedFramebufferTextureLayer;
		nglNamedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer, __functionAddress);
	}

	// --- [ glNamedFramebufferDrawBuffer ] ---

	/** JNI method for {@link #glNamedFramebufferDrawBuffer NamedFramebufferDrawBuffer} */
	@JavadocExclude
	public static native void nglNamedFramebufferDrawBuffer(int framebuffer, int buf, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferDrawBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glDrawBuffer DrawBuffer}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buf         the color buffer to draw to. One of:<br>{@link GL11#GL_NONE NONE}, {@link GL11#GL_FRONT_LEFT FRONT_LEFT}, {@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}, {@link GL11#GL_BACK_LEFT BACK_LEFT}, {@link GL11#GL_BACK_RIGHT BACK_RIGHT}, {@link GL11#GL_FRONT FRONT}, {@link GL11#GL_BACK BACK}, {@link GL11#GL_LEFT LEFT}, {@link GL11#GL_RIGHT RIGHT}, {@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}, {@link GL11#GL_AUX0 AUX0}, {@link GL11#GL_AUX1 AUX1}, {@link GL11#GL_AUX2 AUX2}, {@link GL11#GL_AUX3 AUX3}, {@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, GL30.GL_COLOR_ATTACHMENT[1-15]
	 */
	public static void glNamedFramebufferDrawBuffer(int framebuffer, int buf) {
		long __functionAddress = getInstance().NamedFramebufferDrawBuffer;
		nglNamedFramebufferDrawBuffer(framebuffer, buf, __functionAddress);
	}

	// --- [ glNamedFramebufferDrawBuffers ] ---

	/** JNI method for {@link #glNamedFramebufferDrawBuffers NamedFramebufferDrawBuffers} */
	@JavadocExclude
	public static native void nglNamedFramebufferDrawBuffers(int framebuffer, int n, long bufs, long __functionAddress);

	/** Unsafe version of {@link #glNamedFramebufferDrawBuffers NamedFramebufferDrawBuffers} */
	@JavadocExclude
	public static void nglNamedFramebufferDrawBuffers(int framebuffer, int n, long bufs) {
		long __functionAddress = getInstance().NamedFramebufferDrawBuffers;
		nglNamedFramebufferDrawBuffers(framebuffer, n, bufs, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferDrawBuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL20#glDrawBuffers DrawBuffers}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param n           the number of buffers in {@code bufs}
	 * @param bufs        an array of symbolic constants specifying the buffers into which fragment colors or data values will be written. One of:<br>{@link GL11#GL_NONE NONE}, {@link GL11#GL_FRONT_LEFT FRONT_LEFT}, {@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}, {@link GL11#GL_BACK_LEFT BACK_LEFT}, {@link GL11#GL_BACK_RIGHT BACK_RIGHT}, {@link GL11#GL_AUX0 AUX0}, {@link GL11#GL_AUX1 AUX1}, {@link GL11#GL_AUX2 AUX2}, {@link GL11#GL_AUX3 AUX3}, {@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, GL30.GL_COLOR_ATTACHMENT[1-15]
	 */
	public static void glNamedFramebufferDrawBuffers(int framebuffer, int n, ByteBuffer bufs) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(bufs, n << 2);
		nglNamedFramebufferDrawBuffers(framebuffer, n, memAddress(bufs));
	}

	/** Alternative version of: {@link #glNamedFramebufferDrawBuffers NamedFramebufferDrawBuffers} */
	public static void glNamedFramebufferDrawBuffers(int framebuffer, IntBuffer bufs) {
		nglNamedFramebufferDrawBuffers(framebuffer, bufs.remaining(), memAddress(bufs));
	}

	/** Single value version of: {@link #glNamedFramebufferDrawBuffers NamedFramebufferDrawBuffers} */
	public static void glNamedFramebufferDrawBuffers(int framebuffer, int buf) {
		APIBuffer __buffer = apiBuffer();
		int bufs = __buffer.intParam(buf);
		nglNamedFramebufferDrawBuffers(framebuffer, 1, __buffer.address(bufs));
	}

	// --- [ glNamedFramebufferReadBuffer ] ---

	/** JNI method for {@link #glNamedFramebufferReadBuffer NamedFramebufferReadBuffer} */
	@JavadocExclude
	public static native void nglNamedFramebufferReadBuffer(int framebuffer, int src, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glNamedFramebufferReadBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glReadBuffer ReadBuffer}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param src         the color buffer to read from. One of:<br>{@link GL11#GL_NONE NONE}, {@link GL11#GL_FRONT_LEFT FRONT_LEFT}, {@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}, {@link GL11#GL_BACK_LEFT BACK_LEFT}, {@link GL11#GL_BACK_RIGHT BACK_RIGHT}, {@link GL11#GL_FRONT FRONT}, {@link GL11#GL_BACK BACK}, {@link GL11#GL_LEFT LEFT}, {@link GL11#GL_RIGHT RIGHT}, {@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}, {@link GL11#GL_AUX0 AUX0}, {@link GL11#GL_AUX1 AUX1}, {@link GL11#GL_AUX2 AUX2}, {@link GL11#GL_AUX3 AUX3}, {@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, GL30.GL_COLOR_ATTACHMENT[1-15]
	 */
	public static void glNamedFramebufferReadBuffer(int framebuffer, int src) {
		long __functionAddress = getInstance().NamedFramebufferReadBuffer;
		nglNamedFramebufferReadBuffer(framebuffer, src, __functionAddress);
	}

	// --- [ glInvalidateNamedFramebufferData ] ---

	/** JNI method for {@link #glInvalidateNamedFramebufferData InvalidateNamedFramebufferData} */
	@JavadocExclude
	public static native void nglInvalidateNamedFramebufferData(int framebuffer, int numAttachments, long attachments, long __functionAddress);

	/** Unsafe version of {@link #glInvalidateNamedFramebufferData InvalidateNamedFramebufferData} */
	@JavadocExclude
	public static void nglInvalidateNamedFramebufferData(int framebuffer, int numAttachments, long attachments) {
		long __functionAddress = getInstance().InvalidateNamedFramebufferData;
		nglInvalidateNamedFramebufferData(framebuffer, numAttachments, attachments, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glInvalidateNamedFramebufferData.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glInvalidateFramebuffer InvalidateFramebuffer}.
	 *
	 * @param framebuffer    the framebuffer name
	 * @param numAttachments the number of entries in the {@code attachments} array
	 * @param attachments    the address of an array identifying the attachments to be invalidated
	 */
	public static void glInvalidateNamedFramebufferData(int framebuffer, int numAttachments, ByteBuffer attachments) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(attachments, numAttachments << 2);
		nglInvalidateNamedFramebufferData(framebuffer, numAttachments, memAddress(attachments));
	}

	/** Alternative version of: {@link #glInvalidateNamedFramebufferData InvalidateNamedFramebufferData} */
	public static void glInvalidateNamedFramebufferData(int framebuffer, IntBuffer attachments) {
		nglInvalidateNamedFramebufferData(framebuffer, attachments.remaining(), memAddress(attachments));
	}

	/** Single value version of: {@link #glInvalidateNamedFramebufferData InvalidateNamedFramebufferData} */
	public static void glInvalidateNamedFramebufferData(int framebuffer, int attachment) {
		APIBuffer __buffer = apiBuffer();
		int attachments = __buffer.intParam(attachment);
		nglInvalidateNamedFramebufferData(framebuffer, 1, __buffer.address(attachments));
	}

	// --- [ glInvalidateNamedFramebufferSubData ] ---

	/** JNI method for {@link #glInvalidateNamedFramebufferSubData InvalidateNamedFramebufferSubData} */
	@JavadocExclude
	public static native void nglInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, long attachments, int x, int y, int width, int height, long __functionAddress);

	/** Unsafe version of {@link #glInvalidateNamedFramebufferSubData InvalidateNamedFramebufferSubData} */
	@JavadocExclude
	public static void nglInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, long attachments, int x, int y, int width, int height) {
		long __functionAddress = getInstance().InvalidateNamedFramebufferSubData;
		nglInvalidateNamedFramebufferSubData(framebuffer, numAttachments, attachments, x, y, width, height, __functionAddress);
	}

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
	public static void glInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, ByteBuffer attachments, int x, int y, int width, int height) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(attachments, numAttachments << 2);
		nglInvalidateNamedFramebufferSubData(framebuffer, numAttachments, memAddress(attachments), x, y, width, height);
	}

	/** Alternative version of: {@link #glInvalidateNamedFramebufferSubData InvalidateNamedFramebufferSubData} */
	public static void glInvalidateNamedFramebufferSubData(int framebuffer, IntBuffer attachments, int x, int y, int width, int height) {
		nglInvalidateNamedFramebufferSubData(framebuffer, attachments.remaining(), memAddress(attachments), x, y, width, height);
	}

	/** Single value version of: {@link #glInvalidateNamedFramebufferSubData InvalidateNamedFramebufferSubData} */
	public static void glInvalidateNamedFramebufferSubData(int framebuffer, int attachment, int x, int y, int width, int height) {
		APIBuffer __buffer = apiBuffer();
		int attachments = __buffer.intParam(attachment);
		nglInvalidateNamedFramebufferSubData(framebuffer, 1, __buffer.address(attachments), x, y, width, height);
	}

	// --- [ glClearNamedFramebufferiv ] ---

	/** JNI method for {@link #glClearNamedFramebufferiv ClearNamedFramebufferiv} */
	@JavadocExclude
	public static native void nglClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, long value, long __functionAddress);

	/** Unsafe version of {@link #glClearNamedFramebufferiv ClearNamedFramebufferiv} */
	@JavadocExclude
	public static void nglClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, long value) {
		long __functionAddress = getInstance().ClearNamedFramebufferiv;
		nglClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glClearBufferiv ClearBufferiv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buffer      the buffer to clear. One of:<br>{@link GL11#GL_COLOR COLOR}, {@link GL11#GL_STENCIL STENCIL}
	 * @param drawbuffer  the draw buffer to clear
	 * @param value       for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For stencil buffers, a pointer to a
	 *                    single stencil value to clear the buffer to.
	 */
	public static void glClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, memAddress(value));
	}

	/** Alternative version of: {@link #glClearNamedFramebufferiv ClearNamedFramebufferiv} */
	public static void glClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearNamedFramebufferuiv ] ---

	/** JNI method for {@link #glClearNamedFramebufferuiv ClearNamedFramebufferuiv} */
	@JavadocExclude
	public static native void nglClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, long value, long __functionAddress);

	/** Unsafe version of {@link #glClearNamedFramebufferuiv ClearNamedFramebufferuiv} */
	@JavadocExclude
	public static void nglClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, long value) {
		long __functionAddress = getInstance().ClearNamedFramebufferuiv;
		nglClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glClearBufferuiv ClearBufferuiv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buffer      the buffer to clear. Must be:<br>{@link GL11#GL_COLOR COLOR}
	 * @param drawbuffer  the draw buffer to clear
	 * @param value       a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to
	 */
	public static void glClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 4 << 2);
		nglClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, memAddress(value));
	}

	/** Alternative version of: {@link #glClearNamedFramebufferuiv ClearNamedFramebufferuiv} */
	public static void glClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 4);
		nglClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearNamedFramebufferfv ] ---

	/** JNI method for {@link #glClearNamedFramebufferfv ClearNamedFramebufferfv} */
	@JavadocExclude
	public static native void nglClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, long value, long __functionAddress);

	/** Unsafe version of {@link #glClearNamedFramebufferfv ClearNamedFramebufferfv} */
	@JavadocExclude
	public static void nglClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, long value) {
		long __functionAddress = getInstance().ClearNamedFramebufferfv;
		nglClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glClearBufferfv ClearBufferfv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buffer      the buffer to clear. One of:<br>{@link GL11#GL_COLOR COLOR}, {@link GL11#GL_DEPTH DEPTH}
	 * @param drawbuffer  the draw buffer to clear
	 * @param value       for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For depth buffers, a pointer to a
	 *                    single depth value to clear the buffer to.
	 */
	public static void glClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, memAddress(value));
	}

	/** Alternative version of: {@link #glClearNamedFramebufferfv ClearNamedFramebufferfv} */
	public static void glClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, FloatBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, memAddress(value));
	}

	// --- [ glClearNamedFramebufferfi ] ---

	/** JNI method for {@link #glClearNamedFramebufferfi ClearNamedFramebufferfi} */
	@JavadocExclude
	public static native void nglClearNamedFramebufferfi(int framebuffer, int buffer, float depth, int stencil, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glClearNamedFramebufferfi.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glClearBufferfi ClearBufferfi}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param buffer      the buffer to clear. Must be:<br>{@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}
	 * @param depth       the depth value to clear the buffer to
	 * @param stencil     the stencil value to clear the buffer to
	 */
	public static void glClearNamedFramebufferfi(int framebuffer, int buffer, float depth, int stencil) {
		long __functionAddress = getInstance().ClearNamedFramebufferfi;
		nglClearNamedFramebufferfi(framebuffer, buffer, depth, stencil, __functionAddress);
	}

	// --- [ glBlitNamedFramebuffer ] ---

	/** JNI method for {@link #glBlitNamedFramebuffer BlitNamedFramebuffer} */
	@JavadocExclude
	public static native void nglBlitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter, long __functionAddress);

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
	 * @param mask            the bitwise OR of the flags indicating which buffers are to be copied. One of:<br>{@link GL11#GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}, {@link GL11#GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}, {@link GL11#GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}
	 * @param filter          the interpolation to be applied if the image is stretched. One of:<br>{@link GL11#GL_NEAREST NEAREST}, {@link GL11#GL_LINEAR LINEAR}
	 */
	public static void glBlitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
		long __functionAddress = getInstance().BlitNamedFramebuffer;
		nglBlitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
	}

	// --- [ glCheckNamedFramebufferStatus ] ---

	/** JNI method for {@link #glCheckNamedFramebufferStatus CheckNamedFramebufferStatus} */
	@JavadocExclude
	public static native int nglCheckNamedFramebufferStatus(int framebuffer, int target, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCheckNamedFramebufferStatus.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glCheckFramebufferStatus CheckFramebufferStatus}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param target      the target of the framebuffer completeness check. One of:<br>{@link GL30#GL_FRAMEBUFFER FRAMEBUFFER}, {@link GL30#GL_READ_FRAMEBUFFER READ_FRAMEBUFFER}, {@link GL30#GL_DRAW_FRAMEBUFFER DRAW_FRAMEBUFFER}
	 */
	public static int glCheckNamedFramebufferStatus(int framebuffer, int target) {
		long __functionAddress = getInstance().CheckNamedFramebufferStatus;
		return nglCheckNamedFramebufferStatus(framebuffer, target, __functionAddress);
	}

	// --- [ glGetNamedFramebufferParameteriv ] ---

	/** JNI method for {@link #glGetNamedFramebufferParameteriv GetNamedFramebufferParameteriv} */
	@JavadocExclude
	public static native void nglGetNamedFramebufferParameteriv(int framebuffer, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedFramebufferParameteriv GetNamedFramebufferParameteriv} */
	@JavadocExclude
	public static void nglGetNamedFramebufferParameteriv(int framebuffer, int pname, long params) {
		long __functionAddress = getInstance().GetNamedFramebufferParameteriv;
		nglGetNamedFramebufferParameteriv(framebuffer, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedFramebufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glGetFramebufferParameteriv GetFramebufferParameteriv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param pname       a token indicating the parameter to be retrieved. One of:<br>{@link GL43#GL_FRAMEBUFFER_DEFAULT_WIDTH FRAMEBUFFER_DEFAULT_WIDTH}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_HEIGHT FRAMEBUFFER_DEFAULT_HEIGHT}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_LAYERS FRAMEBUFFER_DEFAULT_LAYERS}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_SAMPLES FRAMEBUFFER_DEFAULT_SAMPLES}, {@link GL43#GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS}
	 * @param params      a variable to receive the value of the parameter named {@code pname}
	 */
	public static void glGetNamedFramebufferParameteriv(int framebuffer, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetNamedFramebufferParameteriv(framebuffer, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedFramebufferParameteriv GetNamedFramebufferParameteriv} */
	public static void glGetNamedFramebufferParameteriv(int framebuffer, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedFramebufferParameteriv(framebuffer, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedFramebufferParameteriv GetNamedFramebufferParameteriv} */
	public static int glGetNamedFramebufferParameteri(int framebuffer, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetNamedFramebufferParameteriv(framebuffer, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetNamedFramebufferAttachmentParameteriv ] ---

	/** JNI method for {@link #glGetNamedFramebufferAttachmentParameteriv GetNamedFramebufferAttachmentParameteriv} */
	@JavadocExclude
	public static native void nglGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedFramebufferAttachmentParameteriv GetNamedFramebufferAttachmentParameteriv} */
	@JavadocExclude
	public static void nglGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, long params) {
		long __functionAddress = getInstance().GetNamedFramebufferAttachmentParameteriv;
		nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedFramebufferAttachmentParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetFramebufferAttachmentParameteriv GetFramebufferAttachmentParameteriv}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param attachment  the attachment within {@code target}. One of:<br>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}, {@link GL30#GL_COLOR_ATTACHMENT1 COLOR_ATTACHMENT1}, {@link GL30#GL_COLOR_ATTACHMENT2 COLOR_ATTACHMENT2}, {@link GL30#GL_COLOR_ATTACHMENT3 COLOR_ATTACHMENT3}, {@link GL30#GL_COLOR_ATTACHMENT4 COLOR_ATTACHMENT4}, {@link GL30#GL_COLOR_ATTACHMENT5 COLOR_ATTACHMENT5}, {@link GL30#GL_COLOR_ATTACHMENT6 COLOR_ATTACHMENT6}, {@link GL30#GL_COLOR_ATTACHMENT7 COLOR_ATTACHMENT7}, {@link GL30#GL_COLOR_ATTACHMENT8 COLOR_ATTACHMENT8}, {@link GL30#GL_COLOR_ATTACHMENT9 COLOR_ATTACHMENT9}, {@link GL30#GL_COLOR_ATTACHMENT10 COLOR_ATTACHMENT10}, {@link GL30#GL_COLOR_ATTACHMENT11 COLOR_ATTACHMENT11}, {@link GL30#GL_COLOR_ATTACHMENT12 COLOR_ATTACHMENT12}, {@link GL30#GL_COLOR_ATTACHMENT13 COLOR_ATTACHMENT13}, {@link GL30#GL_COLOR_ATTACHMENT14 COLOR_ATTACHMENT14}, {@link GL30#GL_COLOR_ATTACHMENT15 COLOR_ATTACHMENT15}, {@link GL30#GL_DEPTH_ATTACHMENT DEPTH_ATTACHMENT}, {@link GL30#GL_STENCIL_ATTACHMENT STENCIL_ATTACHMENT}, {@link GL30#GL_DEPTH_STENCIL_ATTACHMENT DEPTH_STENCIL_ATTACHMENT}
	 * @param pname       the parameter of {@code attachment} to query. One of:<br>{@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE}, {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME FRAMEBUFFER_ATTACHMENT_OBJECT_NAME}, {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL}, {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE}, {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER}, {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING}, {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE}, {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE FRAMEBUFFER_ATTACHMENT_RED_SIZE}, {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE FRAMEBUFFER_ATTACHMENT_GREEN_SIZE}, {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE FRAMEBUFFER_ATTACHMENT_BLUE_SIZE}, {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE}, {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE}, {@link GL30#GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE}
	 * @param params      an array to receive the value of the queried parameter
	 */
	public static void glGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedFramebufferAttachmentParameteriv GetNamedFramebufferAttachmentParameteriv} */
	public static void glGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedFramebufferAttachmentParameteriv GetNamedFramebufferAttachmentParameteriv} */
	public static int glGetNamedFramebufferAttachmentParameteri(int framebuffer, int attachment, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glCreateRenderbuffers ] ---

	/** JNI method for {@link #glCreateRenderbuffers CreateRenderbuffers} */
	@JavadocExclude
	public static native void nglCreateRenderbuffers(int n, long renderbuffers, long __functionAddress);

	/** Unsafe version of {@link #glCreateRenderbuffers CreateRenderbuffers} */
	@JavadocExclude
	public static void nglCreateRenderbuffers(int n, long renderbuffers) {
		long __functionAddress = getInstance().CreateRenderbuffers;
		nglCreateRenderbuffers(n, renderbuffers, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateRenderbuffers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object.
	 *
	 * @param n             the number of renderbuffer names to create
	 * @param renderbuffers the buffer in which to store the created renderbuffer names
	 */
	public static void glCreateRenderbuffers(int n, ByteBuffer renderbuffers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(renderbuffers, n << 2);
		nglCreateRenderbuffers(n, memAddress(renderbuffers));
	}

	/** Alternative version of: {@link #glCreateRenderbuffers CreateRenderbuffers} */
	public static void glCreateRenderbuffers(IntBuffer renderbuffers) {
		nglCreateRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
	}

	/** Single return value version of: {@link #glCreateRenderbuffers CreateRenderbuffers} */
	public static int glCreateRenderbuffers() {
		APIBuffer __buffer = apiBuffer();
		int renderbuffers = __buffer.intParam();
		nglCreateRenderbuffers(1, __buffer.address(renderbuffers));
		return __buffer.intValue(renderbuffers);
	}

	// --- [ glNamedRenderbufferStorage ] ---

	/** JNI method for {@link #glNamedRenderbufferStorage NamedRenderbufferStorage} */
	@JavadocExclude
	public static native void nglNamedRenderbufferStorage(int renderbuffer, int internalformat, int width, int height, long __functionAddress);

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
		long __functionAddress = getInstance().NamedRenderbufferStorage;
		nglNamedRenderbufferStorage(renderbuffer, internalformat, width, height, __functionAddress);
	}

	// --- [ glNamedRenderbufferStorageMultisample ] ---

	/** JNI method for {@link #glNamedRenderbufferStorageMultisample NamedRenderbufferStorageMultisample} */
	@JavadocExclude
	public static native void nglNamedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalformat, int width, int height, long __functionAddress);

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
		long __functionAddress = getInstance().NamedRenderbufferStorageMultisample;
		nglNamedRenderbufferStorageMultisample(renderbuffer, samples, internalformat, width, height, __functionAddress);
	}

	// --- [ glGetNamedRenderbufferParameteriv ] ---

	/** JNI method for {@link #glGetNamedRenderbufferParameteriv GetNamedRenderbufferParameteriv} */
	@JavadocExclude
	public static native void nglGetNamedRenderbufferParameteriv(int renderbuffer, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetNamedRenderbufferParameteriv GetNamedRenderbufferParameteriv} */
	@JavadocExclude
	public static void nglGetNamedRenderbufferParameteriv(int renderbuffer, int pname, long params) {
		long __functionAddress = getInstance().GetNamedRenderbufferParameteriv;
		nglGetNamedRenderbufferParameteriv(renderbuffer, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetNamedRenderbufferParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGetRenderbufferParameteriv GetRenderbufferParameteriv}.
	 *
	 * @param renderbuffer 
	 * @param pname        the parameter whose value to retrieve from the renderbuffer bound to {@code target}. One of:<br>{@link GL30#GL_RENDERBUFFER_WIDTH RENDERBUFFER_WIDTH}, {@link GL30#GL_RENDERBUFFER_HEIGHT RENDERBUFFER_HEIGHT}, {@link GL30#GL_RENDERBUFFER_INTERNAL_FORMAT RENDERBUFFER_INTERNAL_FORMAT}, {@link GL30#GL_RENDERBUFFER_RED_SIZE RENDERBUFFER_RED_SIZE}, {@link GL30#GL_RENDERBUFFER_GREEN_SIZE RENDERBUFFER_GREEN_SIZE}, {@link GL30#GL_RENDERBUFFER_BLUE_SIZE RENDERBUFFER_BLUE_SIZE}, {@link GL30#GL_RENDERBUFFER_ALPHA_SIZE RENDERBUFFER_ALPHA_SIZE}, {@link GL30#GL_RENDERBUFFER_DEPTH_SIZE RENDERBUFFER_DEPTH_SIZE}, {@link GL30#GL_RENDERBUFFER_STENCIL_SIZE RENDERBUFFER_STENCIL_SIZE}, {@link GL30#GL_RENDERBUFFER_SAMPLES RENDERBUFFER_SAMPLES}
	 * @param params       an array to receive the value of the queried parameter
	 */
	public static void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetNamedRenderbufferParameteriv(renderbuffer, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetNamedRenderbufferParameteriv GetNamedRenderbufferParameteriv} */
	public static void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetNamedRenderbufferParameteriv(renderbuffer, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetNamedRenderbufferParameteriv GetNamedRenderbufferParameteriv} */
	public static int glGetNamedRenderbufferParameteri(int renderbuffer, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetNamedRenderbufferParameteriv(renderbuffer, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glCreateTextures ] ---

	/** JNI method for {@link #glCreateTextures CreateTextures} */
	@JavadocExclude
	public static native void nglCreateTextures(int target, int n, long textures, long __functionAddress);

	/** Unsafe version of {@link #glCreateTextures CreateTextures} */
	@JavadocExclude
	public static void nglCreateTextures(int target, int n, long textures) {
		long __functionAddress = getInstance().CreateTextures;
		nglCreateTextures(target, n, textures, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateTextures.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused texture names in {@code textures}, each representing a new texture object.
	 *
	 * @param target   the texture target. One of:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param n        the number of texture names to create
	 * @param textures the buffer in which to store the created texture names
	 */
	public static void glCreateTextures(int target, int n, ByteBuffer textures) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(textures, n << 2);
		nglCreateTextures(target, n, memAddress(textures));
	}

	/** Alternative version of: {@link #glCreateTextures CreateTextures} */
	public static void glCreateTextures(int target, IntBuffer textures) {
		nglCreateTextures(target, textures.remaining(), memAddress(textures));
	}

	/** Single return value version of: {@link #glCreateTextures CreateTextures} */
	public static int glCreateTextures(int target) {
		APIBuffer __buffer = apiBuffer();
		int textures = __buffer.intParam();
		nglCreateTextures(target, 1, __buffer.address(textures));
		return __buffer.intValue(textures);
	}

	// --- [ glTextureBuffer ] ---

	/** JNI method for {@link #glTextureBuffer TextureBuffer} */
	@JavadocExclude
	public static native void nglTextureBuffer(int texture, int internalformat, int buffer, long __functionAddress);

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
		long __functionAddress = getInstance().TextureBuffer;
		nglTextureBuffer(texture, internalformat, buffer, __functionAddress);
	}

	// --- [ glTextureBufferRange ] ---

	/** JNI method for {@link #glTextureBufferRange TextureBufferRange} */
	@JavadocExclude
	public static native void nglTextureBufferRange(int texture, int internalformat, int buffer, long offset, long size, long __functionAddress);

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
		long __functionAddress = getInstance().TextureBufferRange;
		nglTextureBufferRange(texture, internalformat, buffer, offset, size, __functionAddress);
	}

	// --- [ glTextureStorage1D ] ---

	/** JNI method for {@link #glTextureStorage1D TextureStorage1D} */
	@JavadocExclude
	public static native void nglTextureStorage1D(int texture, int levels, int internalformat, int width, long __functionAddress);

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
		long __functionAddress = getInstance().TextureStorage1D;
		nglTextureStorage1D(texture, levels, internalformat, width, __functionAddress);
	}

	// --- [ glTextureStorage2D ] ---

	/** JNI method for {@link #glTextureStorage2D TextureStorage2D} */
	@JavadocExclude
	public static native void nglTextureStorage2D(int texture, int levels, int internalformat, int width, int height, long __functionAddress);

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
		long __functionAddress = getInstance().TextureStorage2D;
		nglTextureStorage2D(texture, levels, internalformat, width, height, __functionAddress);
	}

	// --- [ glTextureStorage3D ] ---

	/** JNI method for {@link #glTextureStorage3D TextureStorage3D} */
	@JavadocExclude
	public static native void nglTextureStorage3D(int texture, int levels, int internalformat, int width, int height, int depth, long __functionAddress);

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
		long __functionAddress = getInstance().TextureStorage3D;
		nglTextureStorage3D(texture, levels, internalformat, width, height, depth, __functionAddress);
	}

	// --- [ glTextureStorage2DMultisample ] ---

	/** JNI method for {@link #glTextureStorage2DMultisample TextureStorage2DMultisample} */
	@JavadocExclude
	public static native void nglTextureStorage2DMultisample(int texture, int samples, int internalformat, int width, int height, boolean fixedsamplelocations, long __functionAddress);

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
		long __functionAddress = getInstance().TextureStorage2DMultisample;
		nglTextureStorage2DMultisample(texture, samples, internalformat, width, height, fixedsamplelocations, __functionAddress);
	}

	// --- [ glTextureStorage3DMultisample ] ---

	/** JNI method for {@link #glTextureStorage3DMultisample TextureStorage3DMultisample} */
	@JavadocExclude
	public static native void nglTextureStorage3DMultisample(int texture, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations, long __functionAddress);

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
		long __functionAddress = getInstance().TextureStorage3DMultisample;
		nglTextureStorage3DMultisample(texture, samples, internalformat, width, height, depth, fixedsamplelocations, __functionAddress);
	}

	// --- [ glTextureSubImage1D ] ---

	/** JNI method for {@link #glTextureSubImage1D TextureSubImage1D} */
	@JavadocExclude
	public static native void nglTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTextureSubImage1D TextureSubImage1D} */
	@JavadocExclude
	public static void nglTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureSubImage1D;
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, pixels, __functionAddress);
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
	 * @param format  the pixel data format. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the pixel data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param pixels  the pixel data
	 */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	// --- [ glTextureSubImage2D ] ---

	/** JNI method for {@link #glTextureSubImage2D TextureSubImage2D} */
	@JavadocExclude
	public static native void nglTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTextureSubImage2D TextureSubImage2D} */
	@JavadocExclude
	public static void nglTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureSubImage2D;
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
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
	 * @param format  the pixel data format. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the pixel data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param pixels  the pixel data
	 */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	// --- [ glTextureSubImage3D ] ---

	/** JNI method for {@link #glTextureSubImage3D TextureSubImage3D} */
	@JavadocExclude
	public static native void nglTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glTextureSubImage3D TextureSubImage3D} */
	@JavadocExclude
	public static void nglTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
		long __functionAddress = getInstance().TextureSubImage3D;
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
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
	 * @param format  the pixel data format. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the pixel data type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param pixels  the pixel data
	 */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	// --- [ glCompressedTextureSubImage1D ] ---

	/** JNI method for {@link #glCompressedTextureSubImage1D CompressedTextureSubImage1D} */
	@JavadocExclude
	public static native void nglCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTextureSubImage1D CompressedTextureSubImage1D} */
	@JavadocExclude
	public static void nglCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureSubImage1D;
		nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data, __functionAddress);
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
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionASTCLDR}
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTextureSubImage1D CompressedTextureSubImage1D} */
	public static void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTextureSubImage1D CompressedTextureSubImage1D} */
	public static void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTextureSubImage2D ] ---

	/** JNI method for {@link #glCompressedTextureSubImage2D CompressedTextureSubImage2D} */
	@JavadocExclude
	public static native void nglCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTextureSubImage2D CompressedTextureSubImage2D} */
	@JavadocExclude
	public static void nglCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureSubImage2D;
		nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data, __functionAddress);
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
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionASTCLDR}
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTextureSubImage2D CompressedTextureSubImage2D} */
	public static void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTextureSubImage2D CompressedTextureSubImage2D} */
	public static void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
	}

	// --- [ glCompressedTextureSubImage3D ] ---

	/** JNI method for {@link #glCompressedTextureSubImage3D CompressedTextureSubImage3D} */
	@JavadocExclude
	public static native void nglCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data, long __functionAddress);

	/** Unsafe version of {@link #glCompressedTextureSubImage3D CompressedTextureSubImage3D} */
	@JavadocExclude
	public static void nglCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
		long __functionAddress = getInstance().CompressedTextureSubImage3D;
		nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data, __functionAddress);
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
	 * @param format    the format of the compressed image data stored at address {@code data}. One of:<br>{@link GL30#GL_COMPRESSED_RED_RGTC1 COMPRESSED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_SIGNED_RED_RGTC1 COMPRESSED_SIGNED_RED_RGTC1}, {@link GL30#GL_COMPRESSED_RG_RGTC2 COMPRESSED_RG_RGTC2}, {@link GL30#GL_COMPRESSED_SIGNED_RG_RGTC2 COMPRESSED_SIGNED_RG_RGTC2}, {@link GL42#GL_COMPRESSED_RGBA_BPTC_UNORM COMPRESSED_RGBA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM COMPRESSED_SRGB_ALPHA_BPTC_UNORM}, {@link GL42#GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT COMPRESSED_RGB_BPTC_SIGNED_FLOAT}, {@link GL42#GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT}, {@link GL43#GL_COMPRESSED_RGB8_ETC2 COMPRESSED_RGB8_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_ETC2 COMPRESSED_SRGB8_ETC2}, {@link GL43#GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2}, {@link GL43#GL_COMPRESSED_RGBA8_ETC2_EAC COMPRESSED_RGBA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC COMPRESSED_SRGB8_ALPHA8_ETC2_EAC}, {@link GL43#GL_COMPRESSED_R11_EAC COMPRESSED_R11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_R11_EAC COMPRESSED_SIGNED_R11_EAC}, {@link GL43#GL_COMPRESSED_RG11_EAC COMPRESSED_RG11_EAC}, {@link GL43#GL_COMPRESSED_SIGNED_RG11_EAC COMPRESSED_SIGNED_RG11_EAC}, see {@link EXTTextureCompressionS3TC}, see {@link EXTTextureCompressionLATC}, see {@link ATITextureCompression3DC}, see {@link KHRTextureCompressionASTCLDR}
	 * @param imageSize the number of unsigned bytes of image data starting at the address specified by {@code data}
	 * @param data      a pointer to the compressed image data
	 */
	public static void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(data, imageSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, memAddress(data));
	}

	/** Buffer object offset version of: {@link #glCompressedTextureSubImage3D CompressedTextureSubImage3D} */
	public static void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long dataOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, true);
		nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, dataOffset);
	}

	/** Alternative version of: {@link #glCompressedTextureSubImage3D CompressedTextureSubImage3D} */
	public static void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
	}

	// --- [ glCopyTextureSubImage1D ] ---

	/** JNI method for {@link #glCopyTextureSubImage1D CopyTextureSubImage1D} */
	@JavadocExclude
	public static native void nglCopyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width, long __functionAddress);

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
		long __functionAddress = getInstance().CopyTextureSubImage1D;
		nglCopyTextureSubImage1D(texture, level, xoffset, x, y, width, __functionAddress);
	}

	// --- [ glCopyTextureSubImage2D ] ---

	/** JNI method for {@link #glCopyTextureSubImage2D CopyTextureSubImage2D} */
	@JavadocExclude
	public static native void nglCopyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height, long __functionAddress);

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
		long __functionAddress = getInstance().CopyTextureSubImage2D;
		nglCopyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height, __functionAddress);
	}

	// --- [ glCopyTextureSubImage3D ] ---

	/** JNI method for {@link #glCopyTextureSubImage3D CopyTextureSubImage3D} */
	@JavadocExclude
	public static native void nglCopyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height, long __functionAddress);

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
		long __functionAddress = getInstance().CopyTextureSubImage3D;
		nglCopyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height, __functionAddress);
	}

	// --- [ glTextureParameterf ] ---

	/** JNI method for {@link #glTextureParameterf TextureParameterf} */
	@JavadocExclude
	public static native void nglTextureParameterf(int texture, int pname, float param, long __functionAddress);

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
		long __functionAddress = getInstance().TextureParameterf;
		nglTextureParameterf(texture, pname, param, __functionAddress);
	}

	// --- [ glTextureParameterfv ] ---

	/** JNI method for {@link #glTextureParameterfv TextureParameterfv} */
	@JavadocExclude
	public static native void nglTextureParameterfv(int texture, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTextureParameterfv TextureParameterfv} */
	@JavadocExclude
	public static void nglTextureParameterfv(int texture, int pname, long params) {
		long __functionAddress = getInstance().TextureParameterfv;
		nglTextureParameterfv(texture, pname, params, __functionAddress);
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
	public static void glTextureParameterfv(int texture, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglTextureParameterfv(texture, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTextureParameterfv TextureParameterfv} */
	public static void glTextureParameterfv(int texture, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglTextureParameterfv(texture, pname, memAddress(params));
	}

	// --- [ glTextureParameteri ] ---

	/** JNI method for {@link #glTextureParameteri TextureParameteri} */
	@JavadocExclude
	public static native void nglTextureParameteri(int texture, int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureParameteri.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glTexParameteri TexParameteri}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to set. One of:<br>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}, {@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}, {@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}, {@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}, {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}, {@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}, {@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}, {@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}, {@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}, {@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}, {@link GL11#GL_TEXTURE_PRIORITY TEXTURE_PRIORITY}, {@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}, {@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}, {@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}, {@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}, {@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}, {@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}, {@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}, {@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}, {@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}, {@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}
	 * @param param   the parameter value
	 */
	public static void glTextureParameteri(int texture, int pname, int param) {
		long __functionAddress = getInstance().TextureParameteri;
		nglTextureParameteri(texture, pname, param, __functionAddress);
	}

	// --- [ glTextureParameterIiv ] ---

	/** JNI method for {@link #glTextureParameterIiv TextureParameterIiv} */
	@JavadocExclude
	public static native void nglTextureParameterIiv(int texture, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTextureParameterIiv TextureParameterIiv} */
	@JavadocExclude
	public static void nglTextureParameterIiv(int texture, int pname, long params) {
		long __functionAddress = getInstance().TextureParameterIiv;
		nglTextureParameterIiv(texture, pname, params, __functionAddress);
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
	public static void glTextureParameterIiv(int texture, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglTextureParameterIiv(texture, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTextureParameterIiv TextureParameterIiv} */
	public static void glTextureParameterIiv(int texture, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglTextureParameterIiv(texture, pname, memAddress(params));
	}

	/** Single value version of: {@link #glTextureParameterIiv TextureParameterIiv} */
	public static void glTextureParameterIi(int texture, int pname, int param) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		nglTextureParameterIiv(texture, pname, __buffer.address(params));
	}

	// --- [ glTextureParameterIuiv ] ---

	/** JNI method for {@link #glTextureParameterIuiv TextureParameterIuiv} */
	@JavadocExclude
	public static native void nglTextureParameterIuiv(int texture, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTextureParameterIuiv TextureParameterIuiv} */
	@JavadocExclude
	public static void nglTextureParameterIuiv(int texture, int pname, long params) {
		long __functionAddress = getInstance().TextureParameterIuiv;
		nglTextureParameterIuiv(texture, pname, params, __functionAddress);
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
	public static void glTextureParameterIuiv(int texture, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglTextureParameterIuiv(texture, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTextureParameterIuiv TextureParameterIuiv} */
	public static void glTextureParameterIuiv(int texture, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglTextureParameterIuiv(texture, pname, memAddress(params));
	}

	/** Single value version of: {@link #glTextureParameterIuiv TextureParameterIuiv} */
	public static void glTextureParameterIui(int texture, int pname, int param) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam(param);
		nglTextureParameterIuiv(texture, pname, __buffer.address(params));
	}

	// --- [ glTextureParameteriv ] ---

	/** JNI method for {@link #glTextureParameteriv TextureParameteriv} */
	@JavadocExclude
	public static native void nglTextureParameteriv(int texture, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glTextureParameteriv TextureParameteriv} */
	@JavadocExclude
	public static void nglTextureParameteriv(int texture, int pname, long params) {
		long __functionAddress = getInstance().TextureParameteriv;
		nglTextureParameteriv(texture, pname, params, __functionAddress);
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
	public static void glTextureParameteriv(int texture, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglTextureParameteriv(texture, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glTextureParameteriv TextureParameteriv} */
	public static void glTextureParameteriv(int texture, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglTextureParameteriv(texture, pname, memAddress(params));
	}

	// --- [ glGenerateTextureMipmap ] ---

	/** JNI method for {@link #glGenerateTextureMipmap GenerateTextureMipmap} */
	@JavadocExclude
	public static native void nglGenerateTextureMipmap(int texture, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenerateTextureMipmap.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL30#glGenerateMipmap GenerateMipmap}.
	 *
	 * @param texture the texture name
	 */
	public static void glGenerateTextureMipmap(int texture) {
		long __functionAddress = getInstance().GenerateTextureMipmap;
		nglGenerateTextureMipmap(texture, __functionAddress);
	}

	// --- [ glBindTextureUnit ] ---

	/** JNI method for {@link #glBindTextureUnit BindTextureUnit} */
	@JavadocExclude
	public static native void nglBindTextureUnit(int unit, int texture, long __functionAddress);

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
		long __functionAddress = getInstance().BindTextureUnit;
		nglBindTextureUnit(unit, texture, __functionAddress);
	}

	// --- [ glGetTextureImage ] ---

	/** JNI method for {@link #glGetTextureImage GetTextureImage} */
	@JavadocExclude
	public static native void nglGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureImage GetTextureImage} */
	@JavadocExclude
	public static void nglGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels) {
		long __functionAddress = getInstance().GetTextureImage;
		nglGetTextureImage(texture, level, format, type, bufSize, pixels, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureImage.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexImage GetTexImage}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param format  the pixel format. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the pixel type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param bufSize the size of the buffer to receive the retrieved pixel data
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void glGetTextureImage(int texture, int level, int format, int type, int bufSize, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pixels, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetTextureImage(texture, level, format, type, bufSize, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetTextureImage(texture, level, format, type, bufSize, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining() << 1, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining() << 3, memAddress(pixels));
	}

	// --- [ glGetCompressedTextureImage ] ---

	/** JNI method for {@link #glGetCompressedTextureImage GetCompressedTextureImage} */
	@JavadocExclude
	public static native void nglGetCompressedTextureImage(int texture, int level, int bufSize, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glGetCompressedTextureImage GetCompressedTextureImage} */
	@JavadocExclude
	public static void nglGetCompressedTextureImage(int texture, int level, int bufSize, long pixels) {
		long __functionAddress = getInstance().GetCompressedTextureImage;
		nglGetCompressedTextureImage(texture, level, bufSize, pixels, __functionAddress);
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
	public static void glGetCompressedTextureImage(int texture, int level, int bufSize, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pixels, bufSize);
			if ( LWJGLUtil.DEBUG )
				checkBuffer(pixels, glGetTextureLevelParameteri(texture, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetCompressedTextureImage(texture, level, bufSize, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glGetCompressedTextureImage GetCompressedTextureImage} */
	public static void glGetCompressedTextureImage(int texture, int level, int bufSize, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetCompressedTextureImage(texture, level, bufSize, pixelsOffset);
	}

	/** Alternative version of: {@link #glGetCompressedTextureImage GetCompressedTextureImage} */
	public static void glGetCompressedTextureImage(int texture, int level, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS ) {
			if ( LWJGLUtil.DEBUG )
				checkBuffer(pixels, glGetTextureLevelParameteri(texture, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetCompressedTextureImage(texture, level, pixels.remaining(), memAddress(pixels));
	}

	// --- [ glGetTextureLevelParameterfv ] ---

	/** JNI method for {@link #glGetTextureLevelParameterfv GetTextureLevelParameterfv} */
	@JavadocExclude
	public static native void nglGetTextureLevelParameterfv(int texture, int level, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureLevelParameterfv GetTextureLevelParameterfv} */
	@JavadocExclude
	public static void nglGetTextureLevelParameterfv(int texture, int level, int pname, long params) {
		long __functionAddress = getInstance().GetTextureLevelParameterfv;
		nglGetTextureLevelParameterfv(texture, level, pname, params, __functionAddress);
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
	public static void glGetTextureLevelParameterfv(int texture, int level, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTextureLevelParameterfv(texture, level, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTextureLevelParameterfv GetTextureLevelParameterfv} */
	public static void glGetTextureLevelParameterfv(int texture, int level, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTextureLevelParameterfv(texture, level, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTextureLevelParameterfv GetTextureLevelParameterfv} */
	public static float glGetTextureLevelParameterf(int texture, int level, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetTextureLevelParameterfv(texture, level, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetTextureLevelParameteriv ] ---

	/** JNI method for {@link #glGetTextureLevelParameteriv GetTextureLevelParameteriv} */
	@JavadocExclude
	public static native void nglGetTextureLevelParameteriv(int texture, int level, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureLevelParameteriv GetTextureLevelParameteriv} */
	@JavadocExclude
	public static void nglGetTextureLevelParameteriv(int texture, int level, int pname, long params) {
		long __functionAddress = getInstance().GetTextureLevelParameteriv;
		nglGetTextureLevelParameteriv(texture, level, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureLevelParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexLevelParameteriv GetTexLevelParameteriv}.
	 *
	 * @param texture the texture name
	 * @param level   the level-of-detail number
	 * @param pname   the parameter to query. One of:<br>{@link GL11#GL_TEXTURE_WIDTH TEXTURE_WIDTH}, {@link GL11#GL_TEXTURE_HEIGHT TEXTURE_HEIGHT}, {@link GL12#GL_TEXTURE_DEPTH TEXTURE_DEPTH}, {@link GL11#GL_TEXTURE_BORDER TEXTURE_BORDER}, {@link GL32#GL_TEXTURE_SAMPLES TEXTURE_SAMPLES}, {@link GL32#GL_TEXTURE_FIXED_SAMPLE_LOCATIONS TEXTURE_FIXED_SAMPLE_LOCATIONS}, {@link GL11#GL_TEXTURE_INTERNAL_FORMAT TEXTURE_INTERNAL_FORMAT}, {@link GL11#GL_TEXTURE_RED_SIZE TEXTURE_RED_SIZE}, {@link GL11#GL_TEXTURE_GREEN_SIZE TEXTURE_GREEN_SIZE}, {@link GL11#GL_TEXTURE_BLUE_SIZE TEXTURE_BLUE_SIZE}, {@link GL11#GL_TEXTURE_ALPHA_SIZE TEXTURE_ALPHA_SIZE}, {@link GL11#GL_TEXTURE_LUMINANCE_SIZE TEXTURE_LUMINANCE_SIZE}, {@link GL11#GL_TEXTURE_INTENSITY_SIZE TEXTURE_INTENSITY_SIZE}, {@link GL14#GL_TEXTURE_DEPTH_SIZE TEXTURE_DEPTH_SIZE}, {@link GL30#GL_TEXTURE_STENCIL_SIZE TEXTURE_STENCIL_SIZE}, {@link GL30#GL_TEXTURE_SHARED_SIZE TEXTURE_SHARED_SIZE}, {@link GL30#GL_TEXTURE_RED_TYPE TEXTURE_RED_TYPE}, {@link GL30#GL_TEXTURE_GREEN_TYPE TEXTURE_GREEN_TYPE}, {@link GL30#GL_TEXTURE_BLUE_TYPE TEXTURE_BLUE_TYPE}, {@link GL30#GL_TEXTURE_ALPHA_TYPE TEXTURE_ALPHA_TYPE}, {@link GL30#GL_TEXTURE_LUMINANCE_TYPE TEXTURE_LUMINANCE_TYPE}, {@link GL30#GL_TEXTURE_INTENSITY_TYPE TEXTURE_INTENSITY_TYPE}, {@link GL30#GL_TEXTURE_DEPTH_TYPE TEXTURE_DEPTH_TYPE}, {@link GL13#GL_TEXTURE_COMPRESSED TEXTURE_COMPRESSED}, {@link GL13#GL_TEXTURE_COMPRESSED_IMAGE_SIZE TEXTURE_COMPRESSED_IMAGE_SIZE}, {@link GL31#GL_TEXTURE_BUFFER_DATA_STORE_BINDING TEXTURE_BUFFER_DATA_STORE_BINDING}, {@link GL43#GL_TEXTURE_BUFFER_OFFSET TEXTURE_BUFFER_OFFSET}, {@link GL43#GL_TEXTURE_BUFFER_SIZE TEXTURE_BUFFER_SIZE}
	 * @param params  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTextureLevelParameteriv(int texture, int level, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTextureLevelParameteriv(texture, level, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTextureLevelParameteriv GetTextureLevelParameteriv} */
	public static void glGetTextureLevelParameteriv(int texture, int level, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTextureLevelParameteriv(texture, level, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTextureLevelParameteriv GetTextureLevelParameteriv} */
	public static int glGetTextureLevelParameteri(int texture, int level, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTextureLevelParameteriv(texture, level, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetTextureParameterfv ] ---

	/** JNI method for {@link #glGetTextureParameterfv GetTextureParameterfv} */
	@JavadocExclude
	public static native void nglGetTextureParameterfv(int texture, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureParameterfv GetTextureParameterfv} */
	@JavadocExclude
	public static void nglGetTextureParameterfv(int texture, int pname, long params) {
		long __functionAddress = getInstance().GetTextureParameterfv;
		nglGetTextureParameterfv(texture, pname, params, __functionAddress);
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
	public static void glGetTextureParameterfv(int texture, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTextureParameterfv(texture, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTextureParameterfv GetTextureParameterfv} */
	public static void glGetTextureParameterfv(int texture, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTextureParameterfv(texture, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTextureParameterfv GetTextureParameterfv} */
	public static float glGetTextureParameterf(int texture, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetTextureParameterfv(texture, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetTextureParameterIiv ] ---

	/** JNI method for {@link #glGetTextureParameterIiv GetTextureParameterIiv} */
	@JavadocExclude
	public static native void nglGetTextureParameterIiv(int texture, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureParameterIiv GetTextureParameterIiv} */
	@JavadocExclude
	public static void nglGetTextureParameterIiv(int texture, int pname, long params) {
		long __functionAddress = getInstance().GetTextureParameterIiv;
		nglGetTextureParameterIiv(texture, pname, params, __functionAddress);
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
	public static void glGetTextureParameterIiv(int texture, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTextureParameterIiv(texture, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTextureParameterIiv GetTextureParameterIiv} */
	public static void glGetTextureParameterIiv(int texture, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTextureParameterIiv(texture, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTextureParameterIiv GetTextureParameterIiv} */
	public static int glGetTextureParameterIi(int texture, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTextureParameterIiv(texture, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetTextureParameterIuiv ] ---

	/** JNI method for {@link #glGetTextureParameterIuiv GetTextureParameterIuiv} */
	@JavadocExclude
	public static native void nglGetTextureParameterIuiv(int texture, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureParameterIuiv GetTextureParameterIuiv} */
	@JavadocExclude
	public static void nglGetTextureParameterIuiv(int texture, int pname, long params) {
		long __functionAddress = getInstance().GetTextureParameterIuiv;
		nglGetTextureParameterIuiv(texture, pname, params, __functionAddress);
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
	public static void glGetTextureParameterIuiv(int texture, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTextureParameterIuiv(texture, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTextureParameterIuiv GetTextureParameterIuiv} */
	public static void glGetTextureParameterIuiv(int texture, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTextureParameterIuiv(texture, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTextureParameterIuiv GetTextureParameterIuiv} */
	public static int glGetTextureParameterIui(int texture, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTextureParameterIuiv(texture, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetTextureParameteriv ] ---

	/** JNI method for {@link #glGetTextureParameteriv GetTextureParameteriv} */
	@JavadocExclude
	public static native void nglGetTextureParameteriv(int texture, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureParameteriv GetTextureParameteriv} */
	@JavadocExclude
	public static void nglGetTextureParameteriv(int texture, int pname, long params) {
		long __functionAddress = getInstance().GetTextureParameteriv;
		nglGetTextureParameteriv(texture, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetTextureParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL11#glGetTexParameteriv GetTexParameteriv}.
	 *
	 * @param texture the texture name
	 * @param pname   the parameter to query. One of:<br>{@link GL12#GL_TEXTURE_BASE_LEVEL TEXTURE_BASE_LEVEL}, {@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}, {@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}, {@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}, {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}, {@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}, {@link GL12#GL_TEXTURE_MAX_LEVEL TEXTURE_MAX_LEVEL}, {@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}, {@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}, {@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}, {@link GL11#GL_TEXTURE_PRIORITY TEXTURE_PRIORITY}, {@link GL33#GL_TEXTURE_SWIZZLE_R TEXTURE_SWIZZLE_R}, {@link GL33#GL_TEXTURE_SWIZZLE_G TEXTURE_SWIZZLE_G}, {@link GL33#GL_TEXTURE_SWIZZLE_B TEXTURE_SWIZZLE_B}, {@link GL33#GL_TEXTURE_SWIZZLE_A TEXTURE_SWIZZLE_A}, {@link GL33#GL_TEXTURE_SWIZZLE_RGBA TEXTURE_SWIZZLE_RGBA}, {@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}, {@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}, {@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}, {@link GL14#GL_DEPTH_TEXTURE_MODE DEPTH_TEXTURE_MODE}, {@link GL14#GL_GENERATE_MIPMAP GENERATE_MIPMAP}, {@link GL42#GL_IMAGE_FORMAT_COMPATIBILITY_TYPE IMAGE_FORMAT_COMPATIBILITY_TYPE}, {@link GL42#GL_TEXTURE_IMMUTABLE_FORMAT TEXTURE_IMMUTABLE_FORMAT}, {@link GL43#GL_TEXTURE_IMMUTABLE_LEVELS TEXTURE_IMMUTABLE_LEVELS}, {@link GL43#GL_TEXTURE_VIEW_MIN_LEVEL TEXTURE_VIEW_MIN_LEVEL}, {@link GL43#GL_TEXTURE_VIEW_NUM_LEVELS TEXTURE_VIEW_NUM_LEVELS}, {@link GL43#GL_TEXTURE_VIEW_MIN_LAYER TEXTURE_VIEW_MIN_LAYER}, {@link GL43#GL_TEXTURE_VIEW_NUM_LAYERS TEXTURE_VIEW_NUM_LAYERS}, {@link GL11#GL_TEXTURE_RESIDENT TEXTURE_RESIDENT}
	 * @param params  a scalar or buffer in which to place the returned data
	 */
	public static void glGetTextureParameteriv(int texture, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetTextureParameteriv(texture, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetTextureParameteriv GetTextureParameteriv} */
	public static void glGetTextureParameteriv(int texture, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetTextureParameteriv(texture, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetTextureParameteriv GetTextureParameteriv} */
	public static int glGetTextureParameteri(int texture, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetTextureParameteriv(texture, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glCreateVertexArrays ] ---

	/** JNI method for {@link #glCreateVertexArrays CreateVertexArrays} */
	@JavadocExclude
	public static native void nglCreateVertexArrays(int n, long arrays, long __functionAddress);

	/** Unsafe version of {@link #glCreateVertexArrays CreateVertexArrays} */
	@JavadocExclude
	public static void nglCreateVertexArrays(int n, long arrays) {
		long __functionAddress = getInstance().CreateVertexArrays;
		nglCreateVertexArrays(n, arrays, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateVertexArrays.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused vertex array object names in {@code arrays}.
	 *
	 * @param n      the number of vertex array object names to create
	 * @param arrays the buffer in which to return the created vertex array object names
	 */
	public static void glCreateVertexArrays(int n, ByteBuffer arrays) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(arrays, n << 2);
		nglCreateVertexArrays(n, memAddress(arrays));
	}

	/** Alternative version of: {@link #glCreateVertexArrays CreateVertexArrays} */
	public static void glCreateVertexArrays(IntBuffer arrays) {
		nglCreateVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	/** Single return value version of: {@link #glCreateVertexArrays CreateVertexArrays} */
	public static int glCreateVertexArrays() {
		APIBuffer __buffer = apiBuffer();
		int arrays = __buffer.intParam();
		nglCreateVertexArrays(1, __buffer.address(arrays));
		return __buffer.intValue(arrays);
	}

	// --- [ glDisableVertexArrayAttrib ] ---

	/** JNI method for {@link #glDisableVertexArrayAttrib DisableVertexArrayAttrib} */
	@JavadocExclude
	public static native void nglDisableVertexArrayAttrib(int vaobj, int index, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDisableVertexArrayAttrib.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL20#glDisableVertexAttribArray DisableVertexAttribArray}.
	 *
	 * @param vaobj the vertex array object name
	 * @param index the index of the generic vertex attribute to be disabled
	 */
	public static void glDisableVertexArrayAttrib(int vaobj, int index) {
		long __functionAddress = getInstance().DisableVertexArrayAttrib;
		nglDisableVertexArrayAttrib(vaobj, index, __functionAddress);
	}

	// --- [ glEnableVertexArrayAttrib ] ---

	/** JNI method for {@link #glEnableVertexArrayAttrib EnableVertexArrayAttrib} */
	@JavadocExclude
	public static native void nglEnableVertexArrayAttrib(int vaobj, int index, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glEnableVertexArrayAttrib.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL20#glEnableVertexAttribArray EnableVertexAttribArray}.
	 *
	 * @param vaobj the vertex array object name
	 * @param index the index of the generic vertex attribute to be enabled
	 */
	public static void glEnableVertexArrayAttrib(int vaobj, int index) {
		long __functionAddress = getInstance().EnableVertexArrayAttrib;
		nglEnableVertexArrayAttrib(vaobj, index, __functionAddress);
	}

	// --- [ glVertexArrayElementBuffer ] ---

	/** JNI method for {@link #glVertexArrayElementBuffer VertexArrayElementBuffer} */
	@JavadocExclude
	public static native void nglVertexArrayElementBuffer(int vaobj, int buffer, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayElementBuffer.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a buffer object to the element array buffer bind point of a vertex array object.
	 *
	 * @param vaobj  the vertex array object name
	 * @param buffer the buffer object name. If {@code buffer} is zero, any existing element array buffer binding to {@code vaobj} is removed.
	 */
	public static void glVertexArrayElementBuffer(int vaobj, int buffer) {
		long __functionAddress = getInstance().VertexArrayElementBuffer;
		nglVertexArrayElementBuffer(vaobj, buffer, __functionAddress);
	}

	// --- [ glVertexArrayVertexBuffer ] ---

	/** JNI method for {@link #glVertexArrayVertexBuffer VertexArrayVertexBuffer} */
	@JavadocExclude
	public static native void nglVertexArrayVertexBuffer(int vaobj, int bindingindex, int buffer, long offset, int stride, long __functionAddress);

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
		long __functionAddress = getInstance().VertexArrayVertexBuffer;
		nglVertexArrayVertexBuffer(vaobj, bindingindex, buffer, offset, stride, __functionAddress);
	}

	// --- [ glVertexArrayVertexBuffers ] ---

	/** JNI method for {@link #glVertexArrayVertexBuffers VertexArrayVertexBuffers} */
	@JavadocExclude
	public static native void nglVertexArrayVertexBuffers(int vaobj, int first, int count, long buffers, long offsets, long strides, long __functionAddress);

	/** Unsafe version of {@link #glVertexArrayVertexBuffers VertexArrayVertexBuffers} */
	@JavadocExclude
	public static void nglVertexArrayVertexBuffers(int vaobj, int first, int count, long buffers, long offsets, long strides) {
		long __functionAddress = getInstance().VertexArrayVertexBuffers;
		nglVertexArrayVertexBuffers(vaobj, first, count, buffers, offsets, strides, __functionAddress);
	}

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
	public static void glVertexArrayVertexBuffers(int vaobj, int first, int count, ByteBuffer buffers, ByteBuffer offsets, ByteBuffer strides) {
		if ( LWJGLUtil.CHECKS ) {
			if ( buffers != null ) checkBuffer(buffers, count << 2);
			if ( offsets != null ) checkBuffer(offsets, count << POINTER_SHIFT);
			if ( strides != null ) checkBuffer(strides, count << 2);
		}
		nglVertexArrayVertexBuffers(vaobj, first, count, memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(strides));
	}

	/** Alternative version of: {@link #glVertexArrayVertexBuffers VertexArrayVertexBuffers} */
	public static void glVertexArrayVertexBuffers(int vaobj, int first, IntBuffer buffers, PointerBuffer offsets, IntBuffer strides) {
		if ( LWJGLUtil.CHECKS ) {
			if ( offsets != null ) checkBuffer(offsets, buffers.remaining());
			if ( strides != null ) checkBuffer(strides, buffers.remaining());
		}
		nglVertexArrayVertexBuffers(vaobj, first, buffers == null ? 0 : buffers.remaining(), memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(strides));
	}

	// --- [ glVertexArrayAttribFormat ] ---

	/** JNI method for {@link #glVertexArrayAttribFormat VertexArrayAttribFormat} */
	@JavadocExclude
	public static native void nglVertexArrayAttribFormat(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayAttribFormat.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glVertexAttribFormat VertexAttribFormat}.
	 *
	 * @param vaobj          the vertex array object name
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param normalized     if true then integer data is normalized to the range [-1, 1] or [0, 1] if it is signed or unsigned, respectively. If false then integer data is
	 *                       directly converted to floating point.
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexArrayAttribFormat(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) {
		long __functionAddress = getInstance().VertexArrayAttribFormat;
		nglVertexArrayAttribFormat(vaobj, attribindex, size, type, normalized, relativeoffset, __functionAddress);
	}

	// --- [ glVertexArrayAttribIFormat ] ---

	/** JNI method for {@link #glVertexArrayAttribIFormat VertexArrayAttribIFormat} */
	@JavadocExclude
	public static native void nglVertexArrayAttribIFormat(int vaobj, int attribindex, int size, int type, int relativeoffset, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayAttribIFormat.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glVertexAttribIFormat VertexAttribIFormat}.
	 *
	 * @param vaobj          the vertex array object name
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexArrayAttribIFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = getInstance().VertexArrayAttribIFormat;
		nglVertexArrayAttribIFormat(vaobj, attribindex, size, type, relativeoffset, __functionAddress);
	}

	// --- [ glVertexArrayAttribLFormat ] ---

	/** JNI method for {@link #glVertexArrayAttribLFormat VertexArrayAttribLFormat} */
	@JavadocExclude
	public static native void nglVertexArrayAttribLFormat(int vaobj, int attribindex, int size, int type, int relativeoffset, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexArrayAttribLFormat.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * DSA version of {@link GL43#glVertexAttribLFormat VertexAttribLFormat}.
	 *
	 * @param vaobj          the vertex array object name
	 * @param attribindex    the generic vertex attribute array being described
	 * @param size           the number of values per vertex that are stored in the array. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type           the type of the data stored in the array
	 * @param relativeoffset the offset, measured in basic machine units of the first element relative to the start of the vertex buffer binding this attribute fetches from
	 */
	public static void glVertexArrayAttribLFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
		long __functionAddress = getInstance().VertexArrayAttribLFormat;
		nglVertexArrayAttribLFormat(vaobj, attribindex, size, type, relativeoffset, __functionAddress);
	}

	// --- [ glVertexArrayAttribBinding ] ---

	/** JNI method for {@link #glVertexArrayAttribBinding VertexArrayAttribBinding} */
	@JavadocExclude
	public static native void nglVertexArrayAttribBinding(int vaobj, int attribindex, int bindingindex, long __functionAddress);

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
		long __functionAddress = getInstance().VertexArrayAttribBinding;
		nglVertexArrayAttribBinding(vaobj, attribindex, bindingindex, __functionAddress);
	}

	// --- [ glVertexArrayBindingDivisor ] ---

	/** JNI method for {@link #glVertexArrayBindingDivisor VertexArrayBindingDivisor} */
	@JavadocExclude
	public static native void nglVertexArrayBindingDivisor(int vaobj, int bindingindex, int divisor, long __functionAddress);

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
		long __functionAddress = getInstance().VertexArrayBindingDivisor;
		nglVertexArrayBindingDivisor(vaobj, bindingindex, divisor, __functionAddress);
	}

	// --- [ glGetVertexArrayiv ] ---

	/** JNI method for {@link #glGetVertexArrayiv GetVertexArrayiv} */
	@JavadocExclude
	public static native void nglGetVertexArrayiv(int vaobj, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexArrayiv GetVertexArrayiv} */
	@JavadocExclude
	public static void nglGetVertexArrayiv(int vaobj, int pname, long param) {
		long __functionAddress = getInstance().GetVertexArrayiv;
		nglGetVertexArrayiv(vaobj, pname, param, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArray.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries parameters of a vertex array object.
	 *
	 * @param vaobj the vertex array object name
	 * @param pname the parameter to query. Must be:<br>{@link GL15#GL_ELEMENT_ARRAY_BUFFER_BINDING ELEMENT_ARRAY_BUFFER_BINDING}
	 * @param param the buffer in which to return the parameter values
	 */
	public static void glGetVertexArrayiv(int vaobj, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << 2);
		nglGetVertexArrayiv(vaobj, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glGetVertexArrayiv GetVertexArrayiv} */
	public static void glGetVertexArrayiv(int vaobj, int pname, IntBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglGetVertexArrayiv(vaobj, pname, memAddress(param));
	}

	/** Single return value version of: {@link #glGetVertexArrayiv GetVertexArrayiv} */
	public static int glGetVertexArrayi(int vaobj, int pname) {
		APIBuffer __buffer = apiBuffer();
		int param = __buffer.intParam();
		nglGetVertexArrayiv(vaobj, pname, __buffer.address(param));
		return __buffer.intValue(param);
	}

	// --- [ glGetVertexArrayIndexediv ] ---

	/** JNI method for {@link #glGetVertexArrayIndexediv GetVertexArrayIndexediv} */
	@JavadocExclude
	public static native void nglGetVertexArrayIndexediv(int vaobj, int index, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexArrayIndexediv GetVertexArrayIndexediv} */
	@JavadocExclude
	public static void nglGetVertexArrayIndexediv(int vaobj, int index, int pname, long param) {
		long __functionAddress = getInstance().GetVertexArrayIndexediv;
		nglGetVertexArrayIndexediv(vaobj, index, pname, param, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArrayIndexed.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries parameters of an attribute of a vertex array object.
	 *
	 * @param vaobj the vertex array object name
	 * @param index the attribute to query
	 * @param pname the parameter to query. One of:<br>{@link GL20#GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}, {@link GL20#GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE},, {@link GL20#GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}, {@link GL20#GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}, {@link GL20#GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}, {@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}, {@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}, {@link GL43#GL_VERTEX_ATTRIB_ARRAY_LONG VERTEX_ATTRIB_ARRAY_LONG}, {@link GL43#GL_VERTEX_ATTRIB_RELATIVE_OFFSET VERTEX_ATTRIB_RELATIVE_OFFSET}
	 * @param param the buffer in which to return the parameter values
	 */
	public static void glGetVertexArrayIndexediv(int vaobj, int index, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << 2);
		nglGetVertexArrayIndexediv(vaobj, index, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glGetVertexArrayIndexediv GetVertexArrayIndexediv} */
	public static void glGetVertexArrayIndexediv(int vaobj, int index, int pname, IntBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglGetVertexArrayIndexediv(vaobj, index, pname, memAddress(param));
	}

	/** Single return value version of: {@link #glGetVertexArrayIndexediv GetVertexArrayIndexediv} */
	public static int glGetVertexArrayIndexedi(int vaobj, int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int param = __buffer.intParam();
		nglGetVertexArrayIndexediv(vaobj, index, pname, __buffer.address(param));
		return __buffer.intValue(param);
	}

	// --- [ glGetVertexArrayIndexed64iv ] ---

	/** JNI method for {@link #glGetVertexArrayIndexed64iv GetVertexArrayIndexed64iv} */
	@JavadocExclude
	public static native void nglGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long param, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexArrayIndexed64iv GetVertexArrayIndexed64iv} */
	@JavadocExclude
	public static void nglGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long param) {
		long __functionAddress = getInstance().GetVertexArrayIndexed64iv;
		nglGetVertexArrayIndexed64iv(vaobj, index, pname, param, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetVertexArrayIndexed64i.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries parameters of an attribute of a vertex array object.
	 *
	 * @param vaobj the vertex array object name
	 * @param index the attribute to query
	 * @param pname the parameter to query. Must be:<br>{@link GL43#GL_VERTEX_BINDING_OFFSET VERTEX_BINDING_OFFSET}
	 * @param param the buffer in which to return the parameter values
	 */
	public static void glGetVertexArrayIndexed64iv(int vaobj, int index, int pname, ByteBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1 << 3);
		nglGetVertexArrayIndexed64iv(vaobj, index, pname, memAddress(param));
	}

	/** Alternative version of: {@link #glGetVertexArrayIndexed64iv GetVertexArrayIndexed64iv} */
	public static void glGetVertexArrayIndexed64iv(int vaobj, int index, int pname, LongBuffer param) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(param, 1);
		nglGetVertexArrayIndexed64iv(vaobj, index, pname, memAddress(param));
	}

	/** Single return value version of: {@link #glGetVertexArrayIndexed64iv GetVertexArrayIndexed64iv} */
	public static long glGetVertexArrayIndexed64i(int vaobj, int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int param = __buffer.longParam();
		nglGetVertexArrayIndexed64iv(vaobj, index, pname, __buffer.address(param));
		return __buffer.longValue(param);
	}

	// --- [ glCreateSamplers ] ---

	/** JNI method for {@link #glCreateSamplers CreateSamplers} */
	@JavadocExclude
	public static native void nglCreateSamplers(int n, long samplers, long __functionAddress);

	/** Unsafe version of {@link #glCreateSamplers CreateSamplers} */
	@JavadocExclude
	public static void nglCreateSamplers(int n, long samplers) {
		long __functionAddress = getInstance().CreateSamplers;
		nglCreateSamplers(n, samplers, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object.
	 *
	 * @param n        the number of sampler object names to create
	 * @param samplers the buffer in which to return the created sampler object names
	 */
	public static void glCreateSamplers(int n, ByteBuffer samplers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(samplers, n << 2);
		nglCreateSamplers(n, memAddress(samplers));
	}

	/** Alternative version of: {@link #glCreateSamplers CreateSamplers} */
	public static void glCreateSamplers(IntBuffer samplers) {
		nglCreateSamplers(samplers.remaining(), memAddress(samplers));
	}

	/** Single return value version of: {@link #glCreateSamplers CreateSamplers} */
	public static int glCreateSamplers() {
		APIBuffer __buffer = apiBuffer();
		int samplers = __buffer.intParam();
		nglCreateSamplers(1, __buffer.address(samplers));
		return __buffer.intValue(samplers);
	}

	// --- [ glCreateProgramPipelines ] ---

	/** JNI method for {@link #glCreateProgramPipelines CreateProgramPipelines} */
	@JavadocExclude
	public static native void nglCreateProgramPipelines(int n, long pipelines, long __functionAddress);

	/** Unsafe version of {@link #glCreateProgramPipelines CreateProgramPipelines} */
	@JavadocExclude
	public static void nglCreateProgramPipelines(int n, long pipelines) {
		long __functionAddress = getInstance().CreateProgramPipelines;
		nglCreateProgramPipelines(n, pipelines, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateProgramPipelines.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object.
	 *
	 * @param n         the number of program pipeline names to create
	 * @param pipelines the buffer in which to return the created program pipeline names
	 */
	public static void glCreateProgramPipelines(int n, ByteBuffer pipelines) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pipelines, n << 2);
		nglCreateProgramPipelines(n, memAddress(pipelines));
	}

	/** Alternative version of: {@link #glCreateProgramPipelines CreateProgramPipelines} */
	public static void glCreateProgramPipelines(IntBuffer pipelines) {
		nglCreateProgramPipelines(pipelines.remaining(), memAddress(pipelines));
	}

	/** Single return value version of: {@link #glCreateProgramPipelines CreateProgramPipelines} */
	public static int glCreateProgramPipelines() {
		APIBuffer __buffer = apiBuffer();
		int pipelines = __buffer.intParam();
		nglCreateProgramPipelines(1, __buffer.address(pipelines));
		return __buffer.intValue(pipelines);
	}

	// --- [ glCreateQueries ] ---

	/** JNI method for {@link #glCreateQueries CreateQueries} */
	@JavadocExclude
	public static native void nglCreateQueries(int target, int n, long ids, long __functionAddress);

	/** Unsafe version of {@link #glCreateQueries CreateQueries} */
	@JavadocExclude
	public static void nglCreateQueries(int target, int n, long ids) {
		long __functionAddress = getInstance().CreateQueries;
		nglCreateQueries(target, n, ids, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glCreateQueries.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns {@code n} previously unused query object names in {@code ids}, each representing a new query object with the specified {@code target}.
	 *
	 * @param target the query target. One of:<br>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}, {@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}, {@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}, {@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}, {@link GL33#GL_TIMESTAMP TIMESTAMP}, {@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}, {@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}
	 * @param n      the number of query object names to create
	 * @param ids    the buffer in which to return the created query object names
	 */
	public static void glCreateQueries(int target, int n, ByteBuffer ids) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(ids, n << 2);
		nglCreateQueries(target, n, memAddress(ids));
	}

	/** Alternative version of: {@link #glCreateQueries CreateQueries} */
	public static void glCreateQueries(int target, IntBuffer ids) {
		nglCreateQueries(target, ids.remaining(), memAddress(ids));
	}

	/** Single return value version of: {@link #glCreateQueries CreateQueries} */
	public static int glCreateQueries(int target) {
		APIBuffer __buffer = apiBuffer();
		int ids = __buffer.intParam();
		nglCreateQueries(target, 1, __buffer.address(ids));
		return __buffer.intValue(ids);
	}

	// --- [ glMemoryBarrierByRegion ] ---

	/** JNI method for {@link #glMemoryBarrierByRegion MemoryBarrierByRegion} */
	@JavadocExclude
	public static native void nglMemoryBarrierByRegion(int barriers, long __functionAddress);

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
	 * @param barriers the barriers to insert. One or more of:<br>{@link GL42#GL_ATOMIC_COUNTER_BARRIER_BIT ATOMIC_COUNTER_BARRIER_BIT}, {@link GL42#GL_FRAMEBUFFER_BARRIER_BIT FRAMEBUFFER_BARRIER_BIT}, {@link GL42#GL_SHADER_IMAGE_ACCESS_BARRIER_BIT SHADER_IMAGE_ACCESS_BARRIER_BIT}, {@link GL43#GL_SHADER_STORAGE_BARRIER_BIT SHADER_STORAGE_BARRIER_BIT}, {@link GL42#GL_TEXTURE_FETCH_BARRIER_BIT TEXTURE_FETCH_BARRIER_BIT}, {@link GL42#GL_UNIFORM_BARRIER_BIT UNIFORM_BARRIER_BIT}
	 */
	public static void glMemoryBarrierByRegion(int barriers) {
		long __functionAddress = getInstance().MemoryBarrierByRegion;
		nglMemoryBarrierByRegion(barriers, __functionAddress);
	}

	// --- [ glGetTextureSubImage ] ---

	/** JNI method for {@link #glGetTextureSubImage GetTextureSubImage} */
	@JavadocExclude
	public static native void nglGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glGetTextureSubImage GetTextureSubImage} */
	@JavadocExclude
	public static void nglGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixels) {
		long __functionAddress = getInstance().GetTextureSubImage;
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels, __functionAddress);
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
	 * @param format  the pixel format. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the pixel type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param bufSize the size of the buffer to receive the retrieved pixel data
	 * @param pixels  the buffer in which to place the returned data
	 */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pixels, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glGetTextureSubImage GetTextureSubImage} */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glGetTextureSubImage GetTextureSubImage} */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 1, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glGetTextureSubImage GetTextureSubImage} */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glGetTextureSubImage GetTextureSubImage} */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glGetTextureSubImage GetTextureSubImage} */
	public static void glGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 3, memAddress(pixels));
	}

	// --- [ glGetCompressedTextureSubImage ] ---

	/** JNI method for {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	@JavadocExclude
	public static native void nglGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	@JavadocExclude
	public static void nglGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels) {
		long __functionAddress = getInstance().GetCompressedTextureSubImage;
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels, __functionAddress);
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
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pixels, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 1, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 2, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 2, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glGetCompressedTextureSubImage GetCompressedTextureSubImage} */
	public static void glGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, DoubleBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 3, memAddress(pixels));
	}

	// --- [ glTextureBarrier ] ---

	/** JNI method for {@link #glTextureBarrier TextureBarrier} */
	@JavadocExclude
	public static native void nglTextureBarrier(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glTextureBarrier.xhtml">OpenGL SDK Reference</a></p>
	 * 
Guarantees that writes have completed and caches have been invalidated before subsequent Draws are executed.
	 */
	public static void glTextureBarrier() {
		long __functionAddress = getInstance().TextureBarrier;
		nglTextureBarrier(__functionAddress);
	}

	// --- [ glGetGraphicsResetStatus ] ---

	/** JNI method for {@link #glGetGraphicsResetStatus GetGraphicsResetStatus} */
	@JavadocExclude
	public static native int nglGetGraphicsResetStatus(long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetGraphicsResetStatus.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Indicates if the GL context has been in a reset state at any point since the last call to GetGraphicsResetStatus:
	 * <ul>
	 * <li>{@link #GL_NO_ERROR NO_ERROR} indicates that the GL context has not been in a reset state since the last call.</li>
	 * <li>{@link #GL_GUILTY_CONTEXT_RESET GUILTY_CONTEXT_RESET} indicates that a reset has been detected that is attributable to the current GL context.</li>
	 * <li>{@link #GL_INNOCENT_CONTEXT_RESET INNOCENT_CONTEXT_RESET} indicates a reset has been detected that is not attributable to the current GL context.</li>
	 * <li>{@link #GL_UNKNOWN_CONTEXT_RESET UNKNOWN_CONTEXT_RESET} indicates a detected graphics reset whose cause is unknown.</li>
	 * </ul>
	 * If a reset status other than NO_ERROR is returned and subsequent calls return NO_ERROR, the context reset was encountered and completed. If a reset
	 * status is repeatedly returned, the context may be in the process of resetting.
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
	 * and may not block indefinitely or cause termination of the application. Exceptions to this behavior include:
	 * <ul>
	 * <li>{@link GL11#glGetError GetError} and GetGraphicsResetStatus behave normally following a graphics reset, so that the application can determine a reset has
	 * occurred, and when it is safe to destroy and recreate the context.</li>
	 * <li>Any commands which might cause a polling application to block indefinitely will generate a CONTEXT_LOST error, but will also return a value
	 * indicating completion to the application.</li>
	 * </ul></p>
	 */
	public static int glGetGraphicsResetStatus() {
		long __functionAddress = getInstance().GetGraphicsResetStatus;
		return nglGetGraphicsResetStatus(__functionAddress);
	}

	// --- [ glReadnPixels ] ---

	/** JNI method for {@link #glReadnPixels ReadnPixels} */
	@JavadocExclude
	public static native void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels, long __functionAddress);

	/** Unsafe version of {@link #glReadnPixels ReadnPixels} */
	@JavadocExclude
	public static void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
		long __functionAddress = getInstance().ReadnPixels;
		nglReadnPixels(x, y, width, height, format, type, bufSize, pixels, __functionAddress);
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
	 * @param format  the pixel format. One of:<br>{@link GL11#GL_STENCIL_INDEX STENCIL_INDEX}, {@link GL11#GL_DEPTH_COMPONENT DEPTH_COMPONENT}, {@link GL30#GL_DEPTH_STENCIL DEPTH_STENCIL}, {@link GL11#GL_RED RED}, {@link GL11#GL_GREEN GREEN}, {@link GL11#GL_BLUE BLUE}, {@link GL11#GL_ALPHA ALPHA}, {@link GL30#GL_RG RG}, {@link GL11#GL_RGB RGB}, {@link GL11#GL_RGBA RGBA}, {@link GL12#GL_BGR BGR}, {@link GL12#GL_BGRA BGRA}, {@link GL11#GL_LUMINANCE LUMINANCE}, {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA}, {@link GL30#GL_RED_INTEGER RED_INTEGER}, {@link GL30#GL_GREEN_INTEGER GREEN_INTEGER}, {@link GL30#GL_BLUE_INTEGER BLUE_INTEGER}, {@link GL30#GL_ALPHA_INTEGER ALPHA_INTEGER}, {@link GL30#GL_RG_INTEGER RG_INTEGER}, {@link GL30#GL_RGB_INTEGER RGB_INTEGER}, {@link GL30#GL_RGBA_INTEGER RGBA_INTEGER}, {@link GL30#GL_BGR_INTEGER BGR_INTEGER}, {@link GL30#GL_BGRA_INTEGER BGRA_INTEGER}
	 * @param type    the pixel type. One of:<br>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_INT INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL12#GL_UNSIGNED_BYTE_3_3_2 UNSIGNED_BYTE_3_3_2}, {@link GL12#GL_UNSIGNED_BYTE_2_3_3_REV UNSIGNED_BYTE_2_3_3_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5 UNSIGNED_SHORT_5_6_5}, {@link GL12#GL_UNSIGNED_SHORT_5_6_5_REV UNSIGNED_SHORT_5_6_5_REV}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4 UNSIGNED_SHORT_4_4_4_4}, {@link GL12#GL_UNSIGNED_SHORT_4_4_4_4_REV UNSIGNED_SHORT_4_4_4_4_REV}, {@link GL12#GL_UNSIGNED_SHORT_5_5_5_1 UNSIGNED_SHORT_5_5_5_1}, {@link GL12#GL_UNSIGNED_SHORT_1_5_5_5_REV UNSIGNED_SHORT_1_5_5_5_REV}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8 UNSIGNED_INT_8_8_8_8}, {@link GL12#GL_UNSIGNED_INT_8_8_8_8_REV UNSIGNED_INT_8_8_8_8_REV}, {@link GL12#GL_UNSIGNED_INT_10_10_10_2 UNSIGNED_INT_10_10_10_2}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL30#GL_UNSIGNED_INT_24_8 UNSIGNED_INT_24_8}, {@link GL30#GL_UNSIGNED_INT_10F_11F_11F_REV UNSIGNED_INT_10F_11F_11F_REV}, {@link GL30#GL_UNSIGNED_INT_5_9_9_9_REV UNSIGNED_INT_5_9_9_9_REV}, {@link GL30#GL_FLOAT_32_UNSIGNED_INT_24_8_REV FLOAT_32_UNSIGNED_INT_24_8_REV}, {@link GL11#GL_BITMAP BITMAP}
	 * @param bufSize the maximum number of bytes to write into {@code data}
	 * @param pixels  a buffer in which to place the returned pixel data
	 */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, ByteBuffer pixels) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pixels, bufSize);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		nglReadnPixels(x, y, width, height, format, type, bufSize, memAddress(pixels));
	}

	/** Buffer object offset version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixelsOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, true);
		nglReadnPixels(x, y, width, height, format, type, bufSize, pixelsOffset);
	}

	/** ShortBuffer version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 1, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, IntBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glReadnPixels ReadnPixels} */
	public static void glReadnPixels(int x, int y, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	// --- [ glGetnUniformfv ] ---

	/** JNI method for {@link #glGetnUniformfv GetnUniformfv} */
	@JavadocExclude
	public static native void nglGetnUniformfv(int program, int location, int bufSize, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetnUniformfv GetnUniformfv} */
	@JavadocExclude
	public static void nglGetnUniformfv(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformfv;
		nglGetnUniformfv(program, location, bufSize, params, __functionAddress);
	}

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
	public static void glGetnUniformfv(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformfv(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformfv GetnUniformfv} */
	public static void glGetnUniformfv(int program, int location, FloatBuffer params) {
		nglGetnUniformfv(program, location, params.remaining(), memAddress(params));
	}

	// --- [ glGetnUniformiv ] ---

	/** JNI method for {@link #glGetnUniformiv GetnUniformiv} */
	@JavadocExclude
	public static native void nglGetnUniformiv(int program, int location, int bufSize, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetnUniformiv GetnUniformiv} */
	@JavadocExclude
	public static void nglGetnUniformiv(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformiv;
		nglGetnUniformiv(program, location, bufSize, params, __functionAddress);
	}

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
	public static void glGetnUniformiv(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformiv(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformiv GetnUniformiv} */
	public static void glGetnUniformiv(int program, int location, FloatBuffer params) {
		nglGetnUniformiv(program, location, params.remaining(), memAddress(params));
	}

	// --- [ glGetnUniformuiv ] ---

	/** JNI method for {@link #glGetnUniformuiv GetnUniformuiv} */
	@JavadocExclude
	public static native void nglGetnUniformuiv(int program, int location, int bufSize, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetnUniformuiv GetnUniformuiv} */
	@JavadocExclude
	public static void nglGetnUniformuiv(int program, int location, int bufSize, long params) {
		long __functionAddress = getInstance().GetnUniformuiv;
		nglGetnUniformuiv(program, location, bufSize, params, __functionAddress);
	}

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
	public static void glGetnUniformuiv(int program, int location, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetnUniformuiv(program, location, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetnUniformuiv GetnUniformuiv} */
	public static void glGetnUniformuiv(int program, int location, FloatBuffer params) {
		nglGetnUniformuiv(program, location, params.remaining(), memAddress(params));
	}

}