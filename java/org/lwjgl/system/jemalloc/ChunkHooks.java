/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Comprises function pointers which are described individually below. jemalloc uses these functions to manage chunk lifetime, which starts off with
 * allocation of mapped committed memory, in the simplest case followed by deallocation. However, there are performance and platform reasons to retain chunks
 * for later reuse. Cleanup attempts cascade from deallocation to decommit to purging, which gives the chunk management functions opportunities to reject the
 * most permanent cleanup operations in favor of less permanent (and often less costly) operations. The chunk splitting and merging operations can also be
 * opted out of, but this is mainly intended to support platforms on which virtual memory mappings provided by the operating system kernel do not
 * automatically coalesce and split, e.g. Windows.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code alloc} &ndash; the chunk allocation hook</li>
 * <li>{@code dalloc} &ndash; the chunk deallocation hook</li>
 * <li>{@code commit} &ndash; the chunk commit hook</li>
 * <li>{@code decommit} &ndash; the chunk decommit hook</li>
 * <li>{@code purge} &ndash; the chunk purge hook</li>
 * <li>{@code split} &ndash; the chunk split hook</li>
 * <li>{@code merge} &ndash; the chunk merge hook</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct chunk_hooks_t {
    chunk_alloc_t alloc;
    chunk_dalloc_t dalloc;
    chunk_commit_t commit;
    chunk_decommit_t decommit;
    chunk_purge_t purge;
    chunk_split_t split;
    chunk_merge_t merge;
}</code></pre>
 */
