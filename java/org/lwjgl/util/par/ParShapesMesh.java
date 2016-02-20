/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * The {@code par_shapes.h} mesh structure.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct par_shapes_mesh {
 *     float * points;
 *     int npoints;
 *     PAR_SHAPES_T * triangles;
 *     int ntriangles;
 *     float * normals;
 *     float * tcoords;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>points</td><td>a flat list of 3-tuples (X Y Z X Y Z...) for the vertex positions</td></tr>
 * <tr><td>npoints</td><td>the number of points</td></tr>
 * <tr><td>triangles</td><td>flat list of 3-tuples (I J K I J K...)</td></tr>
 * <tr><td>ntriangles</td><td>the number of triangles</td></tr>
 * <tr><td>normals</td><td>an optional list of 3-tuples (X Y Z X Y Z...) for the vertex normals</td></tr>
 * <tr><td>tcoords</td><td>an optional list of 2-tuples (U V U V U V...) for the vertex texture coordinates</td></tr>
 * </table>
 */
public class ParShapesMesh extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		POINTS,
		NPOINTS,
		TRIANGLES,
		NTRIANGLES,
		NORMALS,
		TCOORDS;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		POINTS = layout.offsetof(0);
		NPOINTS = layout.offsetof(1);
		TRIANGLES = layout.offsetof(2);
		NTRIANGLES = layout.offsetof(3);
		NORMALS = layout.offsetof(4);
		TCOORDS = layout.offsetof(5);
	}

	ParShapesMesh(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link ParShapesMesh} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public ParShapesMesh(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/**
	 * Returns a {@link FloatBuffer} view of the data pointed to by the {@code points} field.
	 *
	 * @param capacity the number of elements in the returned buffer
	 */
	public FloatBuffer points(int capacity) { return npoints(address(), capacity); }
	/** Returns the value of the {@code npoints} field. */
	public int npoints() { return nnpoints(address()); }
	/**
	 * Returns a {@link ShortBuffer} view of the data pointed to by the {@code triangles} field.
	 *
	 * @param capacity the number of elements in the returned buffer
	 */
	public ShortBuffer triangles(int capacity) { return ntriangles(address(), capacity); }
	/** Returns the value of the {@code ntriangles} field. */
	public int ntriangles() { return nntriangles(address()); }
	/**
	 * Returns a {@link FloatBuffer} view of the data pointed to by the {@code normals} field.
	 *
	 * @param capacity the number of elements in the returned buffer
	 */
	public FloatBuffer normals(int capacity) { return nnormals(address(), capacity); }
	/**
	 * Returns a {@link FloatBuffer} view of the data pointed to by the {@code tcoords} field.
	 *
	 * @param capacity the number of elements in the returned buffer
	 */
	public FloatBuffer tcoords(int capacity) { return ntcoords(address(), capacity); }

	// -----------------------------------

	/** Returns a new {@link ParShapesMesh} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static ParShapesMesh malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link ParShapesMesh} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static ParShapesMesh calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link ParShapesMesh} instance allocated with {@link BufferUtils}. */
	public static ParShapesMesh create() {
		return new ParShapesMesh(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link ParShapesMesh} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static ParShapesMesh create(long address) {
		return address == NULL ? null : new ParShapesMesh(address, null);
	}

	/**
	 * Returns a new {@link ParShapesMesh.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link ParShapesMesh.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link ParShapesMesh.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link ParShapesMesh.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #points(int) points}. */
	public static FloatBuffer npoints(long struct, int capacity) { return memFloatBuffer(memGetAddress(struct + ParShapesMesh.POINTS), capacity); }
	/** Unsafe version of {@link #npoints}. */
	public static int nnpoints(long struct) { return memGetInt(struct + ParShapesMesh.NPOINTS); }
	/** Unsafe version of {@link #triangles(int) triangles}. */
	public static ShortBuffer ntriangles(long struct, int capacity) { return memShortBuffer(memGetAddress(struct + ParShapesMesh.TRIANGLES), capacity); }
	/** Unsafe version of {@link #ntriangles}. */
	public static int nntriangles(long struct) { return memGetInt(struct + ParShapesMesh.NTRIANGLES); }
	/** Unsafe version of {@link #normals(int) normals}. */
	public static FloatBuffer nnormals(long struct, int capacity) { return memFloatBuffer(memGetAddress(struct + ParShapesMesh.NORMALS), capacity); }
	/** Unsafe version of {@link #tcoords(int) tcoords}. */
	public static FloatBuffer ntcoords(long struct, int capacity) { return memFloatBuffer(memGetAddress(struct + ParShapesMesh.TCOORDS), capacity); }

	// -----------------------------------

	/** An array of {@link ParShapesMesh} structs. */
	public static final class Buffer extends StructBuffer<ParShapesMesh, Buffer> {

		/**
		 * Creates a new {@link ParShapesMesh.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link ParShapesMesh#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected ParShapesMesh newInstance(long address) {
			return new ParShapesMesh(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/**
		 * Returns a {@link FloatBuffer} view of the data pointed to by the {@code points} field.
		 *
		 * @param capacity the number of elements in the returned buffer
		 */
		public FloatBuffer points(int capacity) { return ParShapesMesh.npoints(address(), capacity); }
		/** Returns the value of the {@code npoints} field. */
		public int npoints() { return ParShapesMesh.nnpoints(address()); }
		/**
		 * Returns a {@link ShortBuffer} view of the data pointed to by the {@code triangles} field.
		 *
		 * @param capacity the number of elements in the returned buffer
		 */
		public ShortBuffer triangles(int capacity) { return ParShapesMesh.ntriangles(address(), capacity); }
		/** Returns the value of the {@code ntriangles} field. */
		public int ntriangles() { return ParShapesMesh.nntriangles(address()); }
		/**
		 * Returns a {@link FloatBuffer} view of the data pointed to by the {@code normals} field.
		 *
		 * @param capacity the number of elements in the returned buffer
		 */
		public FloatBuffer normals(int capacity) { return ParShapesMesh.nnormals(address(), capacity); }
		/**
		 * Returns a {@link FloatBuffer} view of the data pointed to by the {@code tcoords} field.
		 *
		 * @param capacity the number of elements in the returned buffer
		 */
		public FloatBuffer tcoords(int capacity) { return ParShapesMesh.ntcoords(address(), capacity); }

	}

}