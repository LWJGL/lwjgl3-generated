/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code rVertexData} &ndash; Vertex data for the mesh</li>
 * <li>{@code unVertexCount} &ndash; Number of vertices in the vertex data</li>
 * <li>{@code IndexData} &ndash; Indices into the vertex data for each triangle</li>
 * <li>{@code unTriangleCount} &ndash; Number of triangles in the mesh. Index count is 3 * TriangleCount.</li>
 * <li>{@code diffuseTextureId} &ndash; Session unique texture identifier. Rendermodels which share the same texture will have the same id. 0 == texture not present.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct RenderModel_t {
    const {@link RenderModelVertex RenderModel_Vertex_t} * rVertexData;
    uint32_t unVertexCount;
    const uint16_t * IndexData;
    uint32_t unTriangleCount;
    TextureID_t diffuseTextureId;
}</code></pre>
 */
public class RenderModel extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		RVERTEXDATA,
		UNVERTEXCOUNT,
		INDEXDATA,
		UNTRIANGLECOUNT,
		DIFFUSETEXTUREID;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		RVERTEXDATA = layout.offsetof(0);
		UNVERTEXCOUNT = layout.offsetof(1);
		INDEXDATA = layout.offsetof(2);
		UNTRIANGLECOUNT = layout.offsetof(3);
		DIFFUSETEXTUREID = layout.offsetof(4);
	}

	RenderModel(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link RenderModel} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public RenderModel(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link RenderModelVertex.Buffer} view of the struct array pointed to by the {@code rVertexData} field. */
	public RenderModelVertex.Buffer rVertexData() { return nrVertexData(address()); }
	/** Returns the value of the {@code unVertexCount} field. */
	public int unVertexCount() { return nunVertexCount(address()); }
	/** Returns a {@link ShortBuffer} view of the data pointed to by the {@code IndexData} field. */
	public ShortBuffer IndexData() { return nIndexData(address()); }
	/** Returns the value of the {@code unTriangleCount} field. */
	public int unTriangleCount() { return nunTriangleCount(address()); }
	/** Returns the value of the {@code diffuseTextureId} field. */
	public int diffuseTextureId() { return ndiffuseTextureId(address()); }

	/** Sets the address of the specified {@link RenderModelVertex.Buffer} to the {@code rVertexData} field. */
	public RenderModel rVertexData(RenderModelVertex.Buffer value) { nrVertexData(address(), value); return this; }
	/** Sets the address of the specified {@link ShortBuffer} to the {@code IndexData} field. */
	public RenderModel IndexData(ShortBuffer value) { nIndexData(address(), value); return this; }
	/** Sets the specified value to the {@code diffuseTextureId} field. */
	public RenderModel diffuseTextureId(int value) { ndiffuseTextureId(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public RenderModel set(
		RenderModelVertex.Buffer rVertexData,
		ShortBuffer IndexData,
		int diffuseTextureId
	) {
		rVertexData(rVertexData);
		IndexData(IndexData);
		diffuseTextureId(diffuseTextureId);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public RenderModel set(RenderModel src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link RenderModel} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static RenderModel malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link RenderModel} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static RenderModel calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link RenderModel} instance allocated with {@link BufferUtils}. */
	public static RenderModel create() {
		return new RenderModel(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link RenderModel} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static RenderModel create(long address) {
		return address == NULL ? null : new RenderModel(address, null);
	}

	/**
	 * Returns a new {@link RenderModel.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link RenderModel.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link RenderModel.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link RenderModel.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link RenderModel} instance allocated on the thread-local {@link MemoryStack}. */
	public static RenderModel mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link RenderModel} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static RenderModel callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link RenderModel} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static RenderModel mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link RenderModel} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static RenderModel callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link RenderModel.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link RenderModel.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link RenderModel.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link RenderModel.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #rVertexData}. */
	public static RenderModelVertex.Buffer nrVertexData(long struct) { return RenderModelVertex.create(memGetAddress(struct + RenderModel.RVERTEXDATA), nunVertexCount(struct)); }
	/** Unsafe version of {@link #unVertexCount}. */
	public static int nunVertexCount(long struct) { return memGetInt(struct + RenderModel.UNVERTEXCOUNT); }
	/** Unsafe version of {@link #IndexData() IndexData}. */
	public static ShortBuffer nIndexData(long struct) { return memShortBuffer(memGetAddress(struct + RenderModel.INDEXDATA), (nunTriangleCount(struct) * 3)); }
	/** Unsafe version of {@link #unTriangleCount}. */
	public static int nunTriangleCount(long struct) { return memGetInt(struct + RenderModel.UNTRIANGLECOUNT); }
	/** Unsafe version of {@link #diffuseTextureId}. */
	public static int ndiffuseTextureId(long struct) { return memGetInt(struct + RenderModel.DIFFUSETEXTUREID); }

	/** Unsafe version of {@link #rVertexData(RenderModelVertex.Buffer) rVertexData}. */
	public static void nrVertexData(long struct, RenderModelVertex.Buffer value) { memPutAddress(struct + RenderModel.RVERTEXDATA, value.address()); nunVertexCount(struct, value.remaining()); }
	/** Sets the specified value to the {@code unVertexCount} field of the specified {@code struct}. */
	public static void nunVertexCount(long struct, int value) { memPutInt(struct + RenderModel.UNVERTEXCOUNT, value); }
	/** Unsafe version of {@link #IndexData(ShortBuffer) IndexData}. */
	public static void nIndexData(long struct, ShortBuffer value) { memPutAddress(struct + RenderModel.INDEXDATA, memAddress(value)); nunTriangleCount(struct, (value.remaining() / 3)); }
	/** Sets the specified value to the {@code unTriangleCount} field of the specified {@code struct}. */
	public static void nunTriangleCount(long struct, int value) { memPutInt(struct + RenderModel.UNTRIANGLECOUNT, value); }
	/** Unsafe version of {@link #diffuseTextureId(int) diffuseTextureId}. */
	public static void ndiffuseTextureId(long struct, int value) { memPutInt(struct + RenderModel.DIFFUSETEXTUREID, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		check(memGetAddress(struct + RenderModel.RVERTEXDATA));
		check(memGetAddress(struct + RenderModel.INDEXDATA));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link RenderModel} structs. */
	public static class Buffer extends StructBuffer<RenderModel, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link RenderModel.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link RenderModel#SIZEOF}, and its mark will be undefined.
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
		protected RenderModel newInstance(long address) {
			return new RenderModel(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link RenderModelVertex.Buffer} view of the struct array pointed to by the {@code rVertexData} field. */
		public RenderModelVertex.Buffer rVertexData() { return RenderModel.nrVertexData(address()); }
		/** Returns the value of the {@code unVertexCount} field. */
		public int unVertexCount() { return RenderModel.nunVertexCount(address()); }
		/** Returns a {@link ShortBuffer} view of the data pointed to by the {@code IndexData} field. */
		public ShortBuffer IndexData() { return RenderModel.nIndexData(address()); }
		/** Returns the value of the {@code unTriangleCount} field. */
		public int unTriangleCount() { return RenderModel.nunTriangleCount(address()); }
		/** Returns the value of the {@code diffuseTextureId} field. */
		public int diffuseTextureId() { return RenderModel.ndiffuseTextureId(address()); }

		/** Sets the address of the specified {@link RenderModelVertex.Buffer} to the {@code rVertexData} field. */
		public RenderModel.Buffer rVertexData(RenderModelVertex.Buffer value) { RenderModel.nrVertexData(address(), value); return this; }
		/** Sets the address of the specified {@link ShortBuffer} to the {@code IndexData} field. */
		public RenderModel.Buffer IndexData(ShortBuffer value) { RenderModel.nIndexData(address(), value); return this; }
		/** Sets the specified value to the {@code diffuseTextureId} field. */
		public RenderModel.Buffer diffuseTextureId(int value) { RenderModel.ndiffuseTextureId(address(), value); return this; }

	}

}