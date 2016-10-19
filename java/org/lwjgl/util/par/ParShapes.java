/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Bindings to <a href="https://github.com/prideout/par/blob/master/par_shapes.h">par_shapes.h</a>, a single-file, zero-dependency, C99 library that can
 * generate simple shapes and perform basic operations on them. These operations include:
 * 
 * <ul>
 * <li>Applying affine transformations</li>
 * <li>Computing surface normals</li>
 * <li>Welding colocated vertices</li>
 * </ul>
 * 
 * <p>The library provides a set of functions that populate fields of the {@link ParShapesMesh} structure.</p>
 * 
 * <p>The {@code normals} and {@code tcoords} fields might be null, but every other field is guaranteed to have valid values. This mesh representation is
 * very limited: indices must be unsigned 16-bit integers, points must be three-tuples, and there is no support for face-varying data.</p>
 * 
 * <p>When you’re done extracting the data you need from the mesh, be sure to free it:</p>
 * 
 * <pre><code>par_shapes_mesh* m = par_shapes_create_subdivided_sphere(1);
// ...
par_shapes_free_mesh(m);</code></pre>
 */
public class ParShapes {

	static { LibPar.initialize(); }

	protected ParShapes() {
		throw new UnsupportedOperationException();
	}

	// --- [ par_shapes_free_mesh ] ---

	/** Unsafe version of: {@link #par_shapes_free_mesh free_mesh} */
	public static native void npar_shapes_free_mesh(long mesh);

	/**
	 * Frees the specified {@link ParShapesMesh} structure.
	 *
	 * @param mesh the mesh to free
	 */
	public static void par_shapes_free_mesh(ParShapesMesh mesh) {
		npar_shapes_free_mesh(mesh.address());
	}

	// --- [ par_shapes_create_cylinder ] ---

	/** Unsafe version of: {@link #par_shapes_create_cylinder create_cylinder} */
	public static native long npar_shapes_create_cylinder(int slices, int stacks);

	/**
	 * Creates a cylinder that sits on the Z=0 plane using the given tessellation levels across the UV domain.  Think of "slices" like a number of pizza
	 * slices, and "stacks" like a number of stacked rings.  Height and radius are both 1.0, but they can easily be changed with {@link #par_shapes_scale scale}.
	 *
	 * @param slices the number of slices
	 * @param stacks the number of stacks
	 */
	public static ParShapesMesh par_shapes_create_cylinder(int slices, int stacks) {
		long __result = npar_shapes_create_cylinder(slices, stacks);
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_torus ] ---

	/** Unsafe version of: {@link #par_shapes_create_torus create_torus} */
	public static native long npar_shapes_create_torus(int slices, int stacks, float radius);

	/**
	 * Creates a donut that sits on the Z=0 plane with the specified inner radius. The outer radius can be controlled with {@link #par_shapes_scale scale}.
	 *
	 * @param slices the number of slices
	 * @param stacks the number of stacks
	 * @param radius the torus radius
	 */
	public static ParShapesMesh par_shapes_create_torus(int slices, int stacks, float radius) {
		long __result = npar_shapes_create_torus(slices, stacks, radius);
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_parametric_sphere ] ---

	/** Unsafe version of: {@link #par_shapes_create_parametric_sphere create_parametric_sphere} */
	public static native long npar_shapes_create_parametric_sphere(int slices, int stacks);

	/**
	 * Creates a sphere with texture coordinates and small triangles near the poles.
	 *
	 * @param slices the number of slices
	 * @param stacks the number of stacks
	 */
	public static ParShapesMesh par_shapes_create_parametric_sphere(int slices, int stacks) {
		long __result = npar_shapes_create_parametric_sphere(slices, stacks);
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_subdivided_sphere ] ---

	/** Unsafe version of: {@link #par_shapes_create_subdivided_sphere create_subdivided_sphere} */
	public static native long npar_shapes_create_subdivided_sphere(int nsubdivisions);

	/**
	 * Approximates a sphere with a subdivided icosahedron, which produces a nice distribution of triangles, but no texture coordinates. Each subdivision
	 * level scales the number of triangles by four, so use a very low number.
	 *
	 * @param nsubdivisions the number of subdivisions
	 */
	public static ParShapesMesh par_shapes_create_subdivided_sphere(int nsubdivisions) {
		long __result = npar_shapes_create_subdivided_sphere(nsubdivisions);
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_klein_bottle ] ---

