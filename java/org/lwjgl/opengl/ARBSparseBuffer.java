/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/sparse_buffer.txt">ARB_sparse_buffer</a> extension.
 * 
 * <p>This extension adds to GL a mechanism to decouple the virtual and physical storage requirements of textures and allows an application
 * to create partially populated textures that would over-subscribe available graphics memory if made fully resident. This extension provides like
 * functionality for buffer objects, allowing applications to manage buffer object storage in a similar manner.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5} or {@link ARBVertexBufferObject ARB_vertex_buffer_object}.</p>
 */
public final class ARBSparseBuffer {

	/** Accepted as part of the the {@code flags} parameter to {@link GL44#glBufferStorage BufferStorage}. */
	public static final int GL_SPARSE_STORAGE_BIT_ARB = 0x400;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v. */
	public static final int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 0x82F8;

	/** Function address. */
	@JavadocExclude
	public final long
		BufferPageCommitmentARB,
		NamedBufferPageCommitmentEXT,
		NamedBufferPageCommitmentARB;

	@JavadocExclude
	public ARBSparseBuffer(FunctionProvider provider) {
		BufferPageCommitmentARB = provider.getFunctionAddress("glBufferPageCommitmentARB");
		NamedBufferPageCommitmentEXT = provider.getFunctionAddress("glNamedBufferPageCommitmentEXT");
		NamedBufferPageCommitmentARB = provider.getFunctionAddress("glNamedBufferPageCommitmentARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBSparseBuffer} instance for the current context. */
	public static ARBSparseBuffer getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBSparseBuffer);
	}

	static ARBSparseBuffer create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_sparse_buffer") ) return null;

		ARBSparseBuffer funcs = new ARBSparseBuffer(provider);

		boolean supported = checkFunctions(
			funcs.BufferPageCommitmentARB, ext.contains("GL_EXT_direct_state_access") ? funcs.NamedBufferPageCommitmentEXT : -1L, 
			ext.contains("GL_ARB_direct_state_access") ? funcs.NamedBufferPageCommitmentARB : -1L
		);

		return GL.checkExtension("GL_ARB_sparse_buffer", funcs, supported);
	}

	// --- [ glBufferPageCommitmentARB ] ---

	/** JNI method for {@link #glBufferPageCommitmentARB BufferPageCommitmentARB} */
	@JavadocExclude
	public static native void nglBufferPageCommitmentARB(int target, long offset, long size, boolean commit, long __functionAddress);

	/**
	 * Commit and de-commits regions of sparse buffer storage.
	 *
	 * @param target buffer object target. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param offset the region offset. Must be an integer multiple of the implementation dependent constant {@link #GL_SPARSE_BUFFER_PAGE_SIZE_ARB SPARSE_BUFFER_PAGE_SIZE_ARB}.
	 * @param size   the data size. must either be a multiple of {@link #GL_SPARSE_BUFFER_PAGE_SIZE_ARB SPARSE_BUFFER_PAGE_SIZE_ARB}, or extend to the end of the buffer's data store.
	 * @param commit If true, then pages contained in the specified range become committed and become physically backed. If false, then physical storage associated with
	 *               the data store in the specified region may be freed and those pages become uncommitted. Newly committed pages have undefined content. However,
	 *               redundantly committing pages does not alter their content.
	 */
	public static void glBufferPageCommitmentARB(int target, long offset, long size, boolean commit) {
		long __functionAddress = getInstance().BufferPageCommitmentARB;
		nglBufferPageCommitmentARB(target, offset, size, commit, __functionAddress);
	}

	// --- [ glNamedBufferPageCommitmentEXT ] ---

	/** JNI method for {@link #glNamedBufferPageCommitmentEXT NamedBufferPageCommitmentEXT} */
	@JavadocExclude
	public static native void nglNamedBufferPageCommitmentEXT(int buffer, long offset, long size, boolean commit, long __functionAddress);

	/**
	 * Direct-state-access version of {@link #glBufferPageCommitmentARB BufferPageCommitmentARB}.
	 *
	 * @param buffer the buffer object
	 * @param offset the region offset. Must be an integer multiple of the implementation dependent constant {@link #GL_SPARSE_BUFFER_PAGE_SIZE_ARB SPARSE_BUFFER_PAGE_SIZE_ARB}.
	 * @param size   the data size. must either be a multiple of {@link #GL_SPARSE_BUFFER_PAGE_SIZE_ARB SPARSE_BUFFER_PAGE_SIZE_ARB}, or extend to the end of the buffer's data store.
	 * @param commit the commit state
	 */
	public static void glNamedBufferPageCommitmentEXT(int buffer, long offset, long size, boolean commit) {
		long __functionAddress = getInstance().NamedBufferPageCommitmentEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedBufferPageCommitmentEXT(buffer, offset, size, commit, __functionAddress);
	}

	// --- [ glNamedBufferPageCommitmentARB ] ---

	/** JNI method for {@link #glNamedBufferPageCommitmentARB NamedBufferPageCommitmentARB} */
	@JavadocExclude
	public static native void nglNamedBufferPageCommitmentARB(int buffer, long offset, long size, boolean commit, long __functionAddress);

	/**
	 * Direct-state-access version of {@link #glBufferPageCommitmentARB BufferPageCommitmentARB}.
	 *
	 * @param buffer the buffer object
	 * @param offset the region offset. Must be an integer multiple of the implementation dependent constant {@link #GL_SPARSE_BUFFER_PAGE_SIZE_ARB SPARSE_BUFFER_PAGE_SIZE_ARB}.
	 * @param size   the data size. must either be a multiple of {@link #GL_SPARSE_BUFFER_PAGE_SIZE_ARB SPARSE_BUFFER_PAGE_SIZE_ARB}, or extend to the end of the buffer's data store.
	 * @param commit the commit state
	 */
	public static void glNamedBufferPageCommitmentARB(int buffer, long offset, long size, boolean commit) {
		long __functionAddress = getInstance().NamedBufferPageCommitmentARB;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNamedBufferPageCommitmentARB(buffer, offset, size, commit, __functionAddress);
	}

}