public class ChunkHooks extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		ALLOC = layout.offsetof(0);
		DALLOC = layout.offsetof(1);
		COMMIT = layout.offsetof(2);
		DECOMMIT = layout.offsetof(3);
		PURGE = layout.offsetof(4);
		SPLIT = layout.offsetof(5);
		MERGE = layout.offsetof(6);
	}

	ChunkHooks(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link ChunkHooks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public ChunkHooks(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code alloc} field. */
	public ChunkAlloc alloc() { return nalloc(address()); }
	/** Returns the value of the {@code dalloc} field. */
	public ChunkDalloc dalloc() { return ndalloc(address()); }
	/** Returns the value of the {@code commit} field. */
	public ChunkCommit commit() { return ncommit(address()); }
	/** Returns the value of the {@code decommit} field. */
	public ChunkDecommit decommit() { return ndecommit(address()); }
	/** Returns the value of the {@code purge} field. */
	public ChunkPurge purge() { return npurge(address()); }
	/** Returns the value of the {@code split} field. */
	public ChunkSplit split() { return nsplit(address()); }
	/** Returns the value of the {@code merge} field. */
	public ChunkMerge merge() { return nmerge(address()); }

	/** Sets the specified value to the {@code alloc} field. */
	public ChunkHooks alloc(ChunkAllocI value) { nalloc(address(), value); return this; }
	/** Sets the specified value to the {@code dalloc} field. */
	public ChunkHooks dalloc(ChunkDallocI value) { ndalloc(address(), value); return this; }
	/** Sets the specified value to the {@code commit} field. */
	public ChunkHooks commit(ChunkCommitI value) { ncommit(address(), value); return this; }
	/** Sets the specified value to the {@code decommit} field. */
	public ChunkHooks decommit(ChunkDecommitI value) { ndecommit(address(), value); return this; }
	/** Sets the specified value to the {@code purge} field. */
	public ChunkHooks purge(ChunkPurgeI value) { npurge(address(), value); return this; }
	/** Sets the specified value to the {@code split} field. */
	public ChunkHooks split(ChunkSplitI value) { nsplit(address(), value); return this; }
	/** Sets the specified value to the {@code merge} field. */
	public ChunkHooks merge(ChunkMergeI value) { nmerge(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public ChunkHooks set(
		ChunkAllocI alloc,
		ChunkDallocI dalloc,
		ChunkCommitI commit,
		ChunkDecommitI decommit,
		ChunkPurgeI purge,
		ChunkSplitI split,
		ChunkMergeI merge
	) {
		alloc(alloc);
		dalloc(dalloc);
		commit(commit);
		decommit(decommit);
		purge(purge);
		split(split);
		merge(merge);

		return this;
	}

	/** Unsafe version of {@link #set(ChunkHooks) set}. */
	public ChunkHooks nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public ChunkHooks set(ChunkHooks src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link ChunkHooks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static ChunkHooks malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link ChunkHooks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static ChunkHooks calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link ChunkHooks} instance allocated with {@link BufferUtils}. */
	public static ChunkHooks create() {
		return new ChunkHooks(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link ChunkHooks} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static ChunkHooks create(long address) {
		return address == NULL ? null : new ChunkHooks(address, null);
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link ChunkHooks.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link ChunkHooks} instance allocated on the thread-local {@link MemoryStack}. */
	public static ChunkHooks mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link ChunkHooks} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static ChunkHooks callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link ChunkHooks} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static ChunkHooks mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link ChunkHooks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static ChunkHooks callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link ChunkHooks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #alloc}. */
	public static ChunkAlloc nalloc(long struct) { return ChunkAlloc.create(memGetAddress(struct + ChunkHooks.ALLOC)); }
	/** Unsafe version of {@link #dalloc}. */
	public static ChunkDalloc ndalloc(long struct) { return ChunkDalloc.create(memGetAddress(struct + ChunkHooks.DALLOC)); }
	/** Unsafe version of {@link #commit}. */
	public static ChunkCommit ncommit(long struct) { return ChunkCommit.create(memGetAddress(struct + ChunkHooks.COMMIT)); }
	/** Unsafe version of {@link #decommit}. */
	public static ChunkDecommit ndecommit(long struct) { return ChunkDecommit.create(memGetAddress(struct + ChunkHooks.DECOMMIT)); }
	/** Unsafe version of {@link #purge}. */
	public static ChunkPurge npurge(long struct) { return ChunkPurge.create(memGetAddress(struct + ChunkHooks.PURGE)); }
	/** Unsafe version of {@link #split}. */
	public static ChunkSplit nsplit(long struct) { return ChunkSplit.create(memGetAddress(struct + ChunkHooks.SPLIT)); }
	/** Unsafe version of {@link #merge}. */
	public static ChunkMerge nmerge(long struct) { return ChunkMerge.create(memGetAddress(struct + ChunkHooks.MERGE)); }

	/** Unsafe version of {@link #alloc(ChunkAllocI) alloc}. */
	public static void nalloc(long struct, ChunkAllocI value) { memPutAddress(struct + ChunkHooks.ALLOC, value.address()); }
	/** Unsafe version of {@link #dalloc(ChunkDallocI) dalloc}. */
	public static void ndalloc(long struct, ChunkDallocI value) { memPutAddress(struct + ChunkHooks.DALLOC, value.address()); }
	/** Unsafe version of {@link #commit(ChunkCommitI) commit}. */
	public static void ncommit(long struct, ChunkCommitI value) { memPutAddress(struct + ChunkHooks.COMMIT, value.address()); }
	/** Unsafe version of {@link #decommit(ChunkDecommitI) decommit}. */
	public static void ndecommit(long struct, ChunkDecommitI value) { memPutAddress(struct + ChunkHooks.DECOMMIT, value.address()); }
	/** Unsafe version of {@link #purge(ChunkPurgeI) purge}. */
	public static void npurge(long struct, ChunkPurgeI value) { memPutAddress(struct + ChunkHooks.PURGE, value.address()); }
	/** Unsafe version of {@link #split(ChunkSplitI) split}. */
	public static void nsplit(long struct, ChunkSplitI value) { memPutAddress(struct + ChunkHooks.SPLIT, value.address()); }
	/** Unsafe version of {@link #merge(ChunkMergeI) merge}. */
	public static void nmerge(long struct, ChunkMergeI value) { memPutAddress(struct + ChunkHooks.MERGE, value.address()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		check(memGetAddress(struct + ChunkHooks.ALLOC));
		check(memGetAddress(struct + ChunkHooks.DALLOC));
		check(memGetAddress(struct + ChunkHooks.COMMIT));
		check(memGetAddress(struct + ChunkHooks.DECOMMIT));
		check(memGetAddress(struct + ChunkHooks.PURGE));
		check(memGetAddress(struct + ChunkHooks.SPLIT));
		check(memGetAddress(struct + ChunkHooks.MERGE));
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

	/** An array of {@link ChunkHooks} structs. */
	public static class Buffer extends StructBuffer<ChunkHooks, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link ChunkHooks.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link ChunkHooks#SIZEOF}, and its mark will be undefined.
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
		protected ChunkHooks newInstance(long address) {
			return new ChunkHooks(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code alloc} field. */
		public ChunkAlloc alloc() { return ChunkHooks.nalloc(address()); }
		/** Returns the value of the {@code dalloc} field. */
		public ChunkDalloc dalloc() { return ChunkHooks.ndalloc(address()); }
		/** Returns the value of the {@code commit} field. */
		public ChunkCommit commit() { return ChunkHooks.ncommit(address()); }
		/** Returns the value of the {@code decommit} field. */
		public ChunkDecommit decommit() { return ChunkHooks.ndecommit(address()); }
		/** Returns the value of the {@code purge} field. */
		public ChunkPurge purge() { return ChunkHooks.npurge(address()); }
		/** Returns the value of the {@code split} field. */
		public ChunkSplit split() { return ChunkHooks.nsplit(address()); }
		/** Returns the value of the {@code merge} field. */
		public ChunkMerge merge() { return ChunkHooks.nmerge(address()); }

		/** Sets the specified value to the {@code alloc} field. */
		public ChunkHooks.Buffer alloc(ChunkAllocI value) { ChunkHooks.nalloc(address(), value); return this; }
		/** Sets the specified value to the {@code dalloc} field. */
		public ChunkHooks.Buffer dalloc(ChunkDallocI value) { ChunkHooks.ndalloc(address(), value); return this; }
		/** Sets the specified value to the {@code commit} field. */
		public ChunkHooks.Buffer commit(ChunkCommitI value) { ChunkHooks.ncommit(address(), value); return this; }
		/** Sets the specified value to the {@code decommit} field. */
		public ChunkHooks.Buffer decommit(ChunkDecommitI value) { ChunkHooks.ndecommit(address(), value); return this; }
		/** Sets the specified value to the {@code purge} field. */
		public ChunkHooks.Buffer purge(ChunkPurgeI value) { ChunkHooks.npurge(address(), value); return this; }
		/** Sets the specified value to the {@code split} field. */
		public ChunkHooks.Buffer split(ChunkSplitI value) { ChunkHooks.nsplit(address(), value); return this; }
		/** Sets the specified value to the {@code merge} field. */
		public ChunkHooks.Buffer merge(ChunkMergeI value) { ChunkHooks.nmerge(address(), value); return this; }

	}

}