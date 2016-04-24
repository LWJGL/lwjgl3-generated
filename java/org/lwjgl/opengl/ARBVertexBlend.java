/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

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

	protected ARBVertexBlend() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glWeightfvARB, caps.glWeightbvARB, caps.glWeightubvARB, caps.glWeightsvARB, caps.glWeightusvARB, caps.glWeightivARB, caps.glWeightuivARB, 
			caps.glWeightdvARB, caps.glWeightPointerARB, caps.glVertexBlendARB
		);
	}

	// --- [ glWeightfvARB ] ---

	/**
	 * Sets the current vertex weights.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void nglWeightfvARB(int size, long weights) {
		long __functionAddress = GL.getCapabilities().glWeightfvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, size, weights);
	}

	/**
	 * Sets the current vertex weights.
	 *
	 * @param weights the vertex weights
	 */
	public static void glWeightfvARB(FloatBuffer weights) {
		nglWeightfvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightbvARB ] ---

	/**
	 * Byte version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void nglWeightbvARB(int size, long weights) {
		long __functionAddress = GL.getCapabilities().glWeightbvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, size, weights);
	}

	/**
	 * Byte version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param weights the vertex weights
	 */
	public static void glWeightbvARB(ByteBuffer weights) {
		nglWeightbvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightubvARB ] ---

	/**
	 * Unsigned byte version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void nglWeightubvARB(int size, long weights) {
		long __functionAddress = GL.getCapabilities().glWeightubvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, size, weights);
	}

	/**
	 * Unsigned byte version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param weights the vertex weights
	 */
	public static void glWeightubvARB(ByteBuffer weights) {
		nglWeightubvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightsvARB ] ---

	/**
	 * Short version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void nglWeightsvARB(int size, long weights) {
		long __functionAddress = GL.getCapabilities().glWeightsvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, size, weights);
	}

	/**
	 * Short version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param weights the vertex weights
	 */
	public static void glWeightsvARB(ShortBuffer weights) {
		nglWeightsvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightusvARB ] ---

	/**
	 * Unsigned short version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void nglWeightusvARB(int size, long weights) {
		long __functionAddress = GL.getCapabilities().glWeightusvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, size, weights);
	}

	/**
	 * Unsigned short version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param weights the vertex weights
	 */
	public static void glWeightusvARB(ShortBuffer weights) {
		nglWeightusvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightivARB ] ---

	/**
	 * Integer version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void nglWeightivARB(int size, long weights) {
		long __functionAddress = GL.getCapabilities().glWeightivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, size, weights);
	}

	/**
	 * Integer version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param weights the vertex weights
	 */
	public static void glWeightivARB(IntBuffer weights) {
		nglWeightivARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightuivARB ] ---

	/**
	 * Unsigned integer version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void nglWeightuivARB(int size, long weights) {
		long __functionAddress = GL.getCapabilities().glWeightuivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, size, weights);
	}

	/**
	 * Unsigned integer version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param weights the vertex weights
	 */
	public static void glWeightuivARB(IntBuffer weights) {
		nglWeightuivARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightdvARB ] ---

	/**
	 * Double version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param size    the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param weights the vertex weights
	 */
	public static void nglWeightdvARB(int size, long weights) {
		long __functionAddress = GL.getCapabilities().glWeightdvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, size, weights);
	}

	/**
	 * Double version of {@link #glWeightfvARB WeightfvARB}.
	 *
	 * @param weights the vertex weights
	 */
	public static void glWeightdvARB(DoubleBuffer weights) {
		nglWeightdvARB(weights.remaining(), memAddress(weights));
	}

	// --- [ glWeightPointerARB ] ---

	/**
	 * Specifies the location and organization of a weight array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the weight data
	 */
	public static void nglWeightPointerARB(int size, int type, int stride, long pointer) {
		long __functionAddress = GL.getCapabilities().glWeightPointerARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/**
	 * Specifies the location and organization of a weight array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the weight data
	 */
	public static void glWeightPointerARB(int size, int type, int stride, ByteBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglWeightPointerARB(size, type, stride, memAddress(pointer));
	}

	/**
	 * Specifies the location and organization of a weight array.
	 *
	 * @param size    the number of values per vertex that are stored in the array. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
	 * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer the weight data
	 */
	public static void glWeightPointerARB(int size, int type, int stride, long pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglWeightPointerARB(size, type, stride, pointer);
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
		long __functionAddress = GL.getCapabilities().glVertexBlendARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, count);
	}

	/** Array version of: {@link #glWeightfvARB WeightfvARB} */
	public static void glWeightfvARB(float[] weights) {
		long __functionAddress = GL.getCapabilities().glWeightfvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, weights.length, weights);
	}

	/** Array version of: {@link #glWeightsvARB WeightsvARB} */
	public static void glWeightsvARB(short[] weights) {
		long __functionAddress = GL.getCapabilities().glWeightsvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, weights.length, weights);
	}

	/** Array version of: {@link #glWeightusvARB WeightusvARB} */
	public static void glWeightusvARB(short[] weights) {
		long __functionAddress = GL.getCapabilities().glWeightusvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, weights.length, weights);
	}

	/** Array version of: {@link #glWeightivARB WeightivARB} */
	public static void glWeightivARB(int[] weights) {
		long __functionAddress = GL.getCapabilities().glWeightivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, weights.length, weights);
	}

	/** Array version of: {@link #glWeightuivARB WeightuivARB} */
	public static void glWeightuivARB(int[] weights) {
		long __functionAddress = GL.getCapabilities().glWeightuivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, weights.length, weights);
	}

	/** Array version of: {@link #glWeightdvARB WeightdvARB} */
	public static void glWeightdvARB(double[] weights) {
		long __functionAddress = GL.getCapabilities().glWeightdvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, weights.length, weights);
	}

	/** short[] version of: {@link #glWeightPointerARB WeightPointerARB} */
	public static void glWeightPointerARB(int size, int type, int stride, short[] pointer) {
		long __functionAddress = GL.getCapabilities().glWeightPointerARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/** int[] version of: {@link #glWeightPointerARB WeightPointerARB} */
	public static void glWeightPointerARB(int size, int type, int stride, int[] pointer) {
		long __functionAddress = GL.getCapabilities().glWeightPointerARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, size, type, stride, pointer);
	}

	/** float[] version of: {@link #glWeightPointerARB WeightPointerARB} */
	public static void glWeightPointerARB(int size, int type, int stride, float[] pointer) {
		long __functionAddress = GL.getCapabilities().glWeightPointerARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, size, type, stride, pointer);
	}

}