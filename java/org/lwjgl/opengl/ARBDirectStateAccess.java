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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/direct_state_access.txt">ARB_direct_state_access</a> extension.
 * 
 * <p>In unextended OpenGL, most mutation of state contained in objects is through an indirection known as a binding. Objects are attached to a context
 * (either directly or indirectly via a container) and then commands to modify or query their state are issued on that context, indirecting through its
 * attachments and into the underlying object. This is known as `bind-to-edit'.</p>
 * 
 * <p>This extension derives from the GL_EXT_direct_state_access extension, which added accessors for most state on most objects, allowing it to be queried
 * and modified without the object needing to be bound to a context. In cases where a single property of an object is to be modified, directly accessing
 * its state can be more efficient than binding the object to the context and then indirecting through it. Further, directly accessing the state of objects
 * through their names rather than by bind-to-edit does not disturb the bindings of the current context, which is useful for tools, middleware and other
 * applications that are unaware of the outer state but it can also avoid cases of redundant state changes.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}. Promoted to core in {@link GL45 OpenGL 4.5}.</p>
 */
public class ARBDirectStateAccess {

	/** Accepted by the {@code pname} parameter of GetTextureParameter{if}v and GetTextureParameterI{i ui}v. */
	public static final int GL_TEXTURE_TARGET = 0x1006;

	/** Accepted by the {@code pname} parameter of GetQueryObjectiv. */
	public static final int GL_QUERY_TARGET = 0x82EA;

	protected ARBDirectStateAccess() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glCreateTransformFeedbacks, caps.glTransformFeedbackBufferBase, caps.glTransformFeedbackBufferRange, caps.glGetTransformFeedbackiv, 
			caps.glGetTransformFeedbacki_v, caps.glGetTransformFeedbacki64_v, caps.glCreateBuffers, caps.glNamedBufferStorage, caps.glNamedBufferData, 
			caps.glNamedBufferSubData, caps.glCopyNamedBufferSubData, caps.glClearNamedBufferData, caps.glClearNamedBufferSubData, caps.glMapNamedBuffer, 
			caps.glMapNamedBufferRange, caps.glUnmapNamedBuffer, caps.glFlushMappedNamedBufferRange, caps.glGetNamedBufferParameteriv, 
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
			caps.glGetQueryBufferObjecti64v, caps.glGetQueryBufferObjectiv, caps.glGetQueryBufferObjectui64v, caps.glGetQueryBufferObjectuiv
		);
	}

	// --- [ glCreateTransformFeedbacks ] ---

	/**
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
	 * Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector.
	 *
	 * @param ids the buffer in which to return the names
	 */
	public static void glCreateTransformFeedbacks(IntBuffer ids) {
		nglCreateTransformFeedbacks(ids.remaining(), memAddress(ids));
	}

	/** Returns {@code n} previously unused transform feedback object names in {@code ids}, each representing a new state vector. */
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
	 * Returns {@code n} previously unused buffer names in {@code buffers}, each representing a new buffer object initialized as if it had been bound to an
	 * unspecified target.
	 *
	 * @param buffers the buffer in which to return the names
	 */
	public static void glCreateBuffers(IntBuffer buffers) {
		nglCreateBuffers(buffers.remaining(), memAddress(buffers));
	}

	/**
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

	/** ByteBuffer version of: {@link #glNamedBufferStorage NamedBufferStorage} */
	public static void glNamedBufferStorage(int buffer, ByteBuffer data, int flags) {
		nglNamedBufferStorage(buffer, (long)data.remaining(), memAddress(data), flags);
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

	/**
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
	 * DSA version of {@link GL15#glBufferData BufferData}.
	 *
	 * @param buffer 
	 * @param size   the size in bytes of the buffer object's new data store
	 * @param usage  the expected usage pattern of the data store. One of:<br><table><tr><td>{@link GL15#GL_STREAM_DRAW STREAM_DRAW}</td><td>{@link GL15#GL_STREAM_READ STREAM_READ}</td><td>{@link GL15#GL_STREAM_COPY STREAM_COPY}</td><td>{@link GL15#GL_STATIC_DRAW STATIC_DRAW}</td><td>{@link GL15#GL_STATIC_READ STATIC_READ}</td><td>{@link GL15#GL_STATIC_COPY STATIC_COPY}</td><td>{@link GL15#GL_DYNAMIC_DRAW DYNAMIC_DRAW}</td></tr><tr><td>{@link GL15#GL_DYNAMIC_READ DYNAMIC_READ}</td><td>{@link GL15#GL_DYNAMIC_COPY DYNAMIC_COPY}</td></tr></table>
	 */
	public static void glNamedBufferData(int buffer, long size, int usage) {
		nglNamedBufferData(buffer, size, NULL, usage);
	}

	/** ByteBuffer version of: {@link #glNamedBufferData NamedBufferData} */
	public static void glNamedBufferData(int buffer, ByteBuffer data, int usage) {
		nglNamedBufferData(buffer, (long)data.remaining(), memAddress(data), usage);
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

	/**
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
	 * DSA version of {@link GL15#glBufferSubData BufferSubData}.
	 *
	 * @param buffer 
	 * @param offset the offset into the buffer object's data store where data replacement will begin, measured in bytes
	 * @param data   a pointer to the new data that will be copied into the data store
	 */
	public static void glNamedBufferSubData(int buffer, long offset, ByteBuffer data) {
		nglNamedBufferSubData(buffer, offset, (long)data.remaining(), memAddress(data));
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

	/**
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

	/**
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

	/**
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
	 * DSA version of {@link GL15#glGetBufferSubData GetBufferSubData}.
	 *
	 * @param buffer the buffer object name
	 * @param offset the offset into the buffer object's data store from which data will be returned, measured in bytes
	 * @param data   a pointer to the location where buffer object data is returned
	 */
	public static void glGetNamedBufferSubData(int buffer, long offset, ByteBuffer data) {
		nglGetNamedBufferSubData(buffer, offset, (long)data.remaining(), memAddress(data));
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

	/**
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
	 * Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object.
	 *
	 * @param framebuffers the buffer in which to store the framebuffer names
	 */
	public static void glCreateFramebuffers(IntBuffer framebuffers) {
		nglCreateFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
	}

	/** Returns {@code n} previously unused framebuffer names in {@code framebuffers}, each representing a new framebuffer object. */
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
	 * DSA version of {@link GL20#glDrawBuffers DrawBuffers}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param bufs        an array of symbolic constants specifying the buffers into which fragment colors or data values will be written. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL11#GL_AUX0 AUX0}</td><td>{@link GL11#GL_AUX1 AUX1}</td><td>{@link GL11#GL_AUX2 AUX2}</td></tr><tr><td>{@link GL11#GL_AUX3 AUX3}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
	 */
	public static void glNamedFramebufferDrawBuffers(int framebuffer, IntBuffer bufs) {
		nglNamedFramebufferDrawBuffers(framebuffer, bufs.remaining(), memAddress(bufs));
	}

	/**
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
	 * DSA version of {@link GL43#glInvalidateFramebuffer InvalidateFramebuffer}.
	 *
	 * @param framebuffer the framebuffer name
	 * @param attachments the address of an array identifying the attachments to be invalidated
	 */
	public static void glInvalidateNamedFramebufferData(int framebuffer, IntBuffer attachments) {
		nglInvalidateNamedFramebufferData(framebuffer, attachments.remaining(), memAddress(attachments));
	}

	/**
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
	 * Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object.
	 *
	 * @param renderbuffers the buffer in which to store the created renderbuffer names
	 */
	public static void glCreateRenderbuffers(IntBuffer renderbuffers) {
		nglCreateRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
	}

	/** Returns {@code n} previously unused renderbuffer names in {@code renderbuffers}, each representing a new renderbuffer object. */
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
	 * Returns {@code n} previously unused texture names in {@code textures}, each representing a new texture object.
	 *
	 * @param target   the texture target. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}</td></tr><tr><td>{@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}</td></tr></table>
	 * @param textures the buffer in which to store the created texture names
	 */
	public static void glCreateTextures(int target, IntBuffer textures) {
		nglCreateTextures(target, textures.remaining(), memAddress(textures));
	}

	/**
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

	/** ShortBuffer version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, DoubleBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
	}

	// --- [ glTextureSubImage2D ] ---

	/**
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

	/** ShortBuffer version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, DoubleBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
	}

	// --- [ glTextureSubImage3D ] ---

	/**
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

	/** ShortBuffer version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
	}

	// --- [ glCompressedTextureSubImage1D ] ---

	/**
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

	/** ShortBuffer version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, ShortBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining() << 1, memAddress(pixels));
	}

	/** IntBuffer version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, IntBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/** FloatBuffer version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, FloatBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining() << 2, memAddress(pixels));
	}

	/** DoubleBuffer version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, DoubleBuffer pixels) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		nglGetTextureImage(texture, level, format, type, pixels.remaining() << 3, memAddress(pixels));
	}

	// --- [ glGetCompressedTextureImage ] ---

	/**
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
	 * Returns {@code n} previously unused vertex array object names in {@code arrays}.
	 *
	 * @param arrays the buffer in which to return the created vertex array object names
	 */
	public static void glCreateVertexArrays(IntBuffer arrays) {
		nglCreateVertexArrays(arrays.remaining(), memAddress(arrays));
	}

	/** Returns {@code n} previously unused vertex array object names in {@code arrays}. */
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
	 * Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object.
	 *
	 * @param samplers the buffer in which to return the created sampler object names
	 */
	public static void glCreateSamplers(IntBuffer samplers) {
		nglCreateSamplers(samplers.remaining(), memAddress(samplers));
	}

	/** Returns {@code n} previously unused sampler names in {@code samplers}, each representing a new sampler object. */
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
	 * Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object.
	 *
	 * @param pipelines the buffer in which to return the created program pipeline names
	 */
	public static void glCreateProgramPipelines(IntBuffer pipelines) {
		nglCreateProgramPipelines(pipelines.remaining(), memAddress(pipelines));
	}

	/** Returns {@code n} previously unused program pipeline names in {@code pipelines}, each representing a new program pipeline object. */
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
	 * Returns {@code n} previously unused query object names in {@code ids}, each representing a new query object with the specified {@code target}.
	 *
	 * @param target the query target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
	 * @param ids    the buffer in which to return the created query object names
	 */
	public static void glCreateQueries(int target, IntBuffer ids) {
		nglCreateQueries(target, ids.remaining(), memAddress(ids));
	}

	/**
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

	// --- [ glGetQueryBufferObjecti64v ] ---

	/**
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

	// --- [ glGetQueryBufferObjectiv ] ---

	/**
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

	// --- [ glGetQueryBufferObjectui64v ] ---

	/**
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

	// --- [ glGetQueryBufferObjectuiv ] ---

	/**
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

	/** Array version of: {@link #glCreateTransformFeedbacks CreateTransformFeedbacks} */
	public static void glCreateTransformFeedbacks(int[] ids) {
		long __functionAddress = GL.getCapabilities().glCreateTransformFeedbacks;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, ids.length, ids);
	}

	/** Array version of: {@link #glGetTransformFeedbackiv GetTransformFeedbackiv} */
	public static void glGetTransformFeedbackiv(int xfb, int pname, int[] param) {
		long __functionAddress = GL.getCapabilities().glGetTransformFeedbackiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(param, 1);
		}
		callPV(__functionAddress, xfb, pname, param);
	}

	/** Array version of: {@link #glGetTransformFeedbacki_v GetTransformFeedbacki_v} */
	public static void glGetTransformFeedbacki_v(int xfb, int pname, int index, int[] param) {
		long __functionAddress = GL.getCapabilities().glGetTransformFeedbacki_v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(param, 1);
		}
		callPV(__functionAddress, xfb, pname, index, param);
	}

	/** Array version of: {@link #glGetTransformFeedbacki64_v GetTransformFeedbacki64_v} */
	public static void glGetTransformFeedbacki64_v(int xfb, int pname, int index, long[] param) {
		long __functionAddress = GL.getCapabilities().glGetTransformFeedbacki64_v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(param, 1);
		}
		callPV(__functionAddress, xfb, pname, index, param);
	}

	/** Array version of: {@link #glCreateBuffers CreateBuffers} */
	public static void glCreateBuffers(int[] buffers) {
		long __functionAddress = GL.getCapabilities().glCreateBuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffers.length, buffers);
	}

	/** short[] version of: {@link #glNamedBufferStorage NamedBufferStorage} */
	public static void glNamedBufferStorage(int buffer, short[] data, int flags) {
		long __functionAddress = GL.getCapabilities().glNamedBufferStorage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 1), data, flags);
	}

	/** int[] version of: {@link #glNamedBufferStorage NamedBufferStorage} */
	public static void glNamedBufferStorage(int buffer, int[] data, int flags) {
		long __functionAddress = GL.getCapabilities().glNamedBufferStorage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 2), data, flags);
	}

	/** float[] version of: {@link #glNamedBufferStorage NamedBufferStorage} */
	public static void glNamedBufferStorage(int buffer, float[] data, int flags) {
		long __functionAddress = GL.getCapabilities().glNamedBufferStorage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 2), data, flags);
	}

	/** double[] version of: {@link #glNamedBufferStorage NamedBufferStorage} */
	public static void glNamedBufferStorage(int buffer, double[] data, int flags) {
		long __functionAddress = GL.getCapabilities().glNamedBufferStorage;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 3), data, flags);
	}

	/** short[] version of: {@link #glNamedBufferData NamedBufferData} */
	public static void glNamedBufferData(int buffer, short[] data, int usage) {
		long __functionAddress = GL.getCapabilities().glNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 1), data, usage);
	}

	/** int[] version of: {@link #glNamedBufferData NamedBufferData} */
	public static void glNamedBufferData(int buffer, int[] data, int usage) {
		long __functionAddress = GL.getCapabilities().glNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 2), data, usage);
	}

	/** float[] version of: {@link #glNamedBufferData NamedBufferData} */
	public static void glNamedBufferData(int buffer, float[] data, int usage) {
		long __functionAddress = GL.getCapabilities().glNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 2), data, usage);
	}

	/** double[] version of: {@link #glNamedBufferData NamedBufferData} */
	public static void glNamedBufferData(int buffer, double[] data, int usage) {
		long __functionAddress = GL.getCapabilities().glNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPV(__functionAddress, buffer, (long)(data.length << 3), data, usage);
	}

	/** short[] version of: {@link #glNamedBufferSubData NamedBufferSubData} */
	public static void glNamedBufferSubData(int buffer, long offset, short[] data) {
		long __functionAddress = GL.getCapabilities().glNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 1), data);
	}

	/** int[] version of: {@link #glNamedBufferSubData NamedBufferSubData} */
	public static void glNamedBufferSubData(int buffer, long offset, int[] data) {
		long __functionAddress = GL.getCapabilities().glNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 2), data);
	}

	/** float[] version of: {@link #glNamedBufferSubData NamedBufferSubData} */
	public static void glNamedBufferSubData(int buffer, long offset, float[] data) {
		long __functionAddress = GL.getCapabilities().glNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 2), data);
	}

	/** double[] version of: {@link #glNamedBufferSubData NamedBufferSubData} */
	public static void glNamedBufferSubData(int buffer, long offset, double[] data) {
		long __functionAddress = GL.getCapabilities().glNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 3), data);
	}

	/** short[] version of: {@link #glClearNamedBufferData ClearNamedBufferData} */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, short[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, internalformat, format, type, data);
	}

	/** int[] version of: {@link #glClearNamedBufferData ClearNamedBufferData} */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, int[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, internalformat, format, type, data);
	}

	/** float[] version of: {@link #glClearNamedBufferData ClearNamedBufferData} */
	public static void glClearNamedBufferData(int buffer, int internalformat, int format, int type, float[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, buffer, internalformat, format, type, data);
	}

	/** short[] version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, short[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, internalformat, offset, size, format, type, data);
	}

	/** int[] version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, int[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, internalformat, offset, size, format, type, data);
	}

	/** float[] version of: {@link #glClearNamedBufferSubData ClearNamedBufferSubData} */
	public static void glClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, float[] data) {
		long __functionAddress = GL.getCapabilities().glClearNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, internalformat, offset, size, format, type, data);
	}

	/** Array version of: {@link #glGetNamedBufferParameteriv GetNamedBufferParameteriv} */
	public static void glGetNamedBufferParameteriv(int buffer, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, buffer, pname, params);
	}

	/** Array version of: {@link #glGetNamedBufferParameteri64v GetNamedBufferParameteri64v} */
	public static void glGetNamedBufferParameteri64v(int buffer, int pname, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferParameteri64v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, buffer, pname, params);
	}

	/** short[] version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
	public static void glGetNamedBufferSubData(int buffer, long offset, short[] data) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 1), data);
	}

	/** int[] version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
	public static void glGetNamedBufferSubData(int buffer, long offset, int[] data) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 2), data);
	}

	/** float[] version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
	public static void glGetNamedBufferSubData(int buffer, long offset, float[] data) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 2), data);
	}

	/** double[] version of: {@link #glGetNamedBufferSubData GetNamedBufferSubData} */
	public static void glGetNamedBufferSubData(int buffer, long offset, double[] data) {
		long __functionAddress = GL.getCapabilities().glGetNamedBufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, buffer, offset, (long)(data.length << 3), data);
	}

	/** Array version of: {@link #glCreateFramebuffers CreateFramebuffers} */
	public static void glCreateFramebuffers(int[] framebuffers) {
		long __functionAddress = GL.getCapabilities().glCreateFramebuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffers.length, framebuffers);
	}

	/** Array version of: {@link #glNamedFramebufferDrawBuffers NamedFramebufferDrawBuffers} */
	public static void glNamedFramebufferDrawBuffers(int framebuffer, int[] bufs) {
		long __functionAddress = GL.getCapabilities().glNamedFramebufferDrawBuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, bufs.length, bufs);
	}

	/** Array version of: {@link #glInvalidateNamedFramebufferData InvalidateNamedFramebufferData} */
	public static void glInvalidateNamedFramebufferData(int framebuffer, int[] attachments) {
		long __functionAddress = GL.getCapabilities().glInvalidateNamedFramebufferData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, attachments.length, attachments);
	}

	/** Array version of: {@link #glInvalidateNamedFramebufferSubData InvalidateNamedFramebufferSubData} */
	public static void glInvalidateNamedFramebufferSubData(int framebuffer, int[] attachments, int x, int y, int width, int height) {
		long __functionAddress = GL.getCapabilities().glInvalidateNamedFramebufferSubData;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, framebuffer, attachments.length, attachments, x, y, width, height);
	}

	/** Array version of: {@link #glClearNamedFramebufferiv ClearNamedFramebufferiv} */
	public static void glClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, int[] value) {
		long __functionAddress = GL.getCapabilities().glClearNamedFramebufferiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, framebuffer, buffer, drawbuffer, value);
	}

	/** Array version of: {@link #glClearNamedFramebufferuiv ClearNamedFramebufferuiv} */
	public static void glClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, int[] value) {
		long __functionAddress = GL.getCapabilities().glClearNamedFramebufferuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 4);
		}
		callPV(__functionAddress, framebuffer, buffer, drawbuffer, value);
	}

	/** Array version of: {@link #glClearNamedFramebufferfv ClearNamedFramebufferfv} */
	public static void glClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, float[] value) {
		long __functionAddress = GL.getCapabilities().glClearNamedFramebufferfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, framebuffer, buffer, drawbuffer, value);
	}

	/** Array version of: {@link #glGetNamedFramebufferParameteriv GetNamedFramebufferParameteriv} */
	public static void glGetNamedFramebufferParameteriv(int framebuffer, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetNamedFramebufferParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, framebuffer, pname, params);
	}

	/** Array version of: {@link #glGetNamedFramebufferAttachmentParameteriv GetNamedFramebufferAttachmentParameteriv} */
	public static void glGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetNamedFramebufferAttachmentParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, framebuffer, attachment, pname, params);
	}

	/** Array version of: {@link #glCreateRenderbuffers CreateRenderbuffers} */
	public static void glCreateRenderbuffers(int[] renderbuffers) {
		long __functionAddress = GL.getCapabilities().glCreateRenderbuffers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, renderbuffers.length, renderbuffers);
	}

	/** Array version of: {@link #glGetNamedRenderbufferParameteriv GetNamedRenderbufferParameteriv} */
	public static void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetNamedRenderbufferParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, renderbuffer, pname, params);
	}

	/** Array version of: {@link #glCreateTextures CreateTextures} */
	public static void glCreateTextures(int target, int[] textures) {
		long __functionAddress = GL.getCapabilities().glCreateTextures;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, textures.length, textures);
	}

	/** short[] version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, short[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage1D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, width, format, type, pixels);
	}

	/** int[] version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, int[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage1D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, width, format, type, pixels);
	}

	/** float[] version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, float[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage1D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, width, format, type, pixels);
	}

	/** double[] version of: {@link #glTextureSubImage1D TextureSubImage1D} */
	public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, double[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage1D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, width, format, type, pixels);
	}

	/** short[] version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage2D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/** int[] version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage2D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/** float[] version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage2D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/** double[] version of: {@link #glTextureSubImage2D TextureSubImage2D} */
	public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, double[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage2D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, width, height, format, type, pixels);
	}

	/** short[] version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** int[] version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** float[] version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** double[] version of: {@link #glTextureSubImage3D TextureSubImage3D} */
	public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] pixels) {
		long __functionAddress = GL.getCapabilities().glTextureSubImage3D;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_UNPACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
	}

	/** Array version of: {@link #glTextureParameterfv TextureParameterfv} */
	public static void glTextureParameterfv(int texture, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glTextureParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/** Array version of: {@link #glTextureParameterIiv TextureParameterIiv} */
	public static void glTextureParameterIiv(int texture, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glTextureParameterIiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/** Array version of: {@link #glTextureParameterIuiv TextureParameterIuiv} */
	public static void glTextureParameterIuiv(int texture, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glTextureParameterIuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/** Array version of: {@link #glTextureParameteriv TextureParameteriv} */
	public static void glTextureParameteriv(int texture, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glTextureParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/** short[] version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, short[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, format, type, pixels.length << 1, pixels);
	}

	/** int[] version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, int[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, format, type, pixels.length << 2, pixels);
	}

	/** float[] version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, float[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, format, type, pixels.length << 2, pixels);
	}

	/** double[] version of: {@link #glGetTextureImage GetTextureImage} */
	public static void glGetTextureImage(int texture, int level, int format, int type, double[] pixels) {
		long __functionAddress = GL.getCapabilities().glGetTextureImage;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL21.GL_PIXEL_PACK_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, texture, level, format, type, pixels.length << 3, pixels);
	}

	/** Array version of: {@link #glGetTextureLevelParameterfv GetTextureLevelParameterfv} */
	public static void glGetTextureLevelParameterfv(int texture, int level, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetTextureLevelParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, level, pname, params);
	}

	/** Array version of: {@link #glGetTextureLevelParameteriv GetTextureLevelParameteriv} */
	public static void glGetTextureLevelParameteriv(int texture, int level, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetTextureLevelParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, level, pname, params);
	}

	/** Array version of: {@link #glGetTextureParameterfv GetTextureParameterfv} */
	public static void glGetTextureParameterfv(int texture, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetTextureParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/** Array version of: {@link #glGetTextureParameterIiv GetTextureParameterIiv} */
	public static void glGetTextureParameterIiv(int texture, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetTextureParameterIiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/** Array version of: {@link #glGetTextureParameterIuiv GetTextureParameterIuiv} */
	public static void glGetTextureParameterIuiv(int texture, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetTextureParameterIuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/** Array version of: {@link #glGetTextureParameteriv GetTextureParameteriv} */
	public static void glGetTextureParameteriv(int texture, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetTextureParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, texture, pname, params);
	}

	/** Array version of: {@link #glCreateVertexArrays CreateVertexArrays} */
	public static void glCreateVertexArrays(int[] arrays) {
		long __functionAddress = GL.getCapabilities().glCreateVertexArrays;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, arrays.length, arrays);
	}

	/** Array version of: {@link #glVertexArrayVertexBuffers VertexArrayVertexBuffers} */
	public static void glVertexArrayVertexBuffers(int vaobj, int first, int[] buffers, PointerBuffer offsets, int[] strides) {
		long __functionAddress = GL.getCapabilities().glVertexArrayVertexBuffers;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( offsets != null ) checkBuffer(offsets, buffers.length);
			if ( strides != null ) checkBuffer(strides, buffers.length);
		}
		callPPPV(__functionAddress, vaobj, first, buffers == null ? 0 : buffers.length, buffers, memAddressSafe(offsets), strides);
	}

	/** Array version of: {@link #glGetVertexArrayiv GetVertexArrayiv} */
	public static void glGetVertexArrayiv(int vaobj, int pname, int[] param) {
		long __functionAddress = GL.getCapabilities().glGetVertexArrayiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(param, 1);
		}
		callPV(__functionAddress, vaobj, pname, param);
	}

	/** Array version of: {@link #glGetVertexArrayIndexediv GetVertexArrayIndexediv} */
	public static void glGetVertexArrayIndexediv(int vaobj, int index, int pname, int[] param) {
		long __functionAddress = GL.getCapabilities().glGetVertexArrayIndexediv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(param, 1);
		}
		callPV(__functionAddress, vaobj, index, pname, param);
	}

	/** Array version of: {@link #glGetVertexArrayIndexed64iv GetVertexArrayIndexed64iv} */
	public static void glGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long[] param) {
		long __functionAddress = GL.getCapabilities().glGetVertexArrayIndexed64iv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(param, 1);
		}
		callPV(__functionAddress, vaobj, index, pname, param);
	}

	/** Array version of: {@link #glCreateSamplers CreateSamplers} */
	public static void glCreateSamplers(int[] samplers) {
		long __functionAddress = GL.getCapabilities().glCreateSamplers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, samplers.length, samplers);
	}

	/** Array version of: {@link #glCreateProgramPipelines CreateProgramPipelines} */
	public static void glCreateProgramPipelines(int[] pipelines) {
		long __functionAddress = GL.getCapabilities().glCreateProgramPipelines;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, pipelines.length, pipelines);
	}

	/** Array version of: {@link #glCreateQueries CreateQueries} */
	public static void glCreateQueries(int target, int[] ids) {
		long __functionAddress = GL.getCapabilities().glCreateQueries;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, ids.length, ids);
	}

}