	/** Unsafe version of: {@link #par_shapes_create_klein_bottle create_klein_bottle} */
	public static native long npar_shapes_create_klein_bottle(int slices, int stacks);

	/**
	 * Creates a klein bottle mesh.
	 *
	 * @param slices the number of slices
	 * @param stacks the number of stacks
	 */
	public static ParShapesMesh par_shapes_create_klein_bottle(int slices, int stacks) {
		long __result = npar_shapes_create_klein_bottle(slices, stacks);
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_trefoil_knot ] ---

	/** Unsafe version of: {@link #par_shapes_create_trefoil_knot create_trefoil_knot} */
	public static native long npar_shapes_create_trefoil_knot(int slices, int stacks, float radius);

	/**
	 * Creates a trefoil knot mesh.
	 *
	 * @param slices the number of slices
	 * @param stacks the number of stacks
	 * @param radius 
	 */
	public static ParShapesMesh par_shapes_create_trefoil_knot(int slices, int stacks, float radius) {
		long __result = npar_shapes_create_trefoil_knot(slices, stacks, radius);
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_hemisphere ] ---

	/** Unsafe version of: {@link #par_shapes_create_hemisphere create_hemisphere} */
	public static native long npar_shapes_create_hemisphere(int slices, int stacks);

	/**
	 * Creates a hemisphere mesh.
	 *
	 * @param slices the number of slices
	 * @param stacks the number of stacks
	 */
	public static ParShapesMesh par_shapes_create_hemisphere(int slices, int stacks) {
		long __result = npar_shapes_create_hemisphere(slices, stacks);
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_plane ] ---

	/** Unsafe version of: {@link #par_shapes_create_plane create_plane} */
	public static native long npar_shapes_create_plane(int slices, int stacks);

	/**
	 * Creates a plane mesh.
	 *
	 * @param slices the number of slices
	 * @param stacks the number of stacks
	 */
	public static ParShapesMesh par_shapes_create_plane(int slices, int stacks) {
		long __result = npar_shapes_create_plane(slices, stacks);
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_icosahedron ] ---

	/** Unsafe version of: {@link #par_shapes_create_icosahedron create_icosahedron} */
	public static native long npar_shapes_create_icosahedron();

	/** Generates points for a 20-sided polyhedron that fits in the unit sphere. Texture coordinates and normals are not generated. */
	public static ParShapesMesh par_shapes_create_icosahedron() {
		long __result = npar_shapes_create_icosahedron();
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_dodecahedron ] ---

	/** Unsafe version of: {@link #par_shapes_create_dodecahedron create_dodecahedron} */
	public static native long npar_shapes_create_dodecahedron();

	/** Generates points for a 12-sided polyhedron that fits in the unit sphere. Texture coordinates and normals are not generated. */
	public static ParShapesMesh par_shapes_create_dodecahedron() {
		long __result = npar_shapes_create_dodecahedron();
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_octohedron ] ---

	/** Unsafe version of: {@link #par_shapes_create_octohedron create_octohedron} */
	public static native long npar_shapes_create_octohedron();

	/** Generates points for an 8-sided polyhedron that fits in the unit sphere. Texture coordinates and normals are not generated. */
	public static ParShapesMesh par_shapes_create_octohedron() {
		long __result = npar_shapes_create_octohedron();
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_tetrahedron ] ---

	/** Unsafe version of: {@link #par_shapes_create_tetrahedron create_tetrahedron} */
	public static native long npar_shapes_create_tetrahedron();

	/** Generates points for a 4-sided polyhedron that fits in the unit sphere. Texture coordinates and normals are not generated. */
	public static ParShapesMesh par_shapes_create_tetrahedron() {
		long __result = npar_shapes_create_tetrahedron();
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_cube ] ---

	/** Unsafe version of: {@link #par_shapes_create_cube create_cube} */
	public static native long npar_shapes_create_cube();

	/** Generates points for a cube that fits in the unit sphere. Texture coordinates and normals are not generated. */
	public static ParShapesMesh par_shapes_create_cube() {
		long __result = npar_shapes_create_cube();
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_disk ] ---

	/** Unsafe version of: {@link #par_shapes_create_disk create_disk} */
	public static native long npar_shapes_create_disk(float radius, int slices, long center, long normal);

