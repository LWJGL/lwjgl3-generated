/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/vertex_blend.txt">ARB_vertex_blend</a> extension.
 * 
 * <p>This extension provides the ability to replace the single modelview transformation with a set of n vertex units. (Where n is constrained to an
 * implementation defined maximum.) Each unit has its own modelview transform matrix. For each unit, there is a current weight associated with the vertex.
 * When this extension is enabled the vertices are transformed by the modelview matrices of all of the enabled units. Afterward, these results are scaled
 * by the weights for the respective units and then summed to create the eye-space vertex. A similar procedure is followed for the normals, except they are
 * transformed by the inverse transpose of the modelview matrices.</p>
 */
public class ARBVertexBlend {

	/** Accepted by the {@code value} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_UNITS_ARB    = 0x86A4,
		GL_ACTIVE_VERTEX_UNITS_ARB = 0x86A5;

	/**
	 * Accepted by the {@code cap} parameters of Enable and Disable, by the {@code value} parameter of IsEnabled, GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int
		GL_WEIGHT_SUM_UNITY_ARB = 0x86A6,
		GL_VERTEX_BLEND_ARB     = 0x86A7;

	/** Accepted by the {@code mode} parameter of MatrixMode and by the {@code value} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MODELVIEW0_ARB  = 0x1700,
		GL_MODELVIEW1_ARB  = 0x850A,
		GL_MODELVIEW2_ARB  = 0x8722,
		GL_MODELVIEW3_ARB  = 0x8723,
		GL_MODELVIEW4_ARB  = 0x8724,
		GL_MODELVIEW5_ARB  = 0x8725,
		GL_MODELVIEW6_ARB  = 0x8726,
		GL_MODELVIEW7_ARB  = 0x8727,
		GL_MODELVIEW8_ARB  = 0x8728,
		GL_MODELVIEW9_ARB  = 0x8729,
		GL_MODELVIEW10_ARB = 0x872A,
		GL_MODELVIEW11_ARB = 0x872B,
		GL_MODELVIEW12_ARB = 0x872C,
		GL_MODELVIEW13_ARB = 0x872D,
		GL_MODELVIEW14_ARB = 0x872E,
		GL_MODELVIEW15_ARB = 0x872F,
		GL_MODELVIEW16_ARB = 0x8730,
		GL_MODELVIEW17_ARB = 0x8731,
		GL_MODELVIEW18_ARB = 0x8732,
		GL_MODELVIEW19_ARB = 0x8733,
		GL_MODELVIEW20_ARB = 0x8734,
		GL_MODELVIEW21_ARB = 0x8735,
		GL_MODELVIEW22_ARB = 0x8736,
		GL_MODELVIEW23_ARB = 0x8737,
		GL_MODELVIEW24_ARB = 0x8738,
		GL_MODELVIEW25_ARB = 0x8739,
		GL_MODELVIEW26_ARB = 0x873A,
		GL_MODELVIEW27_ARB = 0x873B,
		GL_MODELVIEW28_ARB = 0x873C,
		GL_MODELVIEW29_ARB = 0x873D,
		GL_MODELVIEW30_ARB = 0x873E,
		GL_MODELVIEW31_ARB = 0x873F;

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_CURRENT_WEIGHT_ARB = 0x86A8;

	/** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_WEIGHT_ARRAY_TYPE_ARB   = 0x86A9,
		GL_WEIGHT_ARRAY_STRIDE_ARB = 0x86AA,
		GL_WEIGHT_ARRAY_SIZE_ARB   = 0x86AB;

	/** Accepted by the {@code pname} parameter of GetPointerv. */
	public static final int GL_WEIGHT_ARRAY_POINTER_ARB = 0x86AC;

	/**
	 * Accepted by the {@code cap} parameters of EnableClientState and DisableClientState, by the {@code value} parameter of IsEnabled, GetBooleanv,
	 * GetIntegerv, GetFloatv, and GetDoublev.
	 */
	public static final int GL_WEIGHT_ARRAY_ARB = 0x86AD;

	/** Function address. */
	@JavadocExclude
	public final long
		WeightfvARB,
		WeightbvARB,
		WeightubvARB,
		WeightsvARB,
		WeightusvARB,
		WeightivARB,
		WeightuivARB,
		WeightdvARB,
		WeightPointerARB,
		VertexBlendARB;

