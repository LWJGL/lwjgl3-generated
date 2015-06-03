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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/multi_bind.txt">ARB_multi_bind</a> extension.
 * 
 * <p>This extension provides a new set of commands allowing applications to bind or unbind a set of objects in a single call, instead of requiring a separate
 * call for each bind or unbind operation.  Using a single command allows OpenGL implementations to amortize function call, name space lookup, and
 * potential locking overhead over multiple bind or unbind operations. The rendering loops of graphics applications frequently switch between different
 * states, binding different sets of resources, including texture objects, sampler objects, textures for image loads and stores, uniform buffers, and
 * vertex buffers; this extension provides "multi-bind" entry points for all of these object types.</p>
 * 
 * <p>Each command in this extension includes a &lt;first&gt; and &lt;count&gt; parameter, specifying a continguous range of binding points to update, as well
 * as an array of &lt;count&gt; object names specifying the objects to bind. Unlike single bind commands, multi-bind commands can be used only to bind or
 * unbind existing objects. Passing a previously unused object name (generated or not) results in an error and does not create a new object. For binding
 * points with associated data (e.g., ranges of a buffer), separate arrays are used to pass the associated data for each binding point. Passing zero values
 * in the array of object names removes the object bound to the current bounding point. Additionally, if {@code NULL} is passed as the array of objects, objects
 * bound to the entire range of binding points are unbound, as though the caller passed an array of zeroes.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}. Promoted to core in {@link GL44 OpenGL 4.4}.</p>
 */
public final class ARBMultiBind {

	/** Function address. */
	@JavadocExclude
	public final long
		BindBuffersBase,
		BindBuffersRange,
		BindTextures,
		BindSamplers,
		BindImageTextures,
		BindVertexBuffers;