	/**
	 * Generates an orientable disk shape in 3-space.  Does not include normals or texture coordinates.
	 *
	 * @param radius the disk radius
	 * @param slices the number of slices
	 * @param center the disk center
	 * @param normal the disk normal
	 */
	public static ParShapesMesh par_shapes_create_disk(float radius, int slices, FloatBuffer center, FloatBuffer normal) {
		long __result = npar_shapes_create_disk(radius, slices, memAddress(center), memAddress(normal));
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_empty ] ---

	/** Unsafe version of: {@link #par_shapes_create_empty create_empty} */
	public static native long npar_shapes_create_empty();

	/** Creates an empty shape. Useful for building scenes with {@link #par_shapes_merge_and_free merge_and_free}. */
	public static ParShapesMesh par_shapes_create_empty() {
		long __result = npar_shapes_create_empty();
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_rock ] ---

	/** Unsafe version of: {@link #par_shapes_create_rock create_rock} */
	public static native long npar_shapes_create_rock(int seed, int nsubdivisions);

	/**
	 * Generates a rock shape that sits on the Y=0 plane, and sinks into it a bit. This includes smooth normals but no texture coordinates. Each subdivision
	 * level scales the number of triangles by four, so use a very low number.
	 *
	 * @param seed          a seed value
	 * @param nsubdivisions the number of subdivisions
	 */
	public static ParShapesMesh par_shapes_create_rock(int seed, int nsubdivisions) {
		long __result = npar_shapes_create_rock(seed, nsubdivisions);
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_create_lsystem ] ---

	/** Unsafe version of: {@link #par_shapes_create_lsystem create_lsystem} */
	public static native long npar_shapes_create_lsystem(long program, int slices, int maxdepth);

	/**
	 * Creates trees or vegetation by executing a recursive turtle graphics program. The program is a list of command-argument pairs. See the
	 * <a href="https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/test/java/org/lwjgl/util/par/ParTest.java#L263">unit test</a> for an example.
	 * Texture coordinates and normals are not generated.
	 *
	 * @param program  the list of command-argument pairs
	 * @param slices   the number of slices
	 * @param maxdepth the maximum depth
	 */
	public static ParShapesMesh par_shapes_create_lsystem(ByteBuffer program, int slices, int maxdepth) {
		if ( CHECKS )
			checkNT1(program);
		long __result = npar_shapes_create_lsystem(memAddress(program), slices, maxdepth);
		return ParShapesMesh.create(__result);
	}