	@JavadocExclude
	protected ARBVertexBlend() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public ARBVertexBlend(FunctionProvider provider) {
		WeightfvARB = provider.getFunctionAddress("glWeightfvARB");
		WeightbvARB = provider.getFunctionAddress("glWeightbvARB");
		WeightubvARB = provider.getFunctionAddress("glWeightubvARB");
		WeightsvARB = provider.getFunctionAddress("glWeightsvARB");
		WeightusvARB = provider.getFunctionAddress("glWeightusvARB");
		WeightivARB = provider.getFunctionAddress("glWeightivARB");
		WeightuivARB = provider.getFunctionAddress("glWeightuivARB");
		WeightdvARB = provider.getFunctionAddress("glWeightdvARB");
		WeightPointerARB = provider.getFunctionAddress("glWeightPointerARB");
		VertexBlendARB = provider.getFunctionAddress("glVertexBlendARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBVertexBlend} instance of the current context. */
	public static ARBVertexBlend getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link ARBVertexBlend} instance of the specified {@link GLCapabilities}. */
	public static ARBVertexBlend getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__ARBVertexBlend);
	}

	static ARBVertexBlend create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_vertex_blend") ) return null;

		ARBVertexBlend funcs = new ARBVertexBlend(provider);

		boolean supported = checkFunctions(
			funcs.WeightfvARB, funcs.WeightbvARB, funcs.WeightubvARB, funcs.WeightsvARB, funcs.WeightusvARB, funcs.WeightivARB, funcs.WeightuivARB, 
			funcs.WeightdvARB, funcs.WeightPointerARB, funcs.VertexBlendARB
		);

		return GL.checkExtension("GL_ARB_vertex_blend", funcs, supported);
	}

	// --- [ glWeightfvARB ] ---

	/** Unsafe version of {@link #glWeightfvARB WeightfvARB} */
	@JavadocExclude
	public static void nglWeightfvARB(int size, long weights) {
		long __functionAddress = getInstance().WeightfvARB;
		callIPV(__functionAddress, size, weights);
	}

	/**
	 * Sets the current vertex weights.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightfvARB(int size, ByteBuffer weights) {
		if ( CHECKS )
			checkBuffer(weights, size << 2);
		nglWeightfvARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightfvARB WeightfvARB} */
	public static void glWeightfvARB(FloatBuffer weights) {
		nglWeightfvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightbvARB ] ---

	/** Unsafe version of {@link #glWeightbvARB WeightbvARB} */
	@JavadocExclude
	public static void nglWeightbvARB(int size, long weights) {
		long __functionAddress = getInstance().WeightbvARB;
		callIPV(__functionAddress, size, weights);
	}

	/**
	 * Byte version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightbvARB(int size, ByteBuffer weights) {
		if ( CHECKS )
			checkBuffer(weights, size);
		nglWeightbvARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightbvARB WeightbvARB} */
	public static void glWeightbvARB(ByteBuffer weights) {
		nglWeightbvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightubvARB ] ---

	/** Unsafe version of {@link #glWeightubvARB WeightubvARB} */
	@JavadocExclude
	public static void nglWeightubvARB(int size, long weights) {
		long __functionAddress = getInstance().WeightubvARB;
		callIPV(__functionAddress, size, weights);
	}

	/**
	 * Unsigned byte version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightubvARB(int size, ByteBuffer weights) {
		if ( CHECKS )
			checkBuffer(weights, size);
		nglWeightubvARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightubvARB WeightubvARB} */
	public static void glWeightubvARB(ByteBuffer weights) {
		nglWeightubvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightsvARB ] ---

	/** Unsafe version of {@link #glWeightsvARB WeightsvARB} */
	@JavadocExclude
	public static void nglWeightsvARB(int size, long weights) {
		long __functionAddress = getInstance().WeightsvARB;
		callIPV(__functionAddress, size, weights);
	}

	/**
	 * Short version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightsvARB(int size, ByteBuffer weights) {
		if ( CHECKS )
			checkBuffer(weights, size << 1);
		nglWeightsvARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightsvARB WeightsvARB} */
	public static void glWeightsvARB(ShortBuffer weights) {
		nglWeightsvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightusvARB ] ---

	/** Unsafe version of {@link #glWeightusvARB WeightusvARB} */
	@JavadocExclude
	public static void nglWeightusvARB(int size, long weights) {
		long __functionAddress = getInstance().WeightusvARB;
		callIPV(__functionAddress, size, weights);
	}

	/**
	 * Unsigned short version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightusvARB(int size, ByteBuffer weights) {
		if ( CHECKS )
			checkBuffer(weights, size << 1);
		nglWeightusvARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightusvARB WeightusvARB} */
	public static void glWeightusvARB(ShortBuffer weights) {
		nglWeightusvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightivARB ] ---

	/** Unsafe version of {@link #glWeightivARB WeightivARB} */
	@JavadocExclude
	public static void nglWeightivARB(int size, long weights) {
		long __functionAddress = getInstance().WeightivARB;
		callIPV(__functionAddress, size, weights);
	}

	/**
	 * Integer version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightivARB(int size, ByteBuffer weights) {
		if ( CHECKS )
			checkBuffer(weights, size << 2);
		nglWeightivARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightivARB WeightivARB} */
	public static void glWeightivARB(IntBuffer weights) {
		nglWeightivARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightuivARB ] ---

	/** Unsafe version of {@link #glWeightuivARB WeightuivARB} */
	@JavadocExclude
	public static void nglWeightuivARB(int size, long weights) {
		long __functionAddress = getInstance().WeightuivARB;
		callIPV(__functionAddress, size, weights);
	}

	/**
	 * Unsigned integer version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightuivARB(int size, ByteBuffer weights) {
		if ( CHECKS )
			checkBuffer(weights, size << 2);
		nglWeightuivARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightuivARB WeightuivARB} */
	public static void glWeightuivARB(IntBuffer weights) {
		nglWeightuivARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightdvARB ] ---

	/** Unsafe version of {@link #glWeightdvARB WeightdvARB} */
	@JavadocExclude
	public static void nglWeightdvARB(int size, long weights) {
		long __functionAddress = getInstance().WeightdvARB;
		callIPV(__functionAddress, size, weights);
	}

	/**
	 * Double version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void glWeightdvARB(int size, ByteBuffer weights) {
		if ( CHECKS )
			checkBuffer(weights, size << 3);
		nglWeightdvARB(size, memAddress(weights));
	}

	/** Alternative version of: {@link #glWeightdvARB WeightdvARB} */
	public static void glWeightdvARB(DoubleBuffer weights) {
		nglWeightdvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightPointerARB ] ---

	/** Unsafe version of {@link #glWeightPointerARB WeightPointerARB} */
	@JavadocExclude
	public static void nglWeightPointerARB(int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().WeightPointerARB;
		callIIIPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * Specifies the location and organization of a weight array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param type    the data type of the values stored in the array. One of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL11#GL_DOUBLE DOUBLE}
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the weight data
	 */
	public static void glWeightPointerARB(int size, int type, int stride, ByteBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglWeightPointerARB(size, type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glWeightPointerARB WeightPointerARB} */
	public static void glWeightPointerARB(int size, int type, int stride, long pointerOffset) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglWeightPointerARB(size, type, stride, pointerOffset);
	}

	/** ShortBuffer version of: {@link #glWeightPointerARB WeightPointerARB} */
	public static void glWeightPointerARB(int size, int type, int stride, ShortBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglWeightPointerARB(size, type, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glWeightPointerARB WeightPointerARB} */
	public static void glWeightPointerARB(int size, int type, int stride, IntBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglWeightPointerARB(size, type, stride, memAddress(pointer));
	}

	/** FloatBuffer version of: {@link #glWeightPointerARB WeightPointerARB} */
	public static void glWeightPointerARB(int size, int type, int stride, FloatBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglWeightPointerARB(size, type, stride, memAddress(pointer));
	}

	// --- [ glVertexBlendARB ] ---

	/**
	 * Sets the number of active transformations applied.
	 *
	 * @param count the number of transformations to blend
	 */
	public static void glVertexBlendARB(int count) {
		long __functionAddress = getInstance().VertexBlendARB;
		callIV(__functionAddress, count);
	}

}