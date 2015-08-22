/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Chunk management hooks. */
public final class ChunkHooks implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		ALLOC,
		DALLOC,
		COMMIT,
		DECOMMIT,
		PURGE,
		SPLIT,
		MERGE;

	static {
		IntBuffer offsets = memAllocInt(7);

		SIZEOF = offsets(memAddress(offsets));

		ALLOC = offsets.get(0);
		DALLOC = offsets.get(1);
		COMMIT = offsets.get(2);
		DECOMMIT = offsets.get(3);
		PURGE = offsets.get(4);
		SPLIT = offsets.get(5);
		MERGE = offsets.get(6);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public ChunkHooks() {
		this(malloc());
	}

	public ChunkHooks(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public ChunkHooks setAlloc(long alloc) { alloc(struct, alloc); return this; }
	public ChunkHooks setDalloc(long dalloc) { dalloc(struct, dalloc); return this; }
	public ChunkHooks setCommit(long commit) { commit(struct, commit); return this; }
	public ChunkHooks setDecommit(long decommit) { decommit(struct, decommit); return this; }
	public ChunkHooks setPurge(long purge) { purge(struct, purge); return this; }
	public ChunkHooks setSplit(long split) { split(struct, split); return this; }
	public ChunkHooks setMerge(long merge) { merge(struct, merge); return this; }

	public long getAlloc() { return alloc(struct); }
	public long getDalloc() { return dalloc(struct); }
	public long getCommit() { return commit(struct); }
	public long getDecommit() { return decommit(struct); }
	public long getPurge() { return purge(struct); }
	public long getSplit() { return split(struct); }
	public long getMerge() { return merge(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		long alloc,
		long dalloc,
		long commit,
		long decommit,
		long purge,
		long split,
		long merge
	) {
		ByteBuffer chunk_hooks_t = malloc();

		alloc(chunk_hooks_t, alloc);
		dalloc(chunk_hooks_t, dalloc);
		commit(chunk_hooks_t, commit);
		decommit(chunk_hooks_t, decommit);
		purge(chunk_hooks_t, purge);
		split(chunk_hooks_t, split);
		merge(chunk_hooks_t, merge);

		return chunk_hooks_t;
	}

	public static void alloc(ByteBuffer chunk_hooks_t, long alloc) { PointerBuffer.put(chunk_hooks_t, chunk_hooks_t.position() + ALLOC, alloc); }
	public static void dalloc(ByteBuffer chunk_hooks_t, long dalloc) { PointerBuffer.put(chunk_hooks_t, chunk_hooks_t.position() + DALLOC, dalloc); }
	public static void commit(ByteBuffer chunk_hooks_t, long commit) { PointerBuffer.put(chunk_hooks_t, chunk_hooks_t.position() + COMMIT, commit); }
	public static void decommit(ByteBuffer chunk_hooks_t, long decommit) { PointerBuffer.put(chunk_hooks_t, chunk_hooks_t.position() + DECOMMIT, decommit); }
	public static void purge(ByteBuffer chunk_hooks_t, long purge) { PointerBuffer.put(chunk_hooks_t, chunk_hooks_t.position() + PURGE, purge); }
	public static void split(ByteBuffer chunk_hooks_t, long split) { PointerBuffer.put(chunk_hooks_t, chunk_hooks_t.position() + SPLIT, split); }
	public static void merge(ByteBuffer chunk_hooks_t, long merge) { PointerBuffer.put(chunk_hooks_t, chunk_hooks_t.position() + MERGE, merge); }

	public static long alloc(ByteBuffer chunk_hooks_t) { return PointerBuffer.get(chunk_hooks_t, chunk_hooks_t.position() + ALLOC); }
	public static long dalloc(ByteBuffer chunk_hooks_t) { return PointerBuffer.get(chunk_hooks_t, chunk_hooks_t.position() + DALLOC); }
	public static long commit(ByteBuffer chunk_hooks_t) { return PointerBuffer.get(chunk_hooks_t, chunk_hooks_t.position() + COMMIT); }
	public static long decommit(ByteBuffer chunk_hooks_t) { return PointerBuffer.get(chunk_hooks_t, chunk_hooks_t.position() + DECOMMIT); }
	public static long purge(ByteBuffer chunk_hooks_t) { return PointerBuffer.get(chunk_hooks_t, chunk_hooks_t.position() + PURGE); }
	public static long split(ByteBuffer chunk_hooks_t) { return PointerBuffer.get(chunk_hooks_t, chunk_hooks_t.position() + SPLIT); }
	public static long merge(ByteBuffer chunk_hooks_t) { return PointerBuffer.get(chunk_hooks_t, chunk_hooks_t.position() + MERGE); }

}