	/**
	 * Creates trees or vegetation by executing a recursive turtle graphics program. The program is a list of command-argument pairs. See the
	 * <a href="https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/test/java/org/lwjgl/util/par/ParTest.java#L263">unit test</a> for an example.
	 * Texture coordinates and normals are not generated.
	 *
	 * @param program  the list of command-argument pairs
	 * @param slices   the number of slices
	 * @param maxdepth the maximum depth
	 */
	public static ParShapesMesh par_shapes_create_lsystem(CharSequence program, int slices, int maxdepth) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer programEncoded = stack.ASCII(program);
			long __result = npar_shapes_create_lsystem(memAddress(programEncoded), slices, maxdepth);
			return ParShapesMesh.create(__result);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ par_shapes_export ] ---

	/** Unsafe version of: {@link #par_shapes_export export} */
	public static native void npar_shapes_export(long mesh, long objfile);

	/**
	 * Dumps out a text file conforming to the venerable OBJ format.
	 *
	 * @param mesh    the mesh to export
	 * @param objfile the OBJ file path
	 */
	public static void par_shapes_export(ParShapesMesh mesh, ByteBuffer objfile) {
		if ( CHECKS )
			checkNT1(objfile);
		npar_shapes_export(mesh.address(), memAddress(objfile));
	}

	/**
	 * Dumps out a text file conforming to the venerable OBJ format.
	 *
	 * @param mesh    the mesh to export
	 * @param objfile the OBJ file path
	 */
	public static void par_shapes_export(ParShapesMesh mesh, CharSequence objfile) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer objfileEncoded = stack.ASCII(objfile);
			npar_shapes_export(mesh.address(), memAddress(objfileEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ par_shapes_compute_aabb ] ---

	/** Unsafe version of: {@link #par_shapes_compute_aabb compute_aabb} */
	public static native void npar_shapes_compute_aabb(long mesh, long aabb);

	/**
	 * Takes a pointer to 6 floats and sets them to min xyz, max xyz.
	 *
	 * @param mesh the mesh to query
	 * @param aabb a pointer to an array of 6 floats in which the AABB will be written
	 */
	public static void par_shapes_compute_aabb(ParShapesMesh mesh, FloatBuffer aabb) {
		if ( CHECKS )
			checkBuffer(aabb, 6);
		npar_shapes_compute_aabb(mesh.address(), memAddress(aabb));
	}

	// --- [ par_shapes_clone ] ---

	/** Unsafe version of: {@link #par_shapes_clone clone} */
	public static native long npar_shapes_clone(long mesh, long target);

	/**
	 * Makes a deep copy of a mesh. To make a brand new copy, pass {@code NULL} to {@code target}. To avoid memory churn, pass an existing mesh to {@code target}.
	 *
	 * @param mesh   the mesh to copy
	 * @param target the target mesh
	 */
	public static ParShapesMesh par_shapes_clone(ParShapesMesh mesh, ParShapesMesh target) {
		long __result = npar_shapes_clone(mesh.address(), memAddressSafe(target));
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_merge ] ---

	/** Unsafe version of: {@link #par_shapes_merge merge} */
	public static native void npar_shapes_merge(long dst, long src);

	/**
	 * Merges two shapes.
	 *
	 * @param dst the destination mesh
	 * @param src the source mesh
	 */
	public static void par_shapes_merge(ParShapesMesh dst, ParShapesMesh src) {
		npar_shapes_merge(dst.address(), src.address());
	}

	// --- [ par_shapes_translate ] ---

	/** Unsafe version of: {@link #par_shapes_translate translate} */
	public static native void npar_shapes_translate(long mesh, float x, float y, float z);

	/**
	 * Translates the specified mesh.
	 *
	 * @param mesh the mesh to translate
	 * @param x    the X axis translation amount
	 * @param y    the Y axis translation amount
	 * @param z    the Z axis translation amount
	 */
	public static void par_shapes_translate(ParShapesMesh mesh, float x, float y, float z) {
		npar_shapes_translate(mesh.address(), x, y, z);
	}

	// --- [ par_shapes_rotate ] ---

	/** Unsafe version of: {@link #par_shapes_rotate rotate} */
	public static native void npar_shapes_rotate(long mesh, float radians, long axis);

	/**
	 * Rotates the specified mesh.
	 *
	 * @param mesh    the mesh to rotate
	 * @param radians the rotation angle, in radians
	 * @param axis    the rotation axis
	 */
	public static void par_shapes_rotate(ParShapesMesh mesh, float radians, FloatBuffer axis) {
		if ( CHECKS )
			checkBuffer(axis, 3);
		npar_shapes_rotate(mesh.address(), radians, memAddress(axis));
	}

	// --- [ par_shapes_scale ] ---

	/** Unsafe version of: {@link #par_shapes_scale scale} */
	public static native void npar_shapes_scale(long mesh, float x, float y, float z);

	/**
	 * Scales the specified mesh.
	 *
	 * @param mesh the mesh to scale
	 * @param x    the X axis scale factor
	 * @param y    the Y axis scale factor
	 * @param z    the Z axis scale factor
	 */
	public static void par_shapes_scale(ParShapesMesh mesh, float x, float y, float z) {
		npar_shapes_scale(mesh.address(), x, y, z);
	}

	// --- [ par_shapes_merge_and_free ] ---

	/** Unsafe version of: {@link #par_shapes_merge_and_free merge_and_free} */
	public static native void npar_shapes_merge_and_free(long dst, long src);

	/**
	 * Merges two shapes and frees the source shape.
	 *
	 * @param dst the destination mesh
	 * @param src the source mesh
	 */
	public static void par_shapes_merge_and_free(ParShapesMesh dst, ParShapesMesh src) {
		npar_shapes_merge_and_free(dst.address(), src.address());
	}

	// --- [ par_shapes_invert ] ---

	/** Unsafe version of: {@link #par_shapes_invert invert} */
	public static native void npar_shapes_invert(long mesh, int startface, int nfaces);

	/**
	 * Reverses the winding of a run of faces. Useful when drawing the inside of a Cornell Box. Pass 0 for {@code nfaces} to reverse every face in the mesh.
	 *
	 * @param mesh      the mesh to reverse
	 * @param startface the index of the first face to reverse
	 * @param nfaces    the number of faces to reverse
	 */
	public static void par_shapes_invert(ParShapesMesh mesh, int startface, int nfaces) {
		npar_shapes_invert(mesh.address(), startface, nfaces);
	}

	// --- [ par_shapes_remove_degenerate ] ---

	/** Unsafe version of: {@link #par_shapes_remove_degenerate remove_degenerate} */
	public static native void npar_shapes_remove_degenerate(long mesh, float minarea);

	/**
	 * Removes all triangles whose area is less than {@code minarea}.
	 *
	 * @param mesh    the mesh to cleanup
	 * @param minarea triangles with an area below this value will be removed
	 */
	public static void par_shapes_remove_degenerate(ParShapesMesh mesh, float minarea) {
		npar_shapes_remove_degenerate(mesh.address(), minarea);
	}

	// --- [ par_shapes_unweld ] ---

	/** Unsafe version of: {@link #par_shapes_unweld unweld} */
	public static native void npar_shapes_unweld(long mesh, boolean create_indices);

	/**
	 * Dereferences the entire index buffer and replaces the point list.
	 * 
	 * <p>This creates an inefficient structure, but is useful for drawing facets. If {@code create_indices} is true, a trivial "0 1 2 3..." index buffer is
	 * generated.</p>
	 *
	 * @param mesh           the mesh to unweld
	 * @param create_indices if an index buffer should be generated
	 */
	public static void par_shapes_unweld(ParShapesMesh mesh, boolean create_indices) {
		npar_shapes_unweld(mesh.address(), create_indices);
	}

	// --- [ par_shapes_weld ] ---

	/** Unsafe version of: {@link #par_shapes_weld weld} */
	public static native long npar_shapes_weld(long mesh, float epsilon, long mapping);

	/**
	 * Merges colocated verts, builds a new index buffer, and returns the optimized mesh. {@code } is
	 * the maximum distance to consider when welding vertices. The mapping argument can be
	 *
	 * @param mesh    the mesh to weld
	 * @param epsilon the maximum distance to consider when welding vertices
	 * @param mapping null, or a pointer to {@code npoints} 16-bit integers, which gets filled with the mapping from old vertex indices to new indices
	 */
	public static ParShapesMesh par_shapes_weld(ParShapesMesh mesh, float epsilon, ShortBuffer mapping) {
		long __result = npar_shapes_weld(mesh.address(), epsilon, memAddressSafe(mapping));
		return ParShapesMesh.create(__result);
	}

	// --- [ par_shapes_compute_normals ] ---

	/** Unsafe version of: {@link #par_shapes_compute_normals compute_normals} */
	public static native void npar_shapes_compute_normals(long mesh);

	/**
	 * Computes smooth normals by averaging adjacent facet normals.
	 *
	 * @param mesh the mesh
	 */
	public static void par_shapes_compute_normals(ParShapesMesh mesh) {
		npar_shapes_compute_normals(mesh.address());
	}

	/** Array version of: {@link #npar_shapes_create_disk} */
	public static native long npar_shapes_create_disk(float radius, int slices, float[] center, float[] normal);

	/** Array version of: {@link #par_shapes_create_disk create_disk} */
	public static ParShapesMesh par_shapes_create_disk(float radius, int slices, float[] center, float[] normal) {
		long __result = npar_shapes_create_disk(radius, slices, center, normal);
		return ParShapesMesh.create(__result);
	}

	/** Array version of: {@link #npar_shapes_compute_aabb} */
	public static native void npar_shapes_compute_aabb(long mesh, float[] aabb);

	/** Array version of: {@link #par_shapes_compute_aabb compute_aabb} */
	public static void par_shapes_compute_aabb(ParShapesMesh mesh, float[] aabb) {
		if ( CHECKS )
			checkBuffer(aabb, 6);
		npar_shapes_compute_aabb(mesh.address(), aabb);
	}

	/** Array version of: {@link #npar_shapes_rotate} */
	public static native void npar_shapes_rotate(long mesh, float radians, float[] axis);

	/** Array version of: {@link #par_shapes_rotate rotate} */
	public static void par_shapes_rotate(ParShapesMesh mesh, float radians, float[] axis) {
		if ( CHECKS )
			checkBuffer(axis, 3);
		npar_shapes_rotate(mesh.address(), radians, axis);
	}

	/** Array version of: {@link #npar_shapes_weld} */
	public static native long npar_shapes_weld(long mesh, float epsilon, short[] mapping);

	/** Array version of: {@link #par_shapes_weld weld} */
	public static ParShapesMesh par_shapes_weld(ParShapesMesh mesh, float epsilon, short[] mapping) {
		long __result = npar_shapes_weld(mesh.address(), epsilon, mapping);
		return ParShapesMesh.create(__result);
	}

}