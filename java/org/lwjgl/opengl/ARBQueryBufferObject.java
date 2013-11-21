/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/** Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/query_buffer_object.txt">ARB_query_buffer_object</a> extension. */
public final class ARBQueryBufferObject {

	/**
	 * Accepted by the {@code pname} parameter of {@link GL15#glGetQueryObjecti GetQueryObjecti}, {@link GL15#glGetQueryObjectui GetQueryObjectui}, {@link GL33#glGetQueryObjecti64 GetQueryObjecti64} and
	 * GetQueryObjectui64()".link}.
	 */
	public static final int
		GL_QUERY_RESULT_NO_WAIT = 0x9194;

	/**
	 * Accepted by the {@code target} parameter of {@link GL15#glBindBuffer BindBuffer}, {@link GL15#glBufferData BufferData}, {@link GL15#glBufferSubData BufferSubData},
	 * {@link GL15#glMapBuffer MapBuffer}, {@link GL15#glUnmapBuffer UnmapBuffer}, {@link GL30#glMapBufferRange MapBufferRange}, {@link GL15#glGetBufferSubData GetBufferSubData},
	 * {@link GL15#glGetBufferParameteri GetBufferParameteri}, {@link GL32#glGetBufferParameteri64 GetBufferParameteri64}, {@link GL15#glGetBufferPointer GetBufferPointer},
	 * {@link GL43#glClearBufferSubData ClearBufferSubData}, and the {@code readtarget} and {@code writetarget} parameters of {@link GL31#glCopyBufferSubData CopyBufferSubData}.
	 */
	public static final int
		GL_QUERY_BUFFER = 0x9192;

	/**
	 * Accepted by the {@code pname} parameter of {@link GL11#glGetBoolean GetBoolean}, {@link GL11#glGetInteger GetInteger}, {@link GL11#glGetFloat GetFloat},
	 * and {@link GL11#glGetDouble GetDouble}.
	 */
	public static final int
		GL_QUERY_BUFFER_BINDING = 0x9193;

	/** Accepted in the {@code barriers} bitfield in {@link GL42#glMemoryBarrier MemoryBarrier}. */
	public static final int
		GL_QUERY_BUFFER_BARRIER_BIT = 0x8000;

	private ARBQueryBufferObject() {}

}