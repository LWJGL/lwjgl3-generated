/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
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
public class ChunkHooks extends Struct {

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

	/** Returns the function address at the {@code alloc} field. */
	public long alloc() { return nalloc(address()); }
	/** Returns the {@code ChunkAlloc} instance at the {@code alloc} field. */
	public ChunkAlloc allocCallback() { return nallocCallback(address()); }
	/** Returns the function address at the {@code dalloc} field. */
	public long dalloc() { return ndalloc(address()); }
	/** Returns the {@code ChunkDalloc} instance at the {@code dalloc} field. */
	public ChunkDalloc dallocCallback() { return ndallocCallback(address()); }
	/** Returns the function address at the {@code commit} field. */
	public long commit() { return ncommit(address()); }
	/** Returns the {@code ChunkCommit} instance at the {@code commit} field. */
	public ChunkCommit commitCallback() { return ncommitCallback(address()); }
	/** Returns the function address at the {@code decommit} field. */
	public long decommit() { return ndecommit(address()); }
	/** Returns the {@code ChunkDecommit} instance at the {@code decommit} field. */
	public ChunkDecommit decommitCallback() { return ndecommitCallback(address()); }
	/** Returns the function address at the {@code purge} field. */
	public long purge() { return npurge(address()); }
	/** Returns the {@code ChunkPurge} instance at the {@code purge} field. */
	public ChunkPurge purgeCallback() { return npurgeCallback(address()); }
	/** Returns the function address at the {@code split} field. */
	public long split() { return nsplit(address()); }
	/** Returns the {@code ChunkSplit} instance at the {@code split} field. */
	public ChunkSplit splitCallback() { return nsplitCallback(address()); }
	/** Returns the function address at the {@code merge} field. */
	public long merge() { return nmerge(address()); }
	/** Returns the {@code ChunkMerge} instance at the {@code merge} field. */
	public ChunkMerge mergeCallback() { return nmergeCallback(address()); }