	@JavadocExclude
	public ARBMultiBind(FunctionProvider provider) {
		BindBuffersBase = provider.getFunctionAddress("glBindBuffersBase");
		BindBuffersRange = provider.getFunctionAddress("glBindBuffersRange");
		BindTextures = provider.getFunctionAddress("glBindTextures");
		BindSamplers = provider.getFunctionAddress("glBindSamplers");
		BindImageTextures = provider.getFunctionAddress("glBindImageTextures");
		BindVertexBuffers = provider.getFunctionAddress("glBindVertexBuffers");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBMultiBind} instance for the current context. */
	public static ARBMultiBind getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBMultiBind);
	}

	static ARBMultiBind create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_multi_bind") ) return null;

		ARBMultiBind funcs = new ARBMultiBind(provider);

		boolean supported = checkFunctions(
			funcs.BindBuffersBase, funcs.BindBuffersRange, funcs.BindTextures, funcs.BindSamplers, funcs.BindImageTextures, funcs.BindVertexBuffers
		);

		return GL.checkExtension("GL_ARB_multi_bind", funcs, supported);
	}

	// --- [ glBindBuffersBase ] ---

	/** Unsafe version of {@link #glBindBuffersBase BindBuffersBase} */
	@JavadocExclude
	public static void nglBindBuffersBase(int target, int first, int count, long buffers) {
		long __functionAddress = getInstance().BindBuffersBase;
		GL44.nglBindBuffersBase(target, first, count, buffers, __functionAddress);
	}

	/**
	 * Binds {@code count} existing buffer objects to bindings numbered {@code first} through {@code first+count-1} in the array of buffer binding points
	 * corresponding to {@code target}. If {@code buffers} is not {@code NULL}, it specifies an array of {@code count} values, each of which must be zero or the name
	 * of an existing buffer object. It is equivalent to:
	 * <pre><code style="font-family: monospace">
	 * for ( i = 0; i < count; i++ ) {
	 * 	if ( buffers == NULL ) {
	 * 		glBindBufferBase(target, first + i, 0);
	 * 	} else {
	 * 		glBindBufferBase(target, first + i, buffers[i]);
	 * 	}
	 * }</code></pre>
	 * except that the single general buffer binding corresponding to {@code target} is unmodified, and that buffers will not be created if they do not exist.
	 *
	 * @param target  the buffer object target. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param first   the first binding
	 * @param count   the number of bindings
	 * @param buffers an array of zeros or names of existing buffers objects
	 */
	public static void glBindBuffersBase(int target, int first, int count, ByteBuffer buffers) {
		if ( LWJGLUtil.CHECKS )
			if ( buffers != null ) checkBuffer(buffers, count << 2);
		nglBindBuffersBase(target, first, count, memAddressSafe(buffers));
	}

	/** Alternative version of: {@link #glBindBuffersBase BindBuffersBase} */
	public static void glBindBuffersBase(int target, int first, IntBuffer buffers) {
		nglBindBuffersBase(target, first, buffers == null ? 0 : buffers.remaining(), memAddressSafe(buffers));
	}

	// --- [ glBindBuffersRange ] ---

	/** Unsafe version of {@link #glBindBuffersRange BindBuffersRange} */
	@JavadocExclude
	public static void nglBindBuffersRange(int target, int first, int count, long buffers, long offsets, long sizes) {
		long __functionAddress = getInstance().BindBuffersRange;
		GL44.nglBindBuffersRange(target, first, count, buffers, offsets, sizes, __functionAddress);
	}

	/**
	 * Binds {@code count} existing buffer objects to bindings numbered {@code first} through {@code first+count-1} in the array of buffer binding points
	 * corresponding to {@code target}. {@code offsets} and {@code sizes} specify arrays of {@code count} values indicating the range of each buffer to bind.
	 * If {@code buffers} is {@code NULL}, all bindings from {@code first} through {@code first+count-1} are reset to their unbound (zero) state. In this
	 * case, the offsets and sizes associated with the binding points are set to default values, ignoring {@code offsets} and {@code sizes}. It is equivalent
	 * to:
	 * <pre><code style="font-family: monospace">
	 * for ( i = 0; i < count; i++ ) {
	 * 	if ( buffers == NULL ) {
	 * 		glBindBufferRange(target, first + i, 0, 0, 0);
	 * 	} else {
	 * 		glBindBufferRange(target, first + i, buffers[i], offsets[i], sizes[i]);
	 * 	}
	 * }</code></pre>
	 * except that the single general buffer binding corresponding to {@code target} is unmodified, and that buffers will not be created if they do not exist.
	 * 
	 * <p>The values specified in {@code buffers}, {@code offsets}, and {@code sizes} will be checked separately for each binding point. When values for a
	 * specific binding point are invalid, the state for that binding point will be unchanged and an error will be generated. However, state for other binding
	 * points will still be changed if their corresponding values are valid.</p>
	 *
	 * @param target  the buffer object target. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param first   the first binding
	 * @param count   the number of bindings
	 * @param buffers an array of names of existing buffers objects
	 * @param offsets an array of offsets
	 * @param sizes   an array of sizes
	 */
	public static void glBindBuffersRange(int target, int first, int count, ByteBuffer buffers, ByteBuffer offsets, ByteBuffer sizes) {
		if ( LWJGLUtil.CHECKS ) {
			if ( buffers != null ) checkBuffer(buffers, count << 2);
			if ( offsets != null ) checkBuffer(offsets, count << POINTER_SHIFT);
			if ( sizes != null ) checkBuffer(sizes, count << POINTER_SHIFT);
		}
		nglBindBuffersRange(target, first, count, memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(sizes));
	}

	/** Alternative version of: {@link #glBindBuffersRange BindBuffersRange} */
	public static void glBindBuffersRange(int target, int first, IntBuffer buffers, PointerBuffer offsets, PointerBuffer sizes) {
		if ( LWJGLUtil.CHECKS ) {
			if ( offsets != null ) checkBuffer(offsets, buffers.remaining());
			if ( sizes != null ) checkBuffer(sizes, buffers.remaining());
		}
		nglBindBuffersRange(target, first, buffers == null ? 0 : buffers.remaining(), memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(sizes));
	}

	// --- [ glBindTextures ] ---

	/** Unsafe version of {@link #glBindTextures BindTextures} */
	@JavadocExclude
	public static void nglBindTextures(int first, int count, long textures) {
		long __functionAddress = getInstance().BindTextures;
		GL44.nglBindTextures(first, count, textures, __functionAddress);
	}

	/**
	 * Binds {@code count} existing texture objects to texture image units numbered {@code first} through {@code first+count-1}. If {@code textures} is not
	 * {@code NULL}, it specifies an array of {@code count} values, each of which must be zero or the name of an existing texture object. When an entry in
	 * {@code textures} is the name of an existing texture object, that object is bound to corresponding texture unit for the target specified when the texture
	 * object was created. When an entry in {@code textures} is zero, each of the targets enumerated at the beginning of this section is reset to its default
	 * texture for the corresponding texture image unit. If {@code textures} is {@code NULL}, each target of each affected texture image unit from {@code first}
	 * through {@code first+count-1} is reset to its default texture.
	 * 
	 * <p>{@code BindTextures} is equivalent to:
	 * <pre><code style="font-family: monospace">
	 * for ( i = 0; i < count; i++ ) {
	 * 	uint texture;
	 * 	if ( textures == NULL ) {
	 * 		texture = 0;
	 * 	} else {
	 * 		texture = textures[i];
	 * 	}
	 * 	ActiveTexture(TEXTURE0 + first + i);
	 * 	if ( texture != 0 ) {
	 * 		enum target; // target of texture object textures[i]
	 * 		BindTexture(target, textures[i]);
	 * 	} else {
	 * 		for ( target in all supported targets ) {
	 * 			BindTexture(target, 0);
	 * 		}
	 * 	}
	 * }</code></pre>
	 * except that the active texture selector retains its original value upon completion of the command, and that textures will not be created if they do not
	 * exist.</p>
	 * 
	 * <p>The values specified in {@code textures} will be checked separately for each texture image unit. When a value for a specific texture image unit is
	 * invalid, the state for that texture image unit will be unchanged and an error will be generated. However, state for other texture image units will still
	 * be changed if their corresponding values are valid.</p>
	 *
	 * @param first    the first texture objects
	 * @param count    the number of texture objects
	 * @param textures an array of zeros or names of existing texture objects
	 */
	public static void glBindTextures(int first, int count, ByteBuffer textures) {
		if ( LWJGLUtil.CHECKS )
			if ( textures != null ) checkBuffer(textures, count << 2);
		nglBindTextures(first, count, memAddressSafe(textures));
	}

	/** Alternative version of: {@link #glBindTextures BindTextures} */
	public static void glBindTextures(int first, IntBuffer textures) {
		nglBindTextures(first, textures == null ? 0 : textures.remaining(), memAddressSafe(textures));
	}

	// --- [ glBindSamplers ] ---

	/** Unsafe version of {@link #glBindSamplers BindSamplers} */
	@JavadocExclude
	public static void nglBindSamplers(int first, int count, long samplers) {
		long __functionAddress = getInstance().BindSamplers;
		GL44.nglBindSamplers(first, count, samplers, __functionAddress);
	}

	/**
	 * Binds {@code count} existing sampler objects to texture image units numbered {@code first} through {@code first+count-1}. If {@code samplers} is not
	 * {@code NULL}, it specifies an array of {@code count} values, each of which must be zero or the name of an existing sampler object. If {@code samplers} is {@code NULL},
	 * each affected texture image unit from {@code first} through {@code first+count-1} will be reset to have no bound sampler object.
	 * 
	 * <p>{@code BindSamplers} is equivalent to:
	 * <pre><code style="font-family: monospace">
	 * for ( i = 0; i < count; i++ ) {
	 * 	if ( samplers == NULL ) {
	 * 		glBindSampler(first + i, 0);
	 * 	} else {
	 * 		glBindSampler(first + i, samplers[i]);
	 * 	}
	 * }</code></pre>
	 * The values specified in {@code samplers} will be checked separately for each texture image unit. When a value for a specific texture image unit is
	 * invalid, the state for that texture image unit will be unchanged and an error will be generated. However, state for other texture image units will still
	 * be changed if their corresponding values are valid.</p>
	 *
	 * @param first    the first sampler object
	 * @param count    the number of sampler objects
	 * @param samplers an array of zeros or names of existing sampler objects
	 */
	public static void glBindSamplers(int first, int count, ByteBuffer samplers) {
		if ( LWJGLUtil.CHECKS )
			if ( samplers != null ) checkBuffer(samplers, count << 2);
		nglBindSamplers(first, count, memAddressSafe(samplers));
	}

	/** Alternative version of: {@link #glBindSamplers BindSamplers} */
	public static void glBindSamplers(int first, IntBuffer samplers) {
		nglBindSamplers(first, samplers == null ? 0 : samplers.remaining(), memAddressSafe(samplers));
	}

	// --- [ glBindImageTextures ] ---

	/** Unsafe version of {@link #glBindImageTextures BindImageTextures} */
	@JavadocExclude
	public static void nglBindImageTextures(int first, int count, long textures) {
		long __functionAddress = getInstance().BindImageTextures;
		GL44.nglBindImageTextures(first, count, textures, __functionAddress);
	}

	/**
	 * Binds {@code count} existing texture objects to image units numbered {@code first} through {@code first+count-1}. If {@code textures} is not {@code NULL}, it
	 * specifies an array of {@code count} values, each of which must be zero or the name of an existing texture object. If {@code textures} is {@code NULL}, each
	 * affected image unit from {@code first} through {@code first+count-1} will be reset to have no bound texture object.
	 * 
	 * <p>When binding a non-zero texture object to an image unit, the image unit {@code level}, {@code layered}, {@code layer}, and {@code access} parameters are
	 * set to zero, {@link GL11#GL_TRUE TRUE}, zero, and {@link GL15#GL_READ_WRITE READ_WRITE}, respectively. The image unit {@code format} parameter is taken from the internal
	 * format of the texture image at level zero of the texture object identified by {@code textures}. For cube map textures, the internal format of the
	 * {@link GL13#GL_TEXTURE_CUBE_MAP_POSITIVE_X TEXTURE_CUBE_MAP_POSITIVE_X} image of level zero is used. For multisample, multisample array, buffer, and rectangle textures, the internal
	 * format of the single texture level is used.</p>
	 * 
	 * <p>When unbinding a texture object from an image unit, the image unit parameters {@code level}, {@code layered}, {@code layer}, and {@code format} will be
	 * reset to their default values of zero, {@link GL11#GL_FALSE FALSE}, 0, and {@link GL30#GL_R8 R8}, respectively.</p>
	 * 
	 * <p>{@code BindImageTextures} is equivalent to:
	 * <pre><code style="font-family: monospace">
	 * for ( i = 0; i < count; i++ ) {
	 * 	if ( textures == NULL || textures[i] = 0 ) {
	 * 		glBindImageTexture(first + i, 0, 0, FALSE, 0, READ_ONLY, R8);
	 * 	} else {
	 * 		glBindImageTexture(first + i, textures[i], 0, TRUE, 0, READ_WRITE, lookupInternalFormat(textures[i]));
	 * 	}
	 * }</code></pre>
	 * where {@code lookupInternalFormat} returns the internal format of the specified texture object.</p>
	 * 
	 * <p>The values specified in {@code textures} will be checked separately for each image unit. When a value for a specific image unit is invalid, the state
	 * for that image unit will be unchanged and an error will be generated. However, state for other image units will still be changed if their corresponding
	 * values are valid.</p>
	 *
	 * @param first    the first image unit
	 * @param count    the number of image units
	 * @param textures an array of zeros or names of existing texture objects
	 */
	public static void glBindImageTextures(int first, int count, ByteBuffer textures) {
		if ( LWJGLUtil.CHECKS )
			if ( textures != null ) checkBuffer(textures, count << 2);
		nglBindImageTextures(first, count, memAddressSafe(textures));
	}

	/** Alternative version of: {@link #glBindImageTextures BindImageTextures} */
	public static void glBindImageTextures(int first, IntBuffer textures) {
		nglBindImageTextures(first, textures == null ? 0 : textures.remaining(), memAddressSafe(textures));
	}

	// --- [ glBindVertexBuffers ] ---

	/** Unsafe version of {@link #glBindVertexBuffers BindVertexBuffers} */
	@JavadocExclude
	public static void nglBindVertexBuffers(int first, int count, long buffers, long offsets, long strides) {
		long __functionAddress = getInstance().BindVertexBuffers;
		GL44.nglBindVertexBuffers(first, count, buffers, offsets, strides, __functionAddress);
	}

	/**
	 * Binds {@code count} existing buffer objects to vertex buffer binding points numbered {@code first} through {@code first+count-1}. If {@code buffers} is
	 * not {@code NULL}, it specifies an array of {@code count} values, each of which must be zero or the name of an existing buffer object. {@code offsets} and
	 * {@code strides} specify arrays of {@code count} values indicating the offset of the first element and stride between elements in each buffer,
	 * respectively. If {@code buffers} is {@code NULL}, each affected vertex buffer binding point from {@code first} through {@code first+count-1} will be reset to
	 * have no bound buffer object. In this case, the offsets and strides associated with the binding points are set to default values, ignoring
	 * {@code offsets} and {@code strides}.
	 * 
	 * <p>{@code BindVertexBuffers} is equivalent to:
	 * <pre><code style="font-family: monospace">
	 * for ( i = 0; i < count; i++ ) {
	 * 	if ( buffers == NULL ) {
	 * 		glBindVertexBuffer(first + i, 0, 0, 16);
	 * 	} else {
	 * 		glBindVertexBuffer(first + i, buffers[i], offsets[i], strides[i]);
	 * 	}
	 * }</code></pre>
	 * except that buffers will not be created if they do not exist.</p>
	 * 
	 * <p>The values specified in {@code buffers}, {@code offsets}, and {@code strides} will be checked separately for each vertex buffer binding point. When a
	 * value for a specific binding point is invalid, the state for that binding point will be unchanged and an error will be generated. However, state for
	 * other binding points will still be changed if their corresponding values are valid.</p>
	 *
	 * @param first   the first vertex buffer binding point
	 * @param count   the number of vertex buffer binding points
	 * @param buffers an array of zeros or names of existing buffers objects
	 * @param offsets an array of offses
	 * @param strides an array of stride values
	 */
	public static void glBindVertexBuffers(int first, int count, ByteBuffer buffers, ByteBuffer offsets, ByteBuffer strides) {
		if ( LWJGLUtil.CHECKS ) {
			if ( buffers != null ) checkBuffer(buffers, count << 2);
			if ( offsets != null ) checkBuffer(offsets, count << POINTER_SHIFT);
			if ( strides != null ) checkBuffer(strides, count << 2);
		}
		nglBindVertexBuffers(first, count, memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(strides));
	}

	/** Alternative version of: {@link #glBindVertexBuffers BindVertexBuffers} */
	public static void glBindVertexBuffers(int first, IntBuffer buffers, PointerBuffer offsets, IntBuffer strides) {
		if ( LWJGLUtil.CHECKS ) {
			if ( offsets != null ) checkBuffer(offsets, buffers.remaining());
			if ( strides != null ) checkBuffer(strides, buffers.remaining());
		}
		nglBindVertexBuffers(first, buffers == null ? 0 : buffers.remaining(), memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(strides));
	}

}