	/** Sets the specified function address to the {@code alloc} field. */
	public ChunkHooks alloc(long value) { nalloc(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkAlloc} to the {@code alloc} field. */
	public ChunkHooks alloc(ChunkAlloc value) { return alloc(addressSafe(value)); }
	/** Sets the specified function address to the {@code dalloc} field. */
	public ChunkHooks dalloc(long value) { ndalloc(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkDalloc} to the {@code dalloc} field. */
	public ChunkHooks dalloc(ChunkDalloc value) { return dalloc(addressSafe(value)); }
	/** Sets the specified function address to the {@code commit} field. */
	public ChunkHooks commit(long value) { ncommit(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkCommit} to the {@code commit} field. */
	public ChunkHooks commit(ChunkCommit value) { return commit(addressSafe(value)); }
	/** Sets the specified function address to the {@code decommit} field. */
	public ChunkHooks decommit(long value) { ndecommit(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkDecommit} to the {@code decommit} field. */
	public ChunkHooks decommit(ChunkDecommit value) { return decommit(addressSafe(value)); }
	/** Sets the specified function address to the {@code purge} field. */
	public ChunkHooks purge(long value) { npurge(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkPurge} to the {@code purge} field. */
	public ChunkHooks purge(ChunkPurge value) { return purge(addressSafe(value)); }
	/** Sets the specified function address to the {@code split} field. */
	public ChunkHooks split(long value) { nsplit(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkSplit} to the {@code split} field. */
	public ChunkHooks split(ChunkSplit value) { return split(addressSafe(value)); }
	/** Sets the specified function address to the {@code merge} field. */
	public ChunkHooks merge(long value) { nmerge(address(), value); return this; }
	/** Sets the address of the specified {@link ChunkMerge} to the {@code merge} field. */
	public ChunkHooks merge(ChunkMerge value) { return merge(addressSafe(value)); }

	/** Initializes this struct with the specified values. */
	public ChunkHooks set(
		ChunkAlloc alloc,
		ChunkDalloc dalloc,
		ChunkCommit commit,
		ChunkDecommit decommit,
		ChunkPurge purge,
		ChunkSplit split,
		ChunkMerge merge
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
	public static long nalloc(long struct) { return memGetAddress(struct + ChunkHooks.ALLOC); }
	/** Unsafe version of {@link #allocCallback}. */
	public static ChunkAlloc nallocCallback(long struct) { return Callback.create(nalloc(struct)); }
	/** Unsafe version of {@link #dalloc}. */
	public static long ndalloc(long struct) { return memGetAddress(struct + ChunkHooks.DALLOC); }
	/** Unsafe version of {@link #dallocCallback}. */
	public static ChunkDalloc ndallocCallback(long struct) { return Callback.create(ndalloc(struct)); }
	/** Unsafe version of {@link #commit}. */
	public static long ncommit(long struct) { return memGetAddress(struct + ChunkHooks.COMMIT); }
	/** Unsafe version of {@link #commitCallback}. */
	public static ChunkCommit ncommitCallback(long struct) { return Callback.create(ncommit(struct)); }
	/** Unsafe version of {@link #decommit}. */
	public static long ndecommit(long struct) { return memGetAddress(struct + ChunkHooks.DECOMMIT); }
	/** Unsafe version of {@link #decommitCallback}. */
	public static ChunkDecommit ndecommitCallback(long struct) { return Callback.create(ndecommit(struct)); }
	/** Unsafe version of {@link #purge}. */
	public static long npurge(long struct) { return memGetAddress(struct + ChunkHooks.PURGE); }
	/** Unsafe version of {@link #purgeCallback}. */
	public static ChunkPurge npurgeCallback(long struct) { return Callback.create(npurge(struct)); }
	/** Unsafe version of {@link #split}. */
	public static long nsplit(long struct) { return memGetAddress(struct + ChunkHooks.SPLIT); }
	/** Unsafe version of {@link #splitCallback}. */
	public static ChunkSplit nsplitCallback(long struct) { return Callback.create(nsplit(struct)); }
	/** Unsafe version of {@link #merge}. */
	public static long nmerge(long struct) { return memGetAddress(struct + ChunkHooks.MERGE); }
	/** Unsafe version of {@link #mergeCallback}. */
	public static ChunkMerge nmergeCallback(long struct) { return Callback.create(nmerge(struct)); }

	/** Unsafe version of {@link #alloc(long) alloc}. */
	public static void nalloc(long struct, long value) { memPutAddress(struct + ChunkHooks.ALLOC, checkPointer(value)); }
	/** Unsafe version of {@link #dalloc(long) dalloc}. */
	public static void ndalloc(long struct, long value) { memPutAddress(struct + ChunkHooks.DALLOC, checkPointer(value)); }
	/** Unsafe version of {@link #commit(long) commit}. */
	public static void ncommit(long struct, long value) { memPutAddress(struct + ChunkHooks.COMMIT, checkPointer(value)); }
	/** Unsafe version of {@link #decommit(long) decommit}. */
	public static void ndecommit(long struct, long value) { memPutAddress(struct + ChunkHooks.DECOMMIT, checkPointer(value)); }
	/** Unsafe version of {@link #purge(long) purge}. */
	public static void npurge(long struct, long value) { memPutAddress(struct + ChunkHooks.PURGE, checkPointer(value)); }
	/** Unsafe version of {@link #split(long) split}. */
	public static void nsplit(long struct, long value) { memPutAddress(struct + ChunkHooks.SPLIT, checkPointer(value)); }
	/** Unsafe version of {@link #merge(long) merge}. */
	public static void nmerge(long struct, long value) { memPutAddress(struct + ChunkHooks.MERGE, checkPointer(value)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + ChunkHooks.ALLOC));
		checkPointer(memGetAddress(struct + ChunkHooks.DALLOC));
		checkPointer(memGetAddress(struct + ChunkHooks.COMMIT));
		checkPointer(memGetAddress(struct + ChunkHooks.DECOMMIT));
		checkPointer(memGetAddress(struct + ChunkHooks.PURGE));
		checkPointer(memGetAddress(struct + ChunkHooks.SPLIT));
		checkPointer(memGetAddress(struct + ChunkHooks.MERGE));
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
	public static final class Buffer extends StructBuffer<ChunkHooks, Buffer> {

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
			return new ChunkHooks(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the function address at the {@code alloc} field. */
		public long alloc() { return ChunkHooks.nalloc(address()); }
		/** Returns the {@code ChunkAlloc} instance at the {@code alloc} field. */
		public ChunkAlloc allocCallback() { return ChunkHooks.nallocCallback(address()); }
		/** Returns the function address at the {@code dalloc} field. */
		public long dalloc() { return ChunkHooks.ndalloc(address()); }
		/** Returns the {@code ChunkDalloc} instance at the {@code dalloc} field. */
		public ChunkDalloc dallocCallback() { return ChunkHooks.ndallocCallback(address()); }
		/** Returns the function address at the {@code commit} field. */
		public long commit() { return ChunkHooks.ncommit(address()); }
		/** Returns the {@code ChunkCommit} instance at the {@code commit} field. */
		public ChunkCommit commitCallback() { return ChunkHooks.ncommitCallback(address()); }
		/** Returns the function address at the {@code decommit} field. */
		public long decommit() { return ChunkHooks.ndecommit(address()); }
		/** Returns the {@code ChunkDecommit} instance at the {@code decommit} field. */
		public ChunkDecommit decommitCallback() { return ChunkHooks.ndecommitCallback(address()); }
		/** Returns the function address at the {@code purge} field. */
		public long purge() { return ChunkHooks.npurge(address()); }
		/** Returns the {@code ChunkPurge} instance at the {@code purge} field. */
		public ChunkPurge purgeCallback() { return ChunkHooks.npurgeCallback(address()); }
		/** Returns the function address at the {@code split} field. */
		public long split() { return ChunkHooks.nsplit(address()); }
		/** Returns the {@code ChunkSplit} instance at the {@code split} field. */
		public ChunkSplit splitCallback() { return ChunkHooks.nsplitCallback(address()); }
		/** Returns the function address at the {@code merge} field. */
		public long merge() { return ChunkHooks.nmerge(address()); }
		/** Returns the {@code ChunkMerge} instance at the {@code merge} field. */
		public ChunkMerge mergeCallback() { return ChunkHooks.nmergeCallback(address()); }

		/** Sets the specified function address to the {@code alloc} field. */
		public ChunkHooks.Buffer alloc(long value) { ChunkHooks.nalloc(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkAlloc} to the {@code alloc} field. */
		public ChunkHooks.Buffer alloc(ChunkAlloc value) { return alloc(addressSafe(value)); }
		/** Sets the specified function address to the {@code dalloc} field. */
		public ChunkHooks.Buffer dalloc(long value) { ChunkHooks.ndalloc(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkDalloc} to the {@code dalloc} field. */
		public ChunkHooks.Buffer dalloc(ChunkDalloc value) { return dalloc(addressSafe(value)); }
		/** Sets the specified function address to the {@code commit} field. */
		public ChunkHooks.Buffer commit(long value) { ChunkHooks.ncommit(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkCommit} to the {@code commit} field. */
		public ChunkHooks.Buffer commit(ChunkCommit value) { return commit(addressSafe(value)); }
		/** Sets the specified function address to the {@code decommit} field. */
		public ChunkHooks.Buffer decommit(long value) { ChunkHooks.ndecommit(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkDecommit} to the {@code decommit} field. */
		public ChunkHooks.Buffer decommit(ChunkDecommit value) { return decommit(addressSafe(value)); }
		/** Sets the specified function address to the {@code purge} field. */
		public ChunkHooks.Buffer purge(long value) { ChunkHooks.npurge(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkPurge} to the {@code purge} field. */
		public ChunkHooks.Buffer purge(ChunkPurge value) { return purge(addressSafe(value)); }
		/** Sets the specified function address to the {@code split} field. */
		public ChunkHooks.Buffer split(long value) { ChunkHooks.nsplit(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkSplit} to the {@code split} field. */
		public ChunkHooks.Buffer split(ChunkSplit value) { return split(addressSafe(value)); }
		/** Sets the specified function address to the {@code merge} field. */
		public ChunkHooks.Buffer merge(long value) { ChunkHooks.nmerge(address(), value); return this; }
		/** Sets the address of the specified {@link ChunkMerge} to the {@code merge} field. */
		public ChunkHooks.Buffer merge(ChunkMerge value) { return merge(addressSafe(value)); }

